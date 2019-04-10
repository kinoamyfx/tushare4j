package com.github.kinoamyfx.tushare4j.finance;

import com.github.kinoamyfx.tushare4j.CodeUtils;
import com.github.kinoamyfx.tushare4j.TuShareClientTest;
import com.github.kinoamyfx.tushare4j.core.TuShareException;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class FinanceMainBzRequestTest {
    @Test
    public void test() throws IOException, TuShareException {

        FinanceMainBzRequest request = new FinanceMainBzRequest()
                .tsCode("000627.SZ")
                .type(BizType.P)
                .period(null)
                .startDate(null)
                .endDate(null);

        Assert.assertNull(request.period());
        Assert.assertNull(request.startDate());
        Assert.assertNull(request.endDate());

        Assert.assertEquals("000627.SZ", request.tsCode());
        Assert.assertEquals(BizType.P, request.type());

        CodeUtils.assertDataMethod(request);

        List<FinanceMainBz> call = TuShareClientTest.client.call(request);

        CodeUtils.assertFields(call, "bz_profit", "bz_cost");
    }
}