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

public class FutureHoldingRequestTest {

    @Test
    public void test() throws IOException, TuShareException {
        FutureHoldingRequest request = new FutureHoldingRequest()
                .tradeDate(null)
                .symbol("C")
                .startDate(TsDate.parse("20190301"))
                .endDate(TsDate.parse("20190315"))
                .exchange(FutureExchange.DCE);


        Assert.assertNull(request.tradeDate());
        Assert.assertEquals("C", request.symbol());
        Assert.assertEquals(TsDate.parse("20190301"), request.startDate());
        Assert.assertEquals(TsDate.parse("20190315"), request.endDate());
        Assert.assertEquals(FutureExchange.DCE, request.exchange());
        CodeUtils.assertDataMethod(request);

        List<FutureHolding> call = TuShareClientTest.client.call(request);

        CodeUtils.assertFields(call, Arrays.asList("vol", "vol_chg", "long_hld", "long_chg", "short_hld", "short_chg"));
    }
}