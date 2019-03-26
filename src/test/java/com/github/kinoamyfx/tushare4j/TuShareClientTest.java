package com.github.kinoamyfx.tushare4j;

import com.github.kinoamyfx.tushare4j.core.FieldFilter;
import com.github.kinoamyfx.tushare4j.core.TuShareException;
import com.github.kinoamyfx.tushare4j.market.KLine;
import com.github.kinoamyfx.tushare4j.market.StockDailyRequest;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.List;
import java.util.Properties;

public class TuShareClientTest {
    public static TuShareClient client;

    static {
        try {
            Properties properties = new Properties();
            properties.load(Thread.class.getResourceAsStream("/token.properties"));
            String token = properties.getProperty("token").trim();
            client = new TuShareClient(token);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @Test
    public void testRequest() throws IOException, TuShareException {
        StockDailyRequest request = new StockDailyRequest().setTsCode("000001.SZ");
        List<KLine> call = TuShareClientTest.client.call(request);
        Assert.assertFalse(call.isEmpty());
    }

    @Test
    public void testIncludeRequest() throws IOException, TuShareException {
        StockDailyRequest request = new StockDailyRequest().setTsCode("000001.SZ");
        List<KLine> call = TuShareClientTest.client.call(request, FieldFilter.include("ts_code", "open"));


        Assert.assertFalse(call.isEmpty());

        call.parallelStream().forEach(kLine -> Assert.assertNotNull(kLine.getTs_code()));
        call.parallelStream().forEach(kLine -> Assert.assertNotNull(kLine.getOpen()));
        call.parallelStream().forEach(kLine -> Assert.assertNull(kLine.getTrade_date()));
    }

    @Test
    public void testExcludeRequest() throws IOException, TuShareException {
        StockDailyRequest request = new StockDailyRequest().setTsCode("000001.SZ");
        List<KLine> call = TuShareClientTest.client.call(request, FieldFilter.exclude("trade_date", "pre_close"));

        Assert.assertFalse(call.isEmpty());
        call.parallelStream().forEach(kLine -> Assert.assertNotNull(kLine.getTs_code()));
        call.parallelStream().forEach(kLine -> Assert.assertNull(kLine.getTrade_date()));
        call.parallelStream().forEach(kLine -> Assert.assertNull(kLine.getPre_close()));
    }
}