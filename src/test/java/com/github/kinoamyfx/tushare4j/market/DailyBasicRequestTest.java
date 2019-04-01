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

public class DailyBasicRequestTest {
    @Test
    public void test() throws IOException, TuShareException {
        DailyBasicRequest request = new DailyBasicRequest()
                .tsCode("600230.SH")
                .tradeDate(null)
                .startDate(TsDate.parse("20190301"))
                .endDate(TsDate.parse("20190331"));

        Assert.assertEquals("600230.SH", request.tsCode());
        Assert.assertNull(request.tradeDate());
        Assert.assertEquals(TsDate.of(2019, 3, 1), request.startDate());
        Assert.assertEquals(TsDate.of(2019, 3, 31), request.endDate());

        CodeUtils.assertDataMethod(request);
        List<DailyBasic> call = TuShareClientTest.client.call(request);

        CodeUtils.assertFields(call, Collections.emptyList());
    }
}