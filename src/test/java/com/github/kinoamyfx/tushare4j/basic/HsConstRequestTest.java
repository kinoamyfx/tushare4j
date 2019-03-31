package com.github.kinoamyfx.tushare4j.basic;

import com.github.kinoamyfx.tushare4j.CodeUtils;
import com.github.kinoamyfx.tushare4j.TuShareClientTest;
import com.github.kinoamyfx.tushare4j.core.TuShareException;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

public class HsConstRequestTest {

    @Test
    public void test() throws IOException, TuShareException {

        HsConstRequest request = new HsConstRequest()
                .hsType(HsType.SZ)
                .hsType(HsType.SH)
                .isNew(1);

        Assert.assertTrue(request.canEqual(request));
        Assert.assertNotNull(request.hsType());
        Assert.assertNotNull(request.isNew());

        CodeUtils.assertDataMethod(request);
        List<HsConst> results = TuShareClientTest.client.call(request);
        CodeUtils.assertFields(results, Collections.singletonList("out_date"));
    }
}