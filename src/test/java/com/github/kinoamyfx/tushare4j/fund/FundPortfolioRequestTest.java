package com.github.kinoamyfx.tushare4j.fund;

import com.github.kinoamyfx.tushare4j.CodeUtils;
import com.github.kinoamyfx.tushare4j.TuShareClientTest;
import com.github.kinoamyfx.tushare4j.core.TuShareException;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

public class FundPortfolioRequestTest {

    @Test
    public void test() throws IOException, TuShareException {
        FundPortfolioRequest request = new FundPortfolioRequest().tsCode("001753.OF");
        Assert.assertEquals("001753.OF", request.tsCode());

        CodeUtils.assertDataMethod(request);

        List<FundPortfolio> call = TuShareClientTest.client.call(request);

        CodeUtils.assertFields(call, Collections.emptyList());
    }
}