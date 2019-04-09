package com.github.kinoamyfx.tushare4j.reference;

import com.github.kinoamyfx.tushare4j.CodeUtils;
import com.github.kinoamyfx.tushare4j.TuShareClientTest;
import com.github.kinoamyfx.tushare4j.core.TsDate;
import com.github.kinoamyfx.tushare4j.core.TuShareException;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

public class MoneyFlowHsgtRequestTest {
    @Test
    public void test() throws IOException, TuShareException {
        MoneyFlowHsgtRequest request = new MoneyFlowHsgtRequest()
                .tradeDate(TsDate.parse("20190408"))
                .startDate(null)
                .endDate(null);

        Assert.assertEquals(TsDate.parse("20190408"), request.tradeDate());
        Assert.assertNull(request.startDate());
        Assert.assertNull(request.endDate());

        CodeUtils.assertDataMethod(request);

        List<MoneyFlowHsgt> call = TuShareClientTest.client.call(request);

        CodeUtils.assertFields(call, Collections.emptyList());
    }
}