package com.github.kinoamyfx.tushare4j.finance;

import com.github.kinoamyfx.tushare4j.CodeUtils;
import com.github.kinoamyfx.tushare4j.TuShareClientTest;
import com.github.kinoamyfx.tushare4j.core.TsDate;
import com.github.kinoamyfx.tushare4j.core.TuShareException;
import org.junit.Test;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class IncomeRequestTest {
    @Test
    public void test() throws IOException, TuShareException {

        IncomeRequest request = new IncomeRequest()
                .tsCode("600000.SH")
                .annDate(null)
                .startDate(TsDate.parse("20180101"))
                .endDate(TsDate.parse("20180730"))
                .period(null)
                .reportType(null)
                .compType(null);

        CodeUtils.assertDataMethod(request);

        List<Income> call = TuShareClientTest.client.call(request);

        CodeUtils.assertFields(call, Arrays.stream(Income.class.getDeclaredFields()).map(Field::getName).collect(Collectors.toList()));
    }
}