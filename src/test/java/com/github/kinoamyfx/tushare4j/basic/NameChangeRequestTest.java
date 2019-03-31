package com.github.kinoamyfx.tushare4j.basic;

import com.github.kinoamyfx.tushare4j.CodeUtils;
import com.github.kinoamyfx.tushare4j.core.TsDate;
import com.github.kinoamyfx.tushare4j.core.TuShareException;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.time.temporal.ChronoUnit;
import java.util.Collections;
import java.util.List;

import static com.github.kinoamyfx.tushare4j.TuShareClientTest.client;

public class NameChangeRequestTest {


    @Test
    public void test() throws IOException, TuShareException {

        NameChangeRequest request = new NameChangeRequest()
                .tsCode("000031.SZ")
                .startDate(TsDate.of(2019, 3, 31).minus(20, ChronoUnit.DAYS))
                .endDate(TsDate.of(2019, 3, 31));

        Assert.assertNotNull(request.tsCode());
        Assert.assertNotNull(request.startDate());
        Assert.assertNotNull(request.endDate());

        CodeUtils.assertDataMethod(request);

        List<NameChange> results = client.call(request);

        CodeUtils.assertFields(results, Collections.singletonList("end_date"));
    }
}