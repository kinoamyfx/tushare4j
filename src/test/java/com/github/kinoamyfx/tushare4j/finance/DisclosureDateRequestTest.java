package com.github.kinoamyfx.tushare4j.finance;

import com.github.kinoamyfx.tushare4j.CodeUtils;
import com.github.kinoamyfx.tushare4j.TuShareClientTest;
import com.github.kinoamyfx.tushare4j.core.TsDate;
import com.github.kinoamyfx.tushare4j.core.TuShareException;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class DisclosureDateRequestTest {
    @Test
    public void test() throws IOException, TuShareException {
        DisclosureDateRequest request = new DisclosureDateRequest()
                .tsCode(null)
                .preDate(null)
                .actualDate(null)
                .endDate(TsDate.parse("20181231"));


        Assert.assertNull(request.tsCode());
        Assert.assertNull(request.preDate());
        Assert.assertNull(request.actualDate());

        Assert.assertEquals(TsDate.parse("20181231"), request.endDate());

        CodeUtils.assertDataMethod(request);

        List<DisclosureDate> call = TuShareClientTest.client.call(request);

        CodeUtils.assertFields(call, "pre_date", "actual_date", "modify_date", "ann_date");
    }
}