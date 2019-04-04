package com.github.kinoamyfx.tushare4j.fund;

import com.github.kinoamyfx.tushare4j.CodeUtils;
import com.github.kinoamyfx.tushare4j.TuShareClientTest;
import com.github.kinoamyfx.tushare4j.core.TuShareException;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class FundBasicRequestTest {

    @Test
    public void test() throws IOException, TuShareException {
        FundBasicRequest request = new FundBasicRequest()
                .market(FundMarket.O);

        Assert.assertEquals(FundMarket.O, request.market());

        CodeUtils.assertDataMethod(request);

        List<FundBasic> call = TuShareClientTest.client.call(request);

        CodeUtils.assertFields(call, Arrays.asList("due_date", "list_date", "issue_date", "delist_date", "issue_amount", "min_amount", "exp_return", "trustee", "duration_year", "purc_startdate", "redm_startdate"));
    }
}