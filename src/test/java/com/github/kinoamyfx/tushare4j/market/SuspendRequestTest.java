package com.github.kinoamyfx.tushare4j.market;

import com.github.kinoamyfx.tushare4j.CodeUtils;
import com.github.kinoamyfx.tushare4j.TuShareClientTest;
import com.github.kinoamyfx.tushare4j.core.TuShareException;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class SuspendRequestTest {
    @Test
    public void test() throws IOException, TuShareException {
        SuspendRequest request = new SuspendRequest()
                .tsCode("600848.SH")
                .resumeDate(null)
                .suspendDate(null);

        Assert.assertEquals("600848.SH", request.tsCode());
        Assert.assertNull(request.resumeDate());
        Assert.assertNull(request.suspendDate());

        CodeUtils.assertDataMethod(request);

        List<Suspend> call = TuShareClientTest.client.call(request);

        CodeUtils.assertFields(call, Arrays.asList("resume_date", "ann_date", "reason_type"));
    }
}