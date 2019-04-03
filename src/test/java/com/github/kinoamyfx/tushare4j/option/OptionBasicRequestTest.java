package com.github.kinoamyfx.tushare4j.option;

import com.github.kinoamyfx.tushare4j.CodeUtils;
import com.github.kinoamyfx.tushare4j.TuShareClientTest;
import com.github.kinoamyfx.tushare4j.core.TuShareException;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

public class OptionBasicRequestTest {

    @Test
    public void test() throws IOException, TuShareException {

        OptionBasicRequest request = new OptionBasicRequest();
        request.exchange(OptionExchange.SSE)
                .callPut(CallPut.C);
        Assert.assertEquals(OptionExchange.SSE, request.exchange());
        Assert.assertEquals(CallPut.C, request.callPut());

        CodeUtils.assertDataMethod(request);

        List<OptionBasic> call = TuShareClientTest.client.call(request);

        CodeUtils.assertFields(call, Collections.emptyList());
    }
}