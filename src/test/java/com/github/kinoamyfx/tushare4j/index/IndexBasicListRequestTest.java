package com.github.kinoamyfx.tushare4j.index;

import com.github.kinoamyfx.tushare4j.core.TuShareException;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

import static com.github.kinoamyfx.tushare4j.TuShareClientTest.client;

public class IndexBasicListRequestTest {

    @Test
    public void testRequest() throws IOException, TuShareException {
        List<IndexBasic> indexBasics = client.call(new IndexBasicListRequest("SSE"));

        Assert.assertFalse(indexBasics.isEmpty());
    }
}