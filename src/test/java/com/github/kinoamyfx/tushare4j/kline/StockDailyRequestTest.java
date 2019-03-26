package com.github.kinoamyfx.tushare4j.kline;

import com.github.kinoamyfx.tushare4j.TuShareClientTest;
import com.github.kinoamyfx.tushare4j.core.TuShareException;
import com.github.kinoamyfx.tushare4j.stock.KLine;
import com.github.kinoamyfx.tushare4j.stock.StockDailyRequest;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class StockDailyRequestTest {

    @Test
    public void test() throws IOException, TuShareException {
        StockDailyRequest request = new StockDailyRequest();
        request.setTsCode("000001.SZ");

        List<KLine> call = TuShareClientTest.client.call(request);

        Assert.assertFalse(call.isEmpty());
    }
}