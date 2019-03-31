package com.github.kinoamyfx.tushare4j.future;

import com.github.kinoamyfx.tushare4j.CodeUtils;
import org.junit.Test;

public class FutureHoldingTest {
    String content = "<tbody><tr>\n" +
            "<td>trade_date</td>\n" +
            "<td>str</td>\n" +
            "<td>Y</td>\n" +
            "<td>交易日期</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>symbol</td>\n" +
            "<td>str</td>\n" +
            "<td>Y</td>\n" +
            "<td>合约代码或类型</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>broker</td>\n" +
            "<td>str</td>\n" +
            "<td>Y</td>\n" +
            "<td>期货公司会员简称</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>vol</td>\n" +
            "<td>int</td>\n" +
            "<td>Y</td>\n" +
            "<td>成交量</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>vol_chg</td>\n" +
            "<td>int</td>\n" +
            "<td>Y</td>\n" +
            "<td>成交量变化</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>long_hld</td>\n" +
            "<td>int</td>\n" +
            "<td>Y</td>\n" +
            "<td>持买仓量</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>long_chg</td>\n" +
            "<td>int</td>\n" +
            "<td>Y</td>\n" +
            "<td>持买仓量变化</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>short_hld</td>\n" +
            "<td>int</td>\n" +
            "<td>Y</td>\n" +
            "<td>持卖仓量</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>short_chg</td>\n" +
            "<td>int</td>\n" +
            "<td>Y</td>\n" +
            "<td>持卖仓量变化</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>exchange</td>\n" +
            "<td>str</td>\n" +
            "<td>N</td>\n" +
            "<td>交易所</td>\n" +
            "</tr>\n" +
            "</tbody>";

    @Test
    public void codeg() {
        CodeUtils.codeg4(content);
    }
}