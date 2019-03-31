package com.github.kinoamyfx.tushare4j.basic;

import com.github.kinoamyfx.tushare4j.TuShareClientTest;
import com.github.kinoamyfx.tushare4j.core.TsDate;
import com.github.kinoamyfx.tushare4j.core.TuShareException;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.time.temporal.ChronoUnit;
import java.util.List;

public class NewShareRequestTest {

    @Test
    public void test() throws IOException, TuShareException {
        NewShareRequest request = new NewShareRequest()
                .startDate(TsDate.today().minus(20, ChronoUnit.DAYS))
                .endDate(TsDate.today());

        Assert.assertNotNull(request.startDate());
        Assert.assertNotNull(request.endDate());

        List<NewShare> results = TuShareClientTest.client.call(request);

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