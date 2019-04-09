package com.github.kinoamyfx.tushare4j.index;

import com.github.kinoamyfx.tushare4j.CodeUtils;
import com.github.kinoamyfx.tushare4j.core.TuShareException;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import static com.github.kinoamyfx.tushare4j.TuShareClientTest.client;

public class IndexBasicRequestTest {

    @Test
    public void testRequest() throws IOException, TuShareException {
        IndexBasicRequest request = new IndexBasicRequest()
                .market(IndexBasicRequest.Market.SW)
                .publisher(null)
                .category(null);

        Assert.assertEquals(IndexBasicRequest.Market.SW, request.market());
        Assert.assertNull(request.publisher());
        Assert.assertNull(request.category());

        CodeUtils.assertDataMethod(request);

        List<IndexBasic> call = client.call(request);

        CodeUtils.assertFields(call, Arrays.asList("list_date", "desc", "exp_date"));
    }
}