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

public class ShareFloatRequestTest {
    @Test
    public void test() throws IOException, TuShareException {

        ShareFloatRequest request = new ShareFloatRequest()
                .tsCode("000998.SZ")
                .annDate(TsDate.parse("20181220"))
                .floatDate(null)
                .startDate(null)
                .endDate(null);

        Assert.assertEquals("000998.SZ", request.tsCode());
        Assert.assertEquals(TsDate.parse("20181220"), request.annDate());
        Assert.assertNull(request.floatDate());
        Assert.assertNull(request.startDate());
        Assert.assertNull(request.endDate());
        CodeUtils.assertDataMethod(request);

        List<ShareFloat> call = TuShareClientTest.client.call(request);

        CodeUtils.assertFields(call, Collections.emptyList());
    }
}