package com.github.kinoamyfx.tushare4j.reference;

import com.github.kinoamyfx.tushare4j.CodeUtils;
import com.github.kinoamyfx.tushare4j.TuShareClientTest;
import com.github.kinoamyfx.tushare4j.core.TsDate;
import com.github.kinoamyfx.tushare4j.core.TuShareException;
import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

public class HsgtTop10RequestTest {
    @Test
    public void test() throws IOException, TuShareException {

        HsgtTop10Request request = new HsgtTop10Request()
                .tsCode("600519.SH")
                .tradeDate(null)
                .startDate(TsDate.parse("20180701"))
                .endDate(TsDate.parse("20180725"))
                .marketType(1);

        Assert.assertEquals("600519.SH", request.tsCode());

        Assert.assertNull(request.tradeDate());

        Assert.assertEquals(TsDate.parse("20180701"), request.startDate());
        Assert.assertEquals(TsDate.parse("20180725"), request.endDate());

        Assert.assertThat(request.marketType(), Is.is(1));

        CodeUtils.assertDataMethod(request);

        List<HsgtTop10> call = TuShareClientTest.client.call(request);

        CodeUtils.assertFields(call, Collections.emptyList());
    }
}