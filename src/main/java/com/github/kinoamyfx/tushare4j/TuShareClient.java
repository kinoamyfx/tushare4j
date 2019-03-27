package com.github.kinoamyfx.tushare4j;

import com.github.kinoamyfx.tushare4j.core.FieldFilter.FieldExclude;
import com.github.kinoamyfx.tushare4j.core.FieldFilter.FieldInclude;
import com.github.kinoamyfx.tushare4j.core.TsBody;
import com.github.kinoamyfx.tushare4j.core.TsRequest;
import com.github.kinoamyfx.tushare4j.core.TsResponseWrapper;
import com.github.kinoamyfx.tushare4j.core.TuShareException;
import com.github.kinoamyfx.tushare4j.utils.JsonUtils;
import com.github.kinoamyfx.tushare4j.utils.ThreadPool;
import lombok.extern.slf4j.Slf4j;
import okhttp3.*;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import java.util.stream.Collectors;

import static com.github.kinoamyfx.tushare4j.utils.TuShareUtils.*;

@Slf4j
public class TuShareClient {

    private String token;
    private OkHttpClient okHttp;

    public TuShareClient(String token) {
        this.token = token;
        this.okHttp = new OkHttpClient.Builder().build();
    }


    public <R> List<R> call(TsRequest<R> tsRequest) throws IOException, TuShareException {
        Class<R> responseType = getResponseType(tsRequest);
        List<String> fields = resolveTsFields(responseType);
        return call(tsRequest, fields);
    }


    public <R> List<R> call(TsRequest<R> tsRequest, FieldInclude... includes) throws IOException, TuShareException {

        List<String> fields =
                Arrays.asList(includes).parallelStream().map(FieldInclude::getName).collect(Collectors.toList());

        return call(tsRequest, fields);
    }

    public <R> List<R> call(TsRequest<R> tsRequest, FieldExclude... excludes) throws IOException, TuShareException {
        Class<R> responseType = getResponseType(tsRequest);
        List<String> fields = resolveTsFields(responseType);

        List<String> excludeFields = Arrays.asList(excludes).parallelStream().map(FieldExclude::getName).collect(Collectors.toList());

        fields.removeAll(excludeFields);

        return call(tsRequest, fields);
    }

    private <R> List<R> call(TsRequest<R> tsRequest, List<String> fields) throws IOException, TuShareException {

        if (fields.isEmpty()) {
            return Collections.emptyList();
        }

        //构造请求
        TsBody body = new TsBody(tsRequest.apiName(), token, fields, resolveTsParams(tsRequest));

        Request okRequest = new Request.Builder()
                .url("http://api.tushare.pro")
                .post(RequestBody.create(MediaType.parse("application/json"), JsonUtils.toJson(body)))
                .build();

        log.debug("REQUEST_BODY -> {}", body);

        //同步执行请求
        Call call = okHttp.newCall(okRequest);
        Response okResponse = call.execute();

        //当网络故障时
        if (!okResponse.isSuccessful() || okResponse.body() == null) {
            throw new IOException();
        }

        String s = okResponse.body().string();
        if (s == null) {
            throw new IOException();
        }

        //反序列化结果
        TsResponseWrapper tsResponseWrapper = JsonUtils.parseObject(s, TsResponseWrapper.class);

        //当服务器返回异常码时
        if (tsResponseWrapper.getCode() != 0 || tsResponseWrapper.getData() == null) {
            throw new TuShareException(tsResponseWrapper.getCode(), tsResponseWrapper.getMsg());
        }

        //将array json 变成 object json
        String itemsJson = tsResponseWrapper.getData().toString();

        //返回
        return JsonUtils.parseList(itemsJson, getResponseType(tsRequest));
    }

    /**
     * 异步执行请求
     *
     * @see TuShareClient#call(TsRequest)
     */
    public <R> CompletionStage<List<R>> asyncCall(TsRequest<R> tsRequest) {
        CompletableFuture<List<R>> future = new CompletableFuture<>();
        ThreadPool.io().submit(() -> {
            try {
                List<R> value = call(tsRequest);
                future.complete(value);
            } catch (IOException | TuShareException e) {
                future.completeExceptionally(e);
            }
        });
        return future;
    }
}

