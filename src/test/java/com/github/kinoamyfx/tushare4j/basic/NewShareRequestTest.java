package com.github.kinoamyfx.tushare4j.basic;

import com.github.kinoamyfx.tushare4j.CodeUtils;
import com.github.kinoamyfx.tushare4j.TuShareClientTest;
import com.github.kinoamyfx.tushare4j.core.TsDate;
import com.github.kinoamyfx.tushare4j.core.TuShareException;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.time.temporal.ChronoUnit;
import java.util.Collections;
import java.util.List;

public class NewShareRequestTest {

    @Test
    public void test() throws IOException, TuShareException {
        NewShareRequest request = new NewShareRequest()
                .startDate(TsDate.today().minus(20, ChronoUnit.DAYS))
                .endDate(TsDate.today());

        Assert.assertNotNull(request.startDate());
        Assert.assertNotNull(request.endDate());
        CodeUtils.assertDataMethod(request);

        List<NewShare> results = TuShareClientTest.client.call(request);

        CodeUtils.assertFields(results, Collections.emptyList());
    }
}