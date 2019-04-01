package com.github.kinoamyfx.tushare4j.market;

import com.github.kinoamyfx.tushare4j.CodeUtils;
import com.github.kinoamyfx.tushare4j.TuShareClientTest;
import com.github.kinoamyfx.tushare4j.core.TsDate;
import com.github.kinoamyfx.tushare4j.core.TuShareException;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

public class MoneyFlowRequestTest {

    @Test
    public void test() throws IOException, TuShareException {
        MoneyFlowRequest request = new MoneyFlowRequest()
                .tsCode("002149.SZ")
                .tradeDate(null)
                .startDate(TsDate.parse("20190301"))
                .endDate(TsDate.parse("20190315"));

        Assert.assertEquals("002149.SZ", request.tsCode());
        Assert.assertNull(request.tradeDate());
        Assert.assertEquals(TsDate.of(2019, 3, 1), request.startDate());
        Assert.assertEquals(TsDate.of(2019, 3, 15), request.endDate());

        CodeUtils.assertDataMethod(request);

        List<MoneyFlow> call = TuShareClientTest.client.call(request);

        CodeUtils.assertFields(call, Collections.emptyList());
    }
}