package com.github.kinoamyfx.tushare4j.reference;

import com.github.kinoamyfx.tushare4j.CodeUtils;
import com.github.kinoamyfx.tushare4j.TuShareClientTest;
import com.github.kinoamyfx.tushare4j.core.TuShareException;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class ConceptDetailRequestTest {
    @Test
    public void test() throws IOException, TuShareException {

        ConceptDetailRequest request = new ConceptDetailRequest()
                .id("TS2");

        Assert.assertEquals("TS2", request.id());

        CodeUtils.assertDataMethod(request);

        List<ConceptDetail> call = TuShareClientTest.client.call(request);

        CodeUtils.assertFields(call, "in_date", "out_date");
    }
}