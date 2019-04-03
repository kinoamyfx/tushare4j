package com.github.kinoamyfx.tushare4j.option;

import com.github.kinoamyfx.tushare4j.CodeUtils;
import com.github.kinoamyfx.tushare4j.core.TsDate;
import com.github.kinoamyfx.tushare4j.core.TuShareException;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

import static com.github.kinoamyfx.tushare4j.TuShareClientTest.client;
import static com.github.kinoamyfx.tushare4j.option.OptionExchange.SSE;

public class OptionDailyRequestTest {
    @Test
    public void test() throws IOException, TuShareException {
        OptionDailyRequest request = new OptionDailyRequest()
                .tsCode("10001501.SH")
                .tradeDate(null)
                .startDate(TsDate.parse("20190301"))
                .endDate(TsDate.parse("20190331"))
                .exchange(SSE);

        Assert.assertEquals("10001501.SH", request.tsCode());
        Assert.assertEquals(TsDate.parse("20190301"), request.startDate());
        Assert.assertEquals(TsDate.parse("20190331"), request.endDate());
        Assert.assertEquals(SSE, request.exchange());
        Assert.assertNull(request.tradeDate());


        CodeUtils.assertDataMethod(request);

        List<OptionDaily> call = client.call(request);

        CodeUtils.assertFields(call, Collections.emptyList());
    }

    @Test
    public void test2() throws IOException, TuShareException {
        OptionDailyRequest request = new OptionDailyRequest()
                .tsCode("10001501.SH")
                .tradeDate(TsDate.parse("20190328"))
                .startDate(null)
                .endDate(null)
                .exchange(SSE);

        //Assert.assertEquals("10001313.SH", request.tsCode());
        //Assert.assertEquals(TsDate.parse("20190301"), request.startDate());
        //Assert.assertEquals(TsDate.parse("20190331"), request.endDate());
        Assert.assertEquals(SSE, request.exchange());
        Assert.assertEquals(TsDate.parse("20190328"), request.tradeDate());


        CodeUtils.assertDataMethod(request);

        List<OptionDaily> call = client.call(request);

        CodeUtils.assertFields(call, Collections.emptyList());
    }
}