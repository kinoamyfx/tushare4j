package com.github.kinoamyfx.tushare4j.enums;

import org.junit.Assert;
import org.junit.Test;

public class ExchangeTest {
    @Test
    public void test() {
        Exchange.valueOf(Exchange.SSE.name());
        IsHs.valueOf(IsHs.H.name());
        ListStatus.valueOf(ListStatus.L.name());
        NewsSource.valueOf(NewsSource.SINA.name());
        Assert.assertNotNull(NewsSource.SINA.toString());
    }
}