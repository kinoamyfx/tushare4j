package com.github.kinoamyfx.tushare4j.reference;

import com.github.kinoamyfx.tushare4j.CodeUtils;
import org.junit.Test;

public class TopInstTest {
    String content = "<tbody><tr>\n" +
            "<td>trade_date</td>\n" +
            "<td>str</td>\n" +
            "<td>Y</td>\n" +
            "<td>交易日期</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>ts_code</td>\n" +
            "<td>str</td>\n" +
            "<td>Y</td>\n" +
            "<td>TS代码</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>exalter</td>\n" +
            "<td>str</td>\n" +
            "<td>Y</td>\n" +
            "<td>营业部名称</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>buy</td>\n" +
            "<td>float</td>\n" +
            "<td>Y</td>\n" +
            "<td>买入额（万）</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>buy_rate</td>\n" +
            "<td>float</td>\n" +
            "<td>Y</td>\n" +
            "<td>买入占总成交比例</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>sell</td>\n" +
            "<td>float</td>\n" +
            "<td>Y</td>\n" +
            "<td>卖出额（万）</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>sell_rate</td>\n" +
            "<td>float</td>\n" +
            "<td>Y</td>\n" +
            "<td>卖出占总成交比例</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>net_buy</td>\n" +
            "<td>float</td>\n" +
            "<td>Y</td>\n" +
            "<td>净成交额（万）</td>\n" +
            "</tr>\n" +
            "</tbody>";

    @Test
    public void codeg() {
        CodeUtils.codeg4(content);
    }
}