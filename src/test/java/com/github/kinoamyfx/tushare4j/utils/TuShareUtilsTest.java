package com.github.kinoamyfx.tushare4j.utils;

import com.github.kinoamyfx.tushare4j.market.KLine;
import com.github.kinoamyfx.tushare4j.market.StockDailyRequest;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;
import java.util.Map;

public class TuShareUtilsTest {
    @Test
    public void test() {
        StockDailyRequest request = new StockDailyRequest().tsCode("600000.SH");

        Map<String, String> params = TuShareUtils.resolveTsParams(request);

        Assert.assertEquals("600000.SH", params.get("ts_code"));

        Class<KLine> responseType = TuShareUtils.getResponseType(request);

        List<String> strings = TuShareUtils.resolveTsFields(responseType);

        Assert.assertFalse(strings.isEmpty());
    }
}