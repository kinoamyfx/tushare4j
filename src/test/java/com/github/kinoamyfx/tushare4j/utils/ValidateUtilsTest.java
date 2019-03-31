package com.github.kinoamyfx.tushare4j.utils;

import org.junit.Test;

public class ValidateUtilsTest {

    @Test
    public void testNotNull() {
        ValidateUtils.eitherNotNull(null, "tests");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNull() {
        ValidateUtils.eitherNotNull(null, null, null);
    }


}