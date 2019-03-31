package com.github.kinoamyfx.tushare4j.basic;

import com.github.kinoamyfx.tushare4j.CodeUtils;
import com.github.kinoamyfx.tushare4j.TuShareClientTest;
import com.github.kinoamyfx.tushare4j.core.TuShareException;
import com.github.kinoamyfx.tushare4j.enums.Exchange;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StockCompanyRequestTest {

    @Test
    public void test() throws IOException, TuShareException {
        StockCompanyRequest request = new StockCompanyRequest()
                .exchange(Exchange.SZSE)
                .exchange(Exchange.SSE);


        Assert.assertNotNull(request.exchange());
        CodeUtils.assertDataMethod(request);

        List<StockCompany> results = TuShareClientTest.client.call(request);
        CodeUtils.assertFields(results, Arrays.asList(StockCompany.class.getDeclaredFields()).stream().map(Field::getName).collect(Collectors.toList()));
    }
}