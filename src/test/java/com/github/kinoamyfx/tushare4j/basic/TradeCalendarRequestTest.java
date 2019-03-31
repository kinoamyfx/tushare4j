package com.github.kinoamyfx.tushare4j.basic;

import com.github.kinoamyfx.tushare4j.TuShareClientTest;
import com.github.kinoamyfx.tushare4j.core.TuShareException;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class TradeCalendarRequestTest {

    @Test
    public void testRequest() throws IOException, TuShareException {

        List<TradeCalendar> call = TuShareClientTest.client.call(new TradeCalendarRequest().exchange(Exchange.SSE));

        Assert.assertFalse(call.isEmpty());
    }
}