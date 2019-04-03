package com.github.kinoamyfx.tushare4j.tmt;

import com.github.kinoamyfx.tushare4j.CodeUtils;
import com.github.kinoamyfx.tushare4j.TuShareClientTest;
import com.github.kinoamyfx.tushare4j.core.TsDate;
import com.github.kinoamyfx.tushare4j.core.TuShareException;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

public class BookingMonthlyRequestTest {

    @Test
    public void test() throws IOException, TuShareException {
        BookingMonthlyRequest request = new BookingMonthlyRequest()
                .date(TsDate.parse("20190301"));

        Assert.assertEquals(TsDate.parse("20190301"), request.date());

        CodeUtils.assertDataMethod(request);

        List<MonthlyBooking> call = TuShareClientTest.client.call(request);

        CodeUtils.assertFields(call, Collections.emptyList());
    }
}