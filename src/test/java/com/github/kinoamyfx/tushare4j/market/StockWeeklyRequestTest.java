package com.github.kinoamyfx.tushare4j.market;

import com.github.kinoamyfx.tushare4j.CodeUtils;
import com.github.kinoamyfx.tushare4j.core.TsDate;
import com.github.kinoamyfx.tushare4j.core.TuShareException;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

import static com.github.kinoamyfx.tushare4j.TuShareClientTest.client;

public class StockWeeklyRequestTest {

    @Test
    public void test() throws IOException, TuShareException {

        StockWeeklyRequest request = new StockWeeklyRequest()
                .tsCode("000001.SZ")
                .startDate(TsDate.of(2019, 2, 15))
                .endDate(TsDate.of(2019, 3, 15));

        Assert.assertEquals(request.tsCode(), "000001.SZ");
        Assert.assertEquals(request.startDate(), TsDate.of(2019, 2, 15));
        Assert.assertEquals(request.endDate(), TsDate.of(2019, 3, 15));

        CodeUtils.assertDataMethod(request);

        List<KLine> call = client.call(request);

        CodeUtils.assertFields(call, Collections.emptyList());

        request = new StockWeeklyRequest()
                .tsCode("000001.SZ")
                .tradeDate(TsDate.of(2019, 3, 29));

        Assert.assertEquals(request.tradeDate(), TsDate.of(2019, 3, 29));

        List<KLine> call1 = client.call(request);

        Assert.assertEquals(1, call1.size());
    }


    @Test(expected = IllegalArgumentException.class)
    public void testNull() throws IOException, TuShareException {
        StockWeeklyRequest request = new StockWeeklyRequest();
        List<KLine> call = client.call(request);
    }
}