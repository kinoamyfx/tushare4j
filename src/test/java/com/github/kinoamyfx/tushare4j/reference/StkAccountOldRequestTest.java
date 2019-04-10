package com.github.kinoamyfx.tushare4j.reference;

import com.github.kinoamyfx.tushare4j.CodeUtils;
import com.github.kinoamyfx.tushare4j.TuShareClientTest;
import com.github.kinoamyfx.tushare4j.core.TsDate;
import com.github.kinoamyfx.tushare4j.core.TuShareException;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class StkAccountOldRequestTest {

    @Test
    public void test() throws IOException, TuShareException {

        StkAccountOldRequest request = new StkAccountOldRequest()
                .startDate(TsDate.parse("20140101"))
                .endDate(TsDate.parse("20141231"));
        Assert.assertEquals(TsDate.parse("20140101"), request.startDate());
        Assert.assertEquals(TsDate.parse("20141231"), request.endDate());

        CodeUtils.assertDataMethod(request);

        List<StkAccountOld> call = TuShareClientTest.client.call(request);

        CodeUtils.assertFields(call);
    }
}