package com.github.kinoamyfx.tushare4j.basic;

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

import static com.github.kinoamyfx.tushare4j.TuShareClientTest.client;

public class NameChangeRequestTest {


    @Test
    public void test() throws IOException, TuShareException {

        NameChangeRequest request = new NameChangeRequest()
                .tsCode("000031.SZ")
                .startDate(TsDate.of(2019, 3, 31).minus(20, ChronoUnit.DAYS))
                .endDate(TsDate.of(2019, 3, 31));

        Assert.assertNotNull(request.tsCode());
        Assert.assertNotNull(request.startDate());
        Assert.assertNotNull(request.endDate());

        List<NameChange> results = client.call(request);

        Assert.assertFalse(results.isEmpty());

        results.parallelStream().forEach(result -> {
            try {
                Field[] fields = result.getClass().getDeclaredFields();

                for (Field field : fields) {
                    Method set = result.getClass().getDeclaredMethod(field.getName(), field.getType());
                    Method get = result.getClass().getDeclaredMethod(field.getName());

                    Object v = get.invoke(result);

                    if ("end_date".equals(field.getName())) {
                        Assert.assertNotNull(set.invoke(result, v));
                        continue;
                    }

                    Assert.assertNotNull(v);
                    Assert.assertNotNull(set.invoke(result, v));
                }
            } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
                throw new RuntimeException(e);
            }
        });
    }
}