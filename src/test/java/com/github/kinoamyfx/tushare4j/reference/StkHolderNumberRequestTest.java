package com.github.kinoamyfx.tushare4j.reference;

import com.github.kinoamyfx.tushare4j.CodeUtils;
import com.github.kinoamyfx.tushare4j.TuShareClientTest;
import com.github.kinoamyfx.tushare4j.core.TsDate;
import com.github.kinoamyfx.tushare4j.core.TuShareException;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class StkHolderNumberRequestTest {
    @Test
    public void test() throws IOException, TuShareException {
        StkHolderNumberRequest request = new StkHolderNumberRequest()
                .tsCode("300199.SZ")
                .lastDate(null)
                .startDate(TsDate.parse("20160101"))
                .endDate(TsDate.parse("20181231"));

        Assert.assertEquals("300199.SZ", request.tsCode());
        Assert.assertNull(request.lastDate());
        Assert.assertEquals(TsDate.parse("20160101"), request.startDate());
        Assert.assertEquals(TsDate.parse("20181231"), request.endDate());

        CodeUtils.assertDataMethod(request);

        List<StkHolderNumber> call = TuShareClientTest.client.call(request);

        CodeUtils.assertFields(call);
    }
}