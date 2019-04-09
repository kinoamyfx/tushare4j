package com.github.kinoamyfx.tushare4j.reference;

import com.github.kinoamyfx.tushare4j.CodeUtils;
import com.github.kinoamyfx.tushare4j.TuShareClientTest;
import com.github.kinoamyfx.tushare4j.core.TsDate;
import com.github.kinoamyfx.tushare4j.core.TuShareException;
import com.github.kinoamyfx.tushare4j.enums.Exchange;
import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

public class MarginRequestTest {
    @Test
    public void test() throws IOException, TuShareException {
        MarginRequest request = new MarginRequest()
                .tradeDate(TsDate.parse("20180802"))
                .exchange(Exchange.SSE);
        Assert.assertThat(request.tradeDate(), Is.is(TsDate.parse("20180802")));
        Assert.assertThat(request.exchange(), Is.is(Exchange.SSE));

        CodeUtils.assertDataMethod(request);

        List<Margin> call = TuShareClientTest.client.call(request);

        CodeUtils.assertFields(call, Collections.emptyList());
    }
}