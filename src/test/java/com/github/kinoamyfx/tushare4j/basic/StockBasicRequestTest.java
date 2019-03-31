package com.github.kinoamyfx.tushare4j.basic;

import com.github.kinoamyfx.tushare4j.CodeUtils;
import com.github.kinoamyfx.tushare4j.core.TuShareException;
import com.github.kinoamyfx.tushare4j.enums.Exchange;
import com.github.kinoamyfx.tushare4j.enums.IsHs;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

import static com.github.kinoamyfx.tushare4j.TuShareClientTest.client;
import static com.github.kinoamyfx.tushare4j.enums.ListStatus.L;

public class StockBasicRequestTest {

    @Test
    public void testCall() throws IOException, TuShareException {

        StockBasicRequest request = new StockBasicRequest()
                .listStatus(L)
                .isHs(IsHs.H)
                .exchange(Exchange.SSE);

        Assert.assertNotNull(request.listStatus());
        Assert.assertNotNull(request.isHs());
        Assert.assertNotNull(request.exchange());
        CodeUtils.assertDataMethod(request);

        List<StockBasic> results = client.call(request);

        CodeUtils.assertFields(results, Collections.singletonList("delist_date"));
    }
}