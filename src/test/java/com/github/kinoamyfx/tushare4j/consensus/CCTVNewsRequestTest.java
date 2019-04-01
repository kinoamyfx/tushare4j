package com.github.kinoamyfx.tushare4j.consensus;

import com.github.kinoamyfx.tushare4j.CodeUtils;
import com.github.kinoamyfx.tushare4j.TuShareClientTest;
import com.github.kinoamyfx.tushare4j.core.TsDate;
import com.github.kinoamyfx.tushare4j.core.TuShareException;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

public class CCTVNewsRequestTest {

    @Test
    public void test() throws IOException, TuShareException {
        CCTVNewsRequest request = new CCTVNewsRequest().
                date(TsDate.parse("20190331"));

        Assert.assertEquals(TsDate.of(2019, 3, 31), request.date());

        CodeUtils.assertDataMethod(request);
        List<CCTVNews> call = TuShareClientTest.client.call(request);

        CodeUtils.assertFields(call, Collections.emptyList());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNull() throws IOException, TuShareException {
        CCTVNewsRequest request = new CCTVNewsRequest();
        Assert.assertNull(request.date());
        List<CCTVNews> call = TuShareClientTest.client.call(request);
    }
}