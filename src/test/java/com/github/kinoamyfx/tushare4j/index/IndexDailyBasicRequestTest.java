package com.github.kinoamyfx.tushare4j.index;

import com.github.kinoamyfx.tushare4j.CodeUtils;
import com.github.kinoamyfx.tushare4j.TuShareClientTest;
import com.github.kinoamyfx.tushare4j.core.TsDate;
import com.github.kinoamyfx.tushare4j.core.TuShareException;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

public class IndexDailyBasicRequestTest {

    @Test
    public void test() throws IOException, TuShareException {
        IndexDailyBasicRequest request = new IndexDailyBasicRequest()
                .tsCode("399300.SZ")
                .tradeDate(null)
                .startDate(TsDate.parse("20190325"))
                .endDate(TsDate.parse("20190331"));

        Assert.assertEquals("399300.SZ", request.tsCode());
        Assert.assertEquals(TsDate.of(2019, 3, 25), request.startDate());
        Assert.assertEquals(TsDate.of(2019, 3, 31), request.endDate());
        Assert.assertNull(request.tradeDate());

        CodeUtils.assertDataMethod(request);

        List<IndexDailyBasic> call = TuShareClientTest.client.call(request);

        CodeUtils.assertFields(call, Collections.emptyList());
    }
}