package com.github.kinoamyfx.tushare4j.reference;

import com.github.kinoamyfx.tushare4j.CodeUtils;
import org.junit.Test;

public class BlockTradeTest {
    String content = "<tbody><tr>\n" +
            "<td>ts_code</td>\n" +
            "<td>str</td>\n" +
            "<td>Y</td>\n" +
            "<td>TS代码</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>trade_date</td>\n" +
            "<td>str</td>\n" +
            "<td>Y</td>\n" +
            "<td>交易日历</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>price</td>\n" +
            "<td>float</td>\n" +
            "<td>Y</td>\n" +
            "<td>成交价</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>vol</td>\n" +
            "<td>float</td>\n" +
            "<td>Y</td>\n" +
            "<td>成交量（万股）</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>amount</td>\n" +
            "<td>float</td>\n" +
            "<td>Y</td>\n" +
            "<td>成交金额</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>buyer</td>\n" +
            "<td>str</td>\n" +
            "<td>Y</td>\n" +
            "<td>买方营业部</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>seller</td>\n" +
            "<td>str</td>\n" +
            "<td>Y</td>\n" +
            "<td>卖方营业部</td>\n" +
            "</tr>\n" +
            "</tbody>";

    public void codeg() {
        CodeUtils.codeg4(content);
    }
}