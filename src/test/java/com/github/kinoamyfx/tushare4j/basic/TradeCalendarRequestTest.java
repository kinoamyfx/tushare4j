package com.github.kinoamyfx.tushare4j.basic;

import com.github.kinoamyfx.tushare4j.CodeUtils;
import com.github.kinoamyfx.tushare4j.core.TsDate;
import com.github.kinoamyfx.tushare4j.core.TuShareException;
import com.github.kinoamyfx.tushare4j.enums.Exchange;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.time.temporal.ChronoUnit;
import java.util.Collections;
import java.util.List;

import static com.github.kinoamyfx.tushare4j.TuShareClientTest.client;

public class TradeCalendarRequestTest {

    @Test
    public void testRequest() throws IOException, TuShareException {

        TradeCalendarRequest request = new TradeCalendarRequest()
                .exchange(Exchange.SSE)
                .startDate(TsDate.today().minus(20, ChronoUnit.DAYS))
                .endDate(TsDate.today())
                .openFlag(true);

        Assert.assertNotNull(request.exchange());
        Assert.assertNotNull(request.startDate());
        Assert.assertNotNull(request.endDate());
        Assert.assertTrue(request.openFlag());

        CodeUtils.assertDataMethod(request);

        List<TradeCalendar> results = client.call(request);
        CodeUtils.assertFields(results, Collections.emptyList());
    }
}