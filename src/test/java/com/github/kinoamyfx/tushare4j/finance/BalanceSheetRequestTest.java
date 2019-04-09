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

public class BalanceSheetRequestTest {

    @Test
    public void test() throws IOException, TuShareException {
        BalanceSheetRequest request = new BalanceSheetRequest()
                .tsCode("600000.SH")
                .annDate(null)
                .startDate(null)
                .endDate(null)
                .period(null)
                .reportType(null)
                .compType(null);

        Assert.assertEquals("600000.SH", request.tsCode());
        Assert.assertNull(request.annDate());
        Assert.assertNull(request.startDate());
        Assert.assertNull(request.period());
        Assert.assertNull(request.reportType());
        Assert.assertNull(request.compType());

        CodeUtils.assertDataMethod(request);

        List<BalanceSheet> call = TuShareClientTest.client.call(request);

        CodeUtils.assertFields(call, Arrays.stream(BalanceSheet.class.getDeclaredFields()).map(Field::getName).collect(Collectors.toList()));
    }
}