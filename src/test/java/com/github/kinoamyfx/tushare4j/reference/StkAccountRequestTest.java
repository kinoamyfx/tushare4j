package com.github.kinoamyfx.tushare4j.reference;

import com.github.kinoamyfx.tushare4j.CodeUtils;
import com.github.kinoamyfx.tushare4j.TuShareClientTest;
import com.github.kinoamyfx.tushare4j.core.TsDate;
import com.github.kinoamyfx.tushare4j.core.TuShareException;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class StkAccountRequestTest {

    @Test
    public void test() throws IOException, TuShareException {
        StkAccountRequest request = new StkAccountRequest()
                .date(null)
                .startDate(TsDate.parse("20180101"))
                .endDate(TsDate.parse("20181231"));

        Assert.assertNull(request.date());

        Assert.assertEquals(TsDate.parse("20180101"), request.startDate());
        Assert.assertEquals(TsDate.parse("20181231"), request.endDate());

        CodeUtils.assertDataMethod(request);

        List<StkAccount> call = TuShareClientTest.client.call(request);

        CodeUtils.assertFields(call, "weekly_hold", "weekly_trade");
    }
}