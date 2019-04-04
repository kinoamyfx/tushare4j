package com.github.kinoamyfx.tushare4j.rate;

import com.github.kinoamyfx.tushare4j.CodeUtils;
import com.github.kinoamyfx.tushare4j.TuShareClientTest;
import com.github.kinoamyfx.tushare4j.core.TsDate;
import com.github.kinoamyfx.tushare4j.core.TuShareException;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

public class ShiborQuoteRequestTest {

    @Test
    public void test() throws IOException, TuShareException {

        ShiborQuoteRequest request = new ShiborQuoteRequest()
                .date(null)
                .startDate(TsDate.parse("20190101"))
                .endDate(TsDate.parse("20190401"))
                .bank(null);

        Assert.assertNull(request.date());
        Assert.assertEquals(TsDate.parse("20190101"), request.startDate());
        Assert.assertEquals(TsDate.parse("20190401"), request.endDate());
        Assert.assertNull(request.bank());


        CodeUtils.assertDataMethod(request);

        List<ShiborQuote> call = TuShareClientTest.client.call(request);

        CodeUtils.assertFields(call, Collections.emptyList());
    }
}