package com.github.kinoamyfx.tushare4j.fund;

import com.github.kinoamyfx.tushare4j.CodeUtils;
import org.junit.Test;

public class FundDailyTest {

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
            "<td>交易日期</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>open</td>\n" +
            "<td>float</td>\n" +
            "<td>Y</td>\n" +
            "<td>开盘价(元)</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>high</td>\n" +
            "<td>float</td>\n" +
            "<td>Y</td>\n" +
            "<td>最高价(元)</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>low</td>\n" +
            "<td>float</td>\n" +
            "<td>Y</td>\n" +
            "<td>最低价(元)</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>close</td>\n" +
            "<td>float</td>\n" +
            "<td>Y</td>\n" +
            "<td>收盘价(元)</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>pre_close</td>\n" +
            "<td>float</td>\n" +
            "<td>Y</td>\n" +
            "<td>昨收盘价(元)</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>change</td>\n" +
            "<td>float</td>\n" +
            "<td>Y</td>\n" +
            "<td>涨跌额(元)</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>pct_chg</td>\n" +
            "<td>float</td>\n" +
            "<td>Y</td>\n" +
            "<td>涨跌幅(%)</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>vol</td>\n" +
            "<td>float</td>\n" +
            "<td>Y</td>\n" +
            "<td>成交量(手)</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>amount</td>\n" +
            "<td>float</td>\n" +
            "<td>Y</td>\n" +
            "<td>成交额(千元)</td>\n" +
            "</tr>\n" +
            "</tbody>";

    public void codeg() {
        CodeUtils.codeg4(content);
    }
}