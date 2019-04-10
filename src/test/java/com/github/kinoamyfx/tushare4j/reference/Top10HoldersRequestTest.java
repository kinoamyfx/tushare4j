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

public class Top10HoldersRequestTest {
    @Test
    public void test() throws IOException, TuShareException {
        Top10HoldersRequest request = new Top10HoldersRequest()
                .tsCode("600000.SH")
                .period(null)
                .annDate(null)
                .startDate(TsDate.parse("20170101"))
                .endDate(TsDate.parse("20171231"));

        Assert.assertEquals("600000.SH", request.tsCode());
        Assert.assertNull(request.period());
        Assert.assertNull(request.annDate());
        Assert.assertEquals(TsDate.parse("20170101"), request.startDate());
        Assert.assertEquals(TsDate.parse("20171231"), request.endDate());

        CodeUtils.assertDataMethod(request);

        List<Top10Holders> call = TuShareClientTest.client.call(request);

        CodeUtils.assertFields(call, Collections.emptyList());
    }
}