package com.github.kinoamyfx.tushare4j.enums;

import com.github.kinoamyfx.tushare4j.index.IndexBasicRequest;
import org.junit.Test;

public class MarketTest {

    @Test
    public void test() {
        IndexBasicRequest.Market.valueOf("SW");
    }
}