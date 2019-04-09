package com.github.kinoamyfx.tushare4j.reference;

import com.github.kinoamyfx.tushare4j.CodeUtils;
import com.github.kinoamyfx.tushare4j.TuShareClientTest;
import com.github.kinoamyfx.tushare4j.core.TsDate;
import com.github.kinoamyfx.tushare4j.core.TuShareException;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

public class MarginDetailRequestTest {
    @Test
    public void test() throws IOException, TuShareException {
        MarginDetailRequest request = new MarginDetailRequest()
                .tradeDate(TsDate.parse("20190408"))
                .tsCode(null);

        Assert.assertEquals(TsDate.parse("20190408"), request.tradeDate());
        Assert.assertNull(request.tsCode());

        CodeUtils.assertDataMethod(request);

        List<MarginDetail> call = TuShareClientTest.client.call(request);

        CodeUtils.assertFields(call, Collections.emptyList());
    }
}