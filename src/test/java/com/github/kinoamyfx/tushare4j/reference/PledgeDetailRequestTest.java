package com.github.kinoamyfx.tushare4j.reference;

import com.github.kinoamyfx.tushare4j.CodeUtils;
import com.github.kinoamyfx.tushare4j.TuShareClientTest;
import com.github.kinoamyfx.tushare4j.core.TuShareException;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class PledgeDetailRequestTest {
    @Test
    public void test() throws IOException, TuShareException {
        PledgeDetailRequest request = new PledgeDetailRequest()
                .tsCode("000014.SZ");

        Assert.assertEquals("000014.SZ", request.tsCode());

        CodeUtils.assertDataMethod(request);

        List<PledgeDetail> call = TuShareClientTest.client.call(request);

        CodeUtils.assertFields(call, Arrays.asList("is_release", "release_date", "holding_amount", "pledged_amount", "p_total_ratio", "h_total_ratio", "is_buyback"));
    }
}