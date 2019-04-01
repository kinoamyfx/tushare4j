package com.github.kinoamyfx.tushare4j.consensus;

import com.github.kinoamyfx.tushare4j.CodeUtils;
import com.github.kinoamyfx.tushare4j.core.TsDate;
import com.github.kinoamyfx.tushare4j.core.TuShareException;
import com.github.kinoamyfx.tushare4j.enums.NewsSource;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

import static com.github.kinoamyfx.tushare4j.TuShareClientTest.client;

public class NewsRequestTest {

    @Test
    public void test() throws IOException, TuShareException {
        NewsRequest request = new NewsRequest()
                .src(NewsSource.SINA)
                .start_date(TsDate.parse("20190330"))
                .end_date(TsDate.parse("20190331"));

        Assert.assertEquals(NewsSource.SINA, request.src());
        Assert.assertEquals(TsDate.of(2019, 3, 30), request.start_date());
        Assert.assertEquals(TsDate.of(2019, 3, 31), request.end_date());

        CodeUtils.assertDataMethod(request);

        List<News> call = client.call(request);

        CodeUtils.assertFields(call, Collections.emptyList());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNull1() throws IOException, TuShareException {
        NewsRequest request = new NewsRequest();
        client.call(request);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNull2() throws IOException, TuShareException {
        NewsRequest request = new NewsRequest().src(NewsSource.SINA);
        client.call(request);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNull3() throws IOException, TuShareException {
        NewsRequest request = new NewsRequest().src(NewsSource.SINA).start_date(TsDate.parse("20190330"));
        client.call(request);
    }
}