package com.github.kinoamyfx.tushare4j.basic;

import com.github.kinoamyfx.tushare4j.core.TsDate;
import com.github.kinoamyfx.tushare4j.core.TuShareException;
import com.github.kinoamyfx.tushare4j.enums.Exchange;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.time.temporal.ChronoUnit;
import java.util.List;

import static com.github.kinoamyfx.tushare4j.TuShareClientTest.client;

public class TradeCalendarRequestTest {

    @Test
    public void testRequest() throws IOException, TuShareException {

        TradeCalendarRequest request = new TradeCalendarRequest()
                .exchange(Exchange.SSE)
                .startDate(TsDate.today().minus(20, ChronoUnit.DAYS))
                .endDate(TsDate.today())
                .isOpen(true);

        request.exchange();
        request.startDate();
        request.endDate();
        request.isOpen();

        List<TradeCalendar> results = client.call(request);

        Assert.assertFalse(results.isEmpty());

        results.parallelStream().forEach(result -> {
            try {
                Field[] fields = result.getClass().getDeclaredFields();

                for (Field field : fields) {
                    Method set = result.getClass().getDeclaredMethod(field.getName(), field.getType());
                    Method get = result.getClass().getDeclaredMethod(field.getName());

                    Object v = get.invoke(result);

                    Assert.assertNotNull(v);
                    Assert.assertNotNull(set.invoke(result, v));
                }
            } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
                throw new RuntimeException(e);
            }
        });
    }
}