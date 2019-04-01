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

public class IndexWeeklyRequestTest {
    @Test
    public void test() throws IOException, TuShareException {
        IndexWeeklyRequest request = new IndexWeeklyRequest()
                .tsCode("000001.SH")
                .tradeDate(null)
                .startDate(TsDate.parse("20190225"))
                .endDate(TsDate.parse("20190331"));

        Assert.assertEquals("000001.SH", request.tsCode());
        Assert.assertEquals(TsDate.parse("20190225"), request.startDate());
        Assert.assertEquals(TsDate.parse("20190331"), request.endDate());
        Assert.assertNull(request.tradeDate());

        CodeUtils.assertDataMethod(request);

        List<KLine> call = TuShareClientTest.client.call(request);

        CodeUtils.assertFields(call, Collections.emptyList());
    }
}