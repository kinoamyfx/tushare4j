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

public class FutureSettleRequestTest {
    @Test
    public void test() throws IOException, TuShareException {
        FutureSettleRequest request = new FutureSettleRequest()
                .tradeDate(TsDate.parse("20181114"))
                .tsCode(null)
                .startDate(null)
                .endDate(null)
                .exchange(FutureExchange.SHFE);

        Assert.assertEquals(TsDate.parse("20181114"), request.tradeDate());

        Assert.assertNull(request.tsCode());
        Assert.assertNull(request.startDate());
        Assert.assertNull(request.endDate());

        Assert.assertEquals(FutureExchange.SHFE, request.exchange());

        CodeUtils.assertDataMethod(request);

        List<FutureSettle> call = TuShareClientTest.client.call(request);

        CodeUtils.assertFields(call, Arrays.asList("offset_today_fee"));
    }
}