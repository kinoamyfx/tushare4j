package com.github.kinoamyfx.tushare4j.fund;

import com.github.kinoamyfx.tushare4j.CodeUtils;
import com.github.kinoamyfx.tushare4j.TuShareClientTest;
import com.github.kinoamyfx.tushare4j.core.TuShareException;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class FundNetValueRequestTest {

    @Test
    public void test() throws IOException, TuShareException {
        FundNetValueRequest request = new FundNetValueRequest()
                .tsCode("165509.SZ")
                .endDate(null);
        Assert.assertNull(request.endDate());
        Assert.assertEquals("165509.SZ", request.tsCode());
        CodeUtils.assertDataMethod(request);

        List<FundNetValue> call = TuShareClientTest.client.call(request);

        CodeUtils.assertFields(call, Arrays.asList("total_netasset", "accum_div", "net_asset"));
    }
}