package com.github.kinoamyfx.tushare4j.fund;

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

public class FundCompanyRequestTest {

    @Test
    public void test() throws IOException, TuShareException {

        FundCompanyRequest request = new FundCompanyRequest();

        Assert.assertEquals(request, request);
        Assert.assertNotNull(request.hashCode());
        Assert.assertNotNull(request.toString());

        List<FundCompany> call = TuShareClientTest.client.call(request);

        CodeUtils.assertFields(call, Arrays.asList(FundCompany.class.getDeclaredFields()).stream().map(Field::getName).collect(Collectors.toList()));
    }
}