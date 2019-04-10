package com.github.kinoamyfx.tushare4j.reference;

import com.github.kinoamyfx.tushare4j.CodeUtils;
import com.github.kinoamyfx.tushare4j.TuShareClientTest;
import com.github.kinoamyfx.tushare4j.core.TuShareException;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static com.github.kinoamyfx.tushare4j.core.TsDate.parse;

public class RePurchaseRequestTest {
    @Test
    public void test() throws IOException, TuShareException {
        RePurchaseRequest request = new RePurchaseRequest()
                .annDate(null)
                .startDate(parse("20180101"))
                .endDate(parse("20180510"));
        Assert.assertNull(request.annDate());
        Assert.assertEquals(parse("20180101"), request.startDate());
        Assert.assertEquals(parse("20180510"), request.endDate());

        CodeUtils.assertDataMethod(request);

        List<RePurchase> call = TuShareClientTest.client.call(request);

        CodeUtils.assertFields(call, Arrays.stream(RePurchase.class.getDeclaredFields()).map(Field::getName).collect(Collectors.toList()));
    }
}