package com.github.kinoamyfx.tushare4j;

import com.github.kinoamyfx.tushare4j.core.TsBody;
import com.github.kinoamyfx.tushare4j.core.TsRequest;
import com.github.kinoamyfx.tushare4j.core.TsResponseWrapper;
import com.github.kinoamyfx.tushare4j.core.TuShareException;
import com.github.kinoamyfx.tushare4j.stock.KLine;
import com.github.kinoamyfx.tushare4j.stock.StockDailyRequest;
import com.github.kinoamyfx.tushare4j.utils.JSONUtils;
import com.github.kinoamyfx.tushare4j.utils.ThreadPool;
import lombok.extern.slf4j.Slf4j;
import okhttp3.*;
import org.apache.commons.lang3.reflect.TypeUtils;

import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;

@Slf4j
public class TuShareClient {

    private String token;
    private OkHttpClient okHttp;

    public TuShareClient(String token) {
        this.token = token;
        this.okHttp = new OkHttpClient.Builder().build();
    }

    public <R> List<R> call(TsRequest<R> tsRequest) throws IOException, TuShareException {

        //构造请求
        TsBody body = new TsBody(tsRequest.apiName(), token, tsRequest.fields(), tsRequest.params());
        Request okRequest = new Request.Builder()
                .url("http://api.tushare.pro")
                .post(RequestBody.create(MediaType.parse("application/json"), JSONUtils.toJson(body)))
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
        TsResponseWrapper tsResponseWrapper = JSONUtils.parseObject(s, TsResponseWrapper.class);

        //当服务器返回异常码时
        if (tsResponseWrapper.getCode() != 0 || tsResponseWrapper.getData() == null) {
            throw new TuShareException(tsResponseWrapper.getCode(), tsResponseWrapper.getMsg());
        }

        //将array json 变成 object json
        String itemsJson = tsResponseWrapper.getData().toString();

        //返回
        return JSONUtils.parseList(itemsJson, getResponseType(tsRequest));
    }

    /**
     * 异步执行请求
     *
     * @see TuShareClient#call(TsRequest)
     */
    public <R> CompletionStage<List<R>> submit(TsRequest<R> tsRequest) {
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
}

