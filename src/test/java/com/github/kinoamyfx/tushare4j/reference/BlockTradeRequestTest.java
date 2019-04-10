package com.github.kinoamyfx.tushare4j.reference;

import com.github.kinoamyfx.tushare4j.CodeUtils;
import com.github.kinoamyfx.tushare4j.TuShareClientTest;
import com.github.kinoamyfx.tushare4j.core.TsDate;
import com.github.kinoamyfx.tushare4j.core.TuShareException;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class BlockTradeRequestTest {
    @Test
    public void test() throws IOException, TuShareException {
        BlockTradeRequest request = new BlockTradeRequest()
                .tsCode("601318.SH")
                .tradeDate(TsDate.parse("20181227"))
                .startDate(null)
                .endDate(null);
        Assert.assertNull(request.startDate());
        Assert.assertNull(request.endDate());
        Assert.assertEquals("601318.SH", request.tsCode());
        Assert.assertEquals(TsDate.parse("20181227"), request.tradeDate());

        CodeUtils.assertDataMethod(request);

        List<BlockTrade> call = TuShareClientTest.client.call(request);

        CodeUtils.assertFields(call);
    }
}