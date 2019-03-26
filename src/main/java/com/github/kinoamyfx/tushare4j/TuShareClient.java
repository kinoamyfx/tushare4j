package com.github.kinoamyfx.tushare4j;

import com.github.kinoamyfx.tushare4j.core.FieldFilter.FieldExclude;
import com.github.kinoamyfx.tushare4j.core.FieldFilter.FieldInclude;
import com.github.kinoamyfx.tushare4j.core.*;
import com.github.kinoamyfx.tushare4j.market.KLine;
import com.github.kinoamyfx.tushare4j.market.StockDailyRequest;
import com.github.kinoamyfx.tushare4j.utils.ClassUtils;
import com.github.kinoamyfx.tushare4j.utils.JsonUtils;
import com.github.kinoamyfx.tushare4j.utils.ThreadPool;
import lombok.extern.slf4j.Slf4j;
import okhttp3.*;
import org.apache.commons.lang3.reflect.TypeUtils;

import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.*;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import java.util.stream.Collectors;

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
        List<String> fields = ClassUtils.resolveFields(responseType);

        return call(tsRequest, fields);
    }


    public <R> List<R> call(TsRequest<R> tsRequest, FieldInclude... includes) throws IOException, TuShareException {

        List<String> fields =
                Arrays.asList(includes).parallelStream().map(FieldInclude::getName).collect(Collectors.toList());

        return call(tsRequest, fields);
    }

    public <R> List<R> call(TsRequest<R> tsRequest, FieldExclude... excludes) throws IOException, TuShareException {
        Class<R> responseType = getResponseType(tsRequest);
        List<String> fields = ClassUtils.resolveFields(responseType);

        List<String> excludeFields = Arrays.asList(excludes).parallelStream().map(FieldExclude::getName).collect(Collectors.toList());

        fields.removeAll(excludeFields);

        return call(tsRequest, fields);
    }

    private <R> List<R> call(TsRequest<R> tsRequest, List<String> fields) throws IOException, TuShareException {

        if (fields.isEmpty()) {
            return Collections.emptyList();
        }

        //构造请求
        TsBody body = new TsBody(tsRequest.apiName(), token, fields, resolveParams(tsRequest));

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
        return
                CompletableFuture.supplyAsync(() -> {
                    try {
                        return call(tsRequest);
                    } catch (IOException | TuShareException e) {
                        throw new RuntimeException(e);
                    }
                }, ThreadPool.io());
    }

    /**
     * @param <R> example: {@link StockDailyRequest} is {@link KLine}
     * @return 返回request对应的response类型
     */
    @SuppressWarnings("unchecked")
    private <R> Class<R> getResponseType(TsRequest<R> tsRequest) {

        Map<TypeVariable<?>, Type> typeArguments = TypeUtils.getTypeArguments(tsRequest.getClass(), TsRequest.class);

        for (Map.Entry<TypeVariable<?>, Type> entry : typeArguments.entrySet()) {
            if (entry.getKey().getName().equals("R")) {
                if (entry.getValue() instanceof ParameterizedType) {
                    return (Class) ((ParameterizedType) entry.getValue()).getRawType();
                }

                if (entry.getValue() instanceof Class) {
                    return (Class) entry.getValue();
                }
            }
        }
        throw new IllegalStateException();
    }

    /**
     * @return
     */
    private Map<String, String> resolveParams(Object o) {

        Map<String, String> params = new HashMap<>();

        for (Field f : o.getClass().getDeclaredFields()) {
            Optional.ofNullable(f.getAnnotation(TsParam.class)).ifPresent(tsParam -> {
                f.setAccessible(true);
                try {
                    Object value = f.get(o);

                    if (tsParam.required() && value == null) {
                        throw new IllegalStateException(tsParam.name() + " required");
                    }

                    if (value == null) {
                        return;
                    }

                    params.put(tsParam.name(), value.toString());
                } catch (IllegalAccessException | IllegalStateException e) {
                    log.error("", e);
                }
            });
        }
        return params;
    }
}

