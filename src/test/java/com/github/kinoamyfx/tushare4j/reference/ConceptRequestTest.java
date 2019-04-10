package com.github.kinoamyfx.tushare4j.reference;

import com.github.kinoamyfx.tushare4j.CodeUtils;
import com.github.kinoamyfx.tushare4j.TuShareClientTest;
import com.github.kinoamyfx.tushare4j.core.TuShareException;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

public class ConceptRequestTest {
    @Test
    public void test() throws IOException, TuShareException {
        ConceptRequest request = new ConceptRequest().src("ts");

        Assert.assertEquals("ts", request.src());
        CodeUtils.assertDataMethod(request);

        List<Concept> call = TuShareClientTest.client.call(request);

        CodeUtils.assertFields(call, Collections.emptyList());
    }
}