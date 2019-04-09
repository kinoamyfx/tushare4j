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

/**
 * https://tushare.pro/document/2?doc_id=49
 */
public class GGTTop10RequestTest {
    @Test
    public void test() throws IOException, TuShareException {
        GGTTop10Request request = new GGTTop10Request()
                .tsCode("00700")
                .tradeDate(null)
                .startDate(TsDate.parse("20180701"))
                .endDate(TsDate.parse("20180727"))
                .marketType(2);

        Assert.assertEquals("00700", request.tsCode());

        Assert.assertNull(request.tradeDate());

        Assert.assertEquals(TsDate.parse("20180701"), request.startDate());
        Assert.assertEquals(TsDate.parse("20180727"), request.endDate());

        Assert.assertThat(request.marketType(), Is.is(2));

        CodeUtils.assertDataMethod(request);

        List<GGTTop10> call = TuShareClientTest.client.call(request);

        CodeUtils.assertFields(call, Collections.emptyList());
    }
}