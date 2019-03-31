package com.github.kinoamyfx.tushare4j;

import com.github.kinoamyfx.tushare4j.core.FieldFilter.FieldExcluder;
import com.github.kinoamyfx.tushare4j.core.FieldFilter.FieldIncluder;
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


    public <R> List<R> call(TsRequest<R> tsRequest, FieldIncluder... includers) throws IOException, TuShareException {

        List<String> fields =
                Arrays.asList(includers).parallelStream().map(FieldIncluder::name).collect(Collectors.toList());

        return call(tsRequest, fields);
    }

    public <R> List<R> call(TsRequest<R> tsRequest, FieldExcluder... excluders) throws IOException, TuShareException {
        return call(tsRequest, excludeFields(tsRequest, excluders));
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
        if (tsResponseWrapper.code() != 0 || tsResponseWrapper.data() == null) {
            throw new TuShareException(tsResponseWrapper.code(), tsResponseWrapper.msg());
        }

        //将array json 变成 object json
        String itemsJson = tsResponseWrapper.data().toString();

        //返回
        return JsonUtils.parseList(itemsJson, getResponseType(tsRequest));
    }

    /**
     * 异步执行请求
     *
     * @see TuShareClient#call(TsRequest)
     */
    private <R> CompletionStage<List<R>> asyncCall(TsRequest<R> tsRequest, List<String> fields) {
        CompletableFuture<List<R>> future = new CompletableFuture<>();

        ThreadPool.io().submit(() -> {
            try {
                List<R> value = call(tsRequest, fields);
                future.complete(value);
            } catch (IOException | TuShareException e) {
                future.completeExceptionally(e);
            }
        });
        return future;
    }

    /**
     * 异步执行请求
     *
     * @see TuShareClient#call(TsRequest)
     */
    public <R> CompletionStage<List<R>> asyncCall(TsRequest<R> tsRequest) {
        Class<R> responseType = getResponseType(tsRequest);
        List<String> fields = resolveTsFields(responseType);

        return asyncCall(tsRequest, fields);
    }

    /**
     * 异步执行请求
     *
     * @see TuShareClient#call(TsRequest)
     */
    public <R> CompletionStage<List<R>> asyncCall(TsRequest<R> tsRequest, FieldIncluder... includers) {

        List<String> fields =
                Arrays.asList(includers).parallelStream().map(FieldIncluder::name).collect(Collectors.toList());

        return asyncCall(tsRequest, fields);
    }

    public <R> CompletionStage<List<R>> asyncCall(TsRequest<R> tsRequest, FieldExcluder... excluders) {
        List<String> fields = excludeFields(tsRequest, excluders);
        return asyncCall(tsRequest, fields);
    }

    private <R> List<String> excludeFields(TsRequest<R> tsRequest, FieldExcluder[] excluders) {
        Class<R> responseType = getResponseType(tsRequest);
        List<String> fields = resolveTsFields(responseType);
        List<String> excludeFields = Arrays.asList(excluders).parallelStream().map(FieldExcluder::name).collect(Collectors.toList());
        fields.removeAll(excludeFields);
        return fields;
    }
}

