package com.github.kinoamyfx.tushare4j.future;

import com.github.kinoamyfx.tushare4j.CodeUtils;
import com.github.kinoamyfx.tushare4j.TuShareClientTest;
import com.github.kinoamyfx.tushare4j.core.TsDate;
import com.github.kinoamyfx.tushare4j.core.TuShareException;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class FutureDailyRequestTest {
    @Test
    public void test() throws IOException, TuShareException {
        FutureDailyRequest request = new FutureDailyRequest()
                .exchange(FutureExchange.SHFE)
                .startDate(TsDate.parse("20190331"))
                .endDate(TsDate.parse("20190404"))
                .tsCode(null)
                .tradeDate(null);

        Assert.assertEquals(FutureExchange.SHFE, request.exchange());
        Assert.assertEquals(TsDate.parse("20190331"), request.startDate());
        Assert.assertEquals(TsDate.parse("20190404"), request.endDate());

        Assert.assertNull(request.tsCode());
        Assert.assertNull(request.tradeDate());


        CodeUtils.assertDataMethod(request);

        List<FutureDaily> call = TuShareClientTest.client.call(request);

        CodeUtils.assertFields(call, Arrays.asList("open", "delv_settle", "high", "low", "oi_chg"));
    }
}