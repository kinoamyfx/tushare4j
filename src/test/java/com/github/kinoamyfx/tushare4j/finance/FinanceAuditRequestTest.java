package com.github.kinoamyfx.tushare4j.finance;

import com.github.kinoamyfx.tushare4j.CodeUtils;
import com.github.kinoamyfx.tushare4j.TuShareClientTest;
import com.github.kinoamyfx.tushare4j.core.TuShareException;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class FinanceAuditRequestTest {

    @Test
    public void test() throws IOException, TuShareException {

        FinanceAuditRequest request = new FinanceAuditRequest()
                .tsCode("600000.SH")
                .annDate(null)
                .startDate(null)
                .endDate(null)
                .period(null);

        Assert.assertEquals("600000.SH", request.tsCode());

        Assert.assertNull(request.annDate());
        Assert.assertNull(request.startDate());
        Assert.assertNull(request.endDate());
        Assert.assertNull(request.period());

        CodeUtils.assertDataMethod(request);

        List<FinanceAudit> call = TuShareClientTest.client.call(request);

        CodeUtils.assertFields(call, "audit_fees", "audit_sign");
    }
}