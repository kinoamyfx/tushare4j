package com.github.kinoamyfx.tushare4j.finance;

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

public class DividendRequestTest {

    @Test
    public void test() throws IOException, TuShareException {

        DividendRequest request = new DividendRequest()
                .tsCode("600848.SH")
                .annDate(null)
                .recordDate(null)
                .exDate(null)
                .impAnnDate(null);

        Assert.assertNull(request.annDate());
        Assert.assertNull(request.recordDate());
        Assert.assertNull(request.exDate());
        Assert.assertNull(request.impAnnDate());

        Assert.assertEquals("600848.SH", request.tsCode());

        CodeUtils.assertDataMethod(request);

        List<Dividend> call = TuShareClientTest.client.call(request);

        CodeUtils.assertFields(call, Arrays.stream(Dividend.class.getDeclaredFields()).map(Field::getName).collect(Collectors.toList()));
    }
}