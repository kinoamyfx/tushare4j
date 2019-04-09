package com.github.kinoamyfx.tushare4j.core;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TuShareExceptionTest {
    @Test
    public void test() {
        TuShareException tuShareException = new TuShareException(1, "test");
        assertEquals(tuShareException.getMessage(), "1:test");
    }
}