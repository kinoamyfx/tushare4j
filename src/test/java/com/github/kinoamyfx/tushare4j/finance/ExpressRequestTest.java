package com.github.kinoamyfx.tushare4j.finance;

import com.github.kinoamyfx.tushare4j.CodeUtils;
import com.github.kinoamyfx.tushare4j.TuShareClientTest;
import com.github.kinoamyfx.tushare4j.core.TsDate;
import com.github.kinoamyfx.tushare4j.core.TuShareException;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ExpressRequestTest {
    @Test
    public void test() throws IOException, TuShareException {
        ExpressRequest request = new ExpressRequest()
                .tsCode("600000.SH")
                .annDate(null)
                .startDate(TsDate.parse("20180101"))
                .endDate(TsDate.parse("20180701"))
                .period(null);

        Assert.assertNull(request.annDate());
        Assert.assertNull(request.period());

        Assert.assertEquals("600000.SH", request.tsCode());
        Assert.assertEquals(TsDate.parse("20180101"), request.startDate());
        Assert.assertEquals(TsDate.parse("20180701"), request.endDate());

        CodeUtils.assertDataMethod(request);

        List<Express> call = TuShareClientTest.client.call(request);

        CodeUtils.assertFields(call, Arrays.stream(Express.class.getDeclaredFields()).map(Field::getName).collect(Collectors.toList()));
    }
}