package com.github.kinoamyfx.tushare4j.tmt;

import com.github.kinoamyfx.tushare4j.CodeUtils;
import com.github.kinoamyfx.tushare4j.TuShareClientTest;
import com.github.kinoamyfx.tushare4j.core.TsDate;
import com.github.kinoamyfx.tushare4j.core.TuShareException;
import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

public class TmtTWIncomeDetailRequestTest {

    @Test
    public void test() throws IOException, TuShareException {
        TmtTWIncomeDetailRequest request = new TmtTWIncomeDetailRequest()
                .item(8)
                .symbol(6156L)
                .start_date(TsDate.parse("20180101"))
                .end_date(TsDate.parse("20190401"))
                .source(null)
                .date(null);

        Assert.assertNull(request.source());
        Assert.assertNull(request.date());

        Assert.assertThat(request.item(), Is.is(8));

        Assert.assertEquals(6156L, request.symbol().longValue());
        Assert.assertEquals(TsDate.parse("20180101"), request.start_date());
        Assert.assertEquals(TsDate.parse("20190401"), request.end_date());

        CodeUtils.assertDataMethod(request);

        List<TmtTWIncomeDetail> call = TuShareClientTest.client.call(request);
        CodeUtils.assertFields(call, Collections.emptyList());
    }
}