package com.github.kinoamyfx.tushare4j.reference;

import com.github.kinoamyfx.tushare4j.CodeUtils;
import com.github.kinoamyfx.tushare4j.TuShareClientTest;
import com.github.kinoamyfx.tushare4j.core.TsDate;
import com.github.kinoamyfx.tushare4j.core.TuShareException;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

public class TopInstRequestTest {
    @Test
    public void test() throws IOException, TuShareException {
        TopInstRequest request = new TopInstRequest()
                .tradeDate(TsDate.parse("20180928"))
                .tsCode("002219.SZ");


        Assert.assertEquals(TsDate.parse("20180928"), request.tradeDate());
        Assert.assertEquals("002219.SZ", request.tsCode());

        CodeUtils.assertDataMethod(request);

        List<TopInst> call = TuShareClientTest.client.call(request);

        CodeUtils.assertFields(call, Collections.emptyList());
    }
}