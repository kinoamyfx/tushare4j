package com.github.kinoamyfx.tushare4j.kline;

import com.github.kinoamyfx.tushare4j.TuShareClientTest;
import com.github.kinoamyfx.tushare4j.core.TuShareException;
import com.github.kinoamyfx.tushare4j.stock.KLine;
import com.github.kinoamyfx.tushare4j.stock.StockDailyKRequest;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class StockDailyKRequestTest {

    @Test
    public void test() throws IOException, TuShareException {

        StockDailyKRequest request = new StockDailyKRequest();

        request.setTsCode("000001.SZ");

        List<KLine> call = TuShareClientTest.client.call(request);

        Assert.assertFalse(call.isEmpty());
    }
}