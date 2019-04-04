package com.github.kinoamyfx.tushare4j.rate;

import com.github.kinoamyfx.tushare4j.CodeUtils;
import com.github.kinoamyfx.tushare4j.TuShareClientTest;
import com.github.kinoamyfx.tushare4j.core.TsDate;
import com.github.kinoamyfx.tushare4j.core.TuShareException;
import com.github.kinoamyfx.tushare4j.enums.Currency;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class LiborRequestTest {

    @Test
    public void test() throws IOException, TuShareException {

        LiborRequest request = new LiborRequest()
                .date(null)
                .startDate(TsDate.parse("20190101"))
                .endDate(TsDate.parse("20190401"))
                .currType(Currency.USD);

        Assert.assertNull(request.date());

        Assert.assertEquals(TsDate.parse("20190101"), request.startDate());
        Assert.assertEquals(TsDate.parse("20190401"), request.endDate());
        Assert.assertEquals(Currency.USD, request.currType());
        CodeUtils.assertDataMethod(request);

        List<Libor> call = TuShareClientTest.client.call(request);

        CodeUtils.assertFields(call, Arrays.asList("on"));
    }
}