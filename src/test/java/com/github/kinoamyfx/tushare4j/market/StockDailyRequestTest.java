package com.github.kinoamyfx.tushare4j.market;

import com.github.kinoamyfx.tushare4j.CodeUtils;
import com.github.kinoamyfx.tushare4j.core.TsDate;
import com.github.kinoamyfx.tushare4j.core.TuShareException;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.time.temporal.ChronoUnit;
import java.util.Collections;
import java.util.List;

import static com.github.kinoamyfx.tushare4j.TuShareClientTest.client;

public class StockDailyRequestTest {

    @Test
    public void test() throws IOException, TuShareException {

        StockDailyRequest request = new StockDailyRequest()
                .tsCode("000001.SZ")
                .startDate(TsDate.today().minus(30, ChronoUnit.DAYS))
                .endDate(TsDate.today());

        Assert.assertEquals(request.tsCode(), "000001.SZ");
        Assert.assertEquals(request.startDate(), TsDate.today().minus(30, ChronoUnit.DAYS));
        Assert.assertEquals(request.endDate(), TsDate.today());

        CodeUtils.assertDataMethod(request);

        List<KLine> call = client.call(request);

        CodeUtils.assertFields(call, Collections.emptyList());

        request = new StockDailyRequest()
                .tsCode("000001.SZ")
                .tradeDate(TsDate.of(2019, 3, 29));

        Assert.assertEquals(request.tradeDate(), TsDate.of(2019, 3, 29));

        List<KLine> call1 = client.call(request);

        Assert.assertEquals(1, call1.size());
    }


    @Test(expected = IllegalArgumentException.class)
    public void testNull() throws IOException, TuShareException {
        StockDailyRequest request = new StockDailyRequest();
        List<KLine> call = client.call(request);
    }
}