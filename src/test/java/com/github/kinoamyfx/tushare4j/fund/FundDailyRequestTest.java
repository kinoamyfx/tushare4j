package com.github.kinoamyfx.tushare4j.fund;

import com.github.kinoamyfx.tushare4j.CodeUtils;
import com.github.kinoamyfx.tushare4j.TuShareClientTest;
import com.github.kinoamyfx.tushare4j.core.TsDate;
import com.github.kinoamyfx.tushare4j.core.TuShareException;
import com.github.kinoamyfx.tushare4j.market.KLine;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

public class FundDailyRequestTest {
    @Test
    public void test() throws IOException, TuShareException {
        FundDailyRequest request = new FundDailyRequest()
                .tsCode("150018.SZ")
                .tradeDate(null)
                .startDate(TsDate.parse("20180101"))
                .endDate(TsDate.parse("20181029"));

        Assert.assertEquals("150018.SZ", request.tsCode());
        Assert.assertNull(request.tradeDate());
        Assert.assertEquals(TsDate.parse("20180101"), request.startDate());
        Assert.assertEquals(TsDate.parse("20181029"), request.endDate());


        CodeUtils.assertDataMethod(request);


        List<KLine> call = TuShareClientTest.client.call(request);

        CodeUtils.assertFields(call, Collections.emptyList());
    }
}