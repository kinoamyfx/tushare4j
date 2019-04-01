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

public class IndexWeightRequestTest {
    @Test
    public void test() throws IOException, TuShareException {
        IndexWeightRequest request = new IndexWeightRequest()
                .indexCode("000001.SH")
                .tradeDate(null)
                .startDate(TsDate.parse("20190328"))
                .endDate(TsDate.parse("20190329"));

        Assert.assertEquals("000001.SH", request.indexCode());
        Assert.assertEquals(TsDate.parse("20190328"), request.startDate());
        Assert.assertEquals(TsDate.parse("20190329"), request.endDate());
        Assert.assertNull(request.tradeDate());

        CodeUtils.assertDataMethod(request);

        List<IndexWeight> call = TuShareClientTest.client.call(request);

        CodeUtils.assertFields(call, Collections.emptyList());
    }
}