package com.github.kinoamyfx.tushare4j.core;

import com.github.kinoamyfx.tushare4j.utils.JsonUtils;
import org.junit.Test;

public class TsDateTest {

    @Test
    public void test() {
        TsDate date = TsDate.today();
        String json = JsonUtils.toJson(date);
        TsDate copy = JsonUtils.parseObject(json, TsDate.class);
    }
}