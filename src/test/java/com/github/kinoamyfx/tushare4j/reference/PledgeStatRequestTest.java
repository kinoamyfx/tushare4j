package com.github.kinoamyfx.tushare4j.reference;

import com.github.kinoamyfx.tushare4j.CodeUtils;
import com.github.kinoamyfx.tushare4j.TuShareClientTest;
import com.github.kinoamyfx.tushare4j.core.TuShareException;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

public class PledgeStatRequestTest {
    @Test
    public void test() throws IOException, TuShareException {
        PledgeStatRequest request = new PledgeStatRequest()
                .tsCode("000014.SZ");

        Assert.assertEquals("000014.SZ", request.tsCode());

        CodeUtils.assertDataMethod(request);

        List<PledgeStat> call = TuShareClientTest.client.call(request);

        CodeUtils.assertFields(call, Collections.emptyList());
    }
}