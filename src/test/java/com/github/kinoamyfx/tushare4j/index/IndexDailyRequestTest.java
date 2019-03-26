package com.github.kinoamyfx.tushare4j.index;

import com.github.kinoamyfx.tushare4j.TuShareClientTest;
import com.github.kinoamyfx.tushare4j.core.TuShareException;
import com.github.kinoamyfx.tushare4j.stock.KLine;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class IndexDailyRequestTest {

    @Test
    public void testRequest() throws IOException, TuShareException {

        List<KLine> call = TuShareClientTest.client.call(new IndexDailyRequest("399300.SZ"));

        Assert.assertFalse(call.isEmpty());
    }
}