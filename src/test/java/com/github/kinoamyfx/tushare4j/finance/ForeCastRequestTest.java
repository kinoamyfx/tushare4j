package com.github.kinoamyfx.tushare4j.finance;

import com.github.kinoamyfx.tushare4j.CodeUtils;
import com.github.kinoamyfx.tushare4j.TuShareClientTest;
import com.github.kinoamyfx.tushare4j.core.TsDate;
import com.github.kinoamyfx.tushare4j.core.TuShareException;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class ForeCastRequestTest {
    @Test
    public void test() throws IOException, TuShareException {
        ForeCastRequest request = new ForeCastRequest()
                .tsCode(null)
                .annDate(TsDate.parse("20190131"))
                .startDate(null)
                .endDate(null)
                .period(null)
                .type(ForeCastType.略减);

        Assert.assertNull(request.tsCode());
        Assert.assertNull(request.startDate());
        Assert.assertNull(request.endDate());
        Assert.assertNull(request.period());

        Assert.assertEquals(TsDate.parse("20190131"), request.annDate());
        Assert.assertEquals(ForeCastType.略减, request.type());

        CodeUtils.assertDataMethod(request);

        List<ForeCast> call = TuShareClientTest.client.call(request);

        CodeUtils.assertFields(call, "net_profit_min", "net_profit_max");
    }
}