package com.github.kinoamyfx.tushare4j.index;

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

public class IndexMonthlyRequestTest {

    @Test
    public void test() throws IOException, TuShareException {
        IndexMonthlyRequest request = new IndexMonthlyRequest()
                .tsCode("000001.SH")
                .tradeDate(null)
                .startDate(TsDate.parse("20180325"))
                .endDate(TsDate.parse("20190331"));

        Assert.assertEquals("000001.SH", request.tsCode());
        Assert.assertEquals(TsDate.parse("20180325"), request.startDate());
        Assert.assertEquals(TsDate.parse("20190331"), request.endDate());
        Assert.assertNull(request.tradeDate());

        CodeUtils.assertDataMethod(request);

        List<KLine> call = TuShareClientTest.client.call(request);

        CodeUtils.assertFields(call, Collections.emptyList());
    }
}