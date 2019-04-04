package com.github.kinoamyfx.tushare4j.fund;

import com.github.kinoamyfx.tushare4j.CodeUtils;
import com.github.kinoamyfx.tushare4j.TuShareClientTest;
import com.github.kinoamyfx.tushare4j.core.TsDate;
import com.github.kinoamyfx.tushare4j.core.TuShareException;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class FundDividendRequestTest {
    @Test
    public void test() throws IOException, TuShareException {
        FundDividendRequest request = new FundDividendRequest()
                .annDate(TsDate.parse("20181018"))
                .exDate(null)
                .payDate(null)
                .tsCode(null);

        Assert.assertEquals(TsDate.parse("20181018"), request.annDate());
        Assert.assertNull(request.exDate());
        Assert.assertNull(request.payDate());
        Assert.assertNull(request.tsCode());

        CodeUtils.assertDataMethod(request);

        List<FundDividend> call = TuShareClientTest.client.call(request);

        CodeUtils.assertFields(call, Arrays.asList("earpay_date", "net_ex_date", "ear_amount", "account_date"));
    }
}