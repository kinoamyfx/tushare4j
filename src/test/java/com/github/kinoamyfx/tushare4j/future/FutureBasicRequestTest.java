package com.github.kinoamyfx.tushare4j.future;

import com.github.kinoamyfx.tushare4j.CodeUtils;
import com.github.kinoamyfx.tushare4j.TuShareClientTest;
import com.github.kinoamyfx.tushare4j.core.TuShareException;
import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class FutureBasicRequestTest {

    @Test
    public void test() throws IOException, TuShareException {
        FutureBasicRequest request = new FutureBasicRequest()
                .exchange(FutureExchange.DCE)
                .type(1);

        Assert.assertEquals(FutureExchange.DCE, request.exchange());
        Assert.assertThat(request.type(), Is.is(1));

        CodeUtils.assertDataMethod(request);

        List<FutureBasic> call = TuShareClientTest.client.call(request);

        CodeUtils.assertFields(call, Arrays.asList("multiplier"));
    }
}