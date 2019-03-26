package com.github.kinoamyfx.tushare4j.basic;

import com.github.kinoamyfx.tushare4j.core.TuShareException;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

import static com.github.kinoamyfx.tushare4j.TuShareClientTest.client;

public class StockBasicListRequestTest {

    @Test
    public void testCall() throws IOException, TuShareException {
        StockBasicListRequest request = new StockBasicListRequest();
        request.setListStatus(StockBasicListRequest.ListStatus.L);

        List<StockBasic> call = client.call(request);

        Assert.assertFalse(call.isEmpty());
    }
}