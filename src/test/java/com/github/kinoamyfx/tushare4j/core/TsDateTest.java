package com.github.kinoamyfx.tushare4j.core;

import com.github.kinoamyfx.tushare4j.utils.JsonUtils;
import org.junit.Assert;
import org.junit.Test;

import java.time.temporal.ChronoUnit;

public class TsDateTest {

    @Test
    public void test() {
        TsDate date = new TsDate("20190331");

        Assert.assertEquals(TsDate.parse("20190330"), date.minus(1, ChronoUnit.DAYS));

        Assert.assertEquals(TsDate.today(), JsonUtils.deepCopy(TsDate.today()));
        Assert.assertEquals(TsDate.today().hashCode(), JsonUtils.deepCopy(TsDate.today()).hashCode());

        Assert.assertEquals(0, TsDate.today().compareTo(JsonUtils.deepCopy(TsDate.today())));
        Assert.assertNotNull(TsDate.today().toString());
    }
}