package com.github.kinoamyfx.tushare4j;

import com.github.kinoamyfx.tushare4j.core.FieldFilter;
import com.github.kinoamyfx.tushare4j.core.TsDate;
import com.github.kinoamyfx.tushare4j.core.TuShareException;
import com.github.kinoamyfx.tushare4j.market.KLine;
import com.github.kinoamyfx.tushare4j.market.StockDailyRequest;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.ExecutionException;

public class TuShareClientTest {
    public static TuShareClient client;

    static {
        String token = System.getenv("TUSHARE_TOKEN");
        client = new TuShareClient(token);
    }


    @Test
    public void testRequest() throws IOException, TuShareException, ExecutionException, InterruptedException {
        StockDailyRequest request = new StockDailyRequest()
                .tsCode("000001.SZ")
                .tradeDate(TsDate.parse("20190328"));
        List<KLine> call = TuShareClientTest.client.call(request);

        Assert.assertFalse(call.isEmpty());

        CompletionStage<List<KLine>> stage = client.asyncCall(request);

        call = stage.toCompletableFuture().get();

        Assert.assertFalse(call.isEmpty());
    }

    @Test
    public void testIncludeRequest() throws IOException, TuShareException, ExecutionException, InterruptedException {
        StockDailyRequest request = new StockDailyRequest().tsCode("000001.SZ").tradeDate(TsDate.parse("20190328"));
        FieldFilter.FieldIncluder[] includers = FieldFilter.include("ts_code", "open");
        List<KLine> call = TuShareClientTest.client.call(request, includers);


        Assert.assertFalse(call.isEmpty());

        call.parallelStream().forEach(kLine -> Assert.assertNotNull(kLine.ts_code()));
        call.parallelStream().forEach(kLine -> Assert.assertNotNull(kLine.open()));
        call.parallelStream().forEach(kLine -> Assert.assertNull(kLine.trade_date()));


        CompletionStage<List<KLine>> stage = client.asyncCall(request, includers);
        call = stage.toCompletableFuture().get();
        call.parallelStream().forEach(kLine -> Assert.assertNotNull(kLine.ts_code()));
        call.parallelStream().forEach(kLine -> Assert.assertNotNull(kLine.open()));
        call.parallelStream().forEach(kLine -> Assert.assertNull(kLine.trade_date()));
    }

    @Test
    public void testExcludeRequest() throws IOException, TuShareException, ExecutionException, InterruptedException {
        StockDailyRequest request = new StockDailyRequest().tsCode("000001.SZ").tradeDate(TsDate.parse("20190328"));


        FieldFilter.FieldExcluder[] excluders = FieldFilter.exclude("trade_date", "pre_close");
        List<KLine> call = TuShareClientTest.client.call(request, excluders);

        Assert.assertFalse(call.isEmpty());
        call.parallelStream().forEach(kLine -> Assert.assertNotNull(kLine.ts_code()));
        call.parallelStream().forEach(kLine -> Assert.assertNull(kLine.trade_date()));
        call.parallelStream().forEach(kLine -> Assert.assertNull(kLine.pre_close()));


        CompletionStage<List<KLine>> stage = client.asyncCall(request, excluders);
        call = stage.toCompletableFuture().get();
        call.parallelStream().forEach(kLine -> Assert.assertNotNull(kLine.ts_code()));
        call.parallelStream().forEach(kLine -> Assert.assertNull(kLine.trade_date()));
        call.parallelStream().forEach(kLine -> Assert.assertNull(kLine.pre_close()));
    }
}