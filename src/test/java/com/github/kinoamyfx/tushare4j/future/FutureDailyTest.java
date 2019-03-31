package com.github.kinoamyfx.tushare4j.future;

import com.github.kinoamyfx.tushare4j.CodeUtils;
import org.junit.Test;

public class FutureDailyTest {
    String content = "<tbody><tr>\n" +
            "<td>ts_code</td>\n" +
            "<td>str</td>\n" +
            "<td>Y</td>\n" +
            "<td>TS合约代码</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>trade_date</td>\n" +
            "<td>str</td>\n" +
            "<td>Y</td>\n" +
            "<td>交易日期</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>pre_close</td>\n" +
            "<td>float</td>\n" +
            "<td>Y</td>\n" +
            "<td>昨收盘价</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>pre_settle</td>\n" +
            "<td>float</td>\n" +
            "<td>Y</td>\n" +
            "<td>昨结算价</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>open</td>\n" +
            "<td>float</td>\n" +
            "<td>Y</td>\n" +
            "<td>开盘价</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>high</td>\n" +
            "<td>float</td>\n" +
            "<td>Y</td>\n" +
            "<td>最高价</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>low</td>\n" +
            "<td>float</td>\n" +
            "<td>Y</td>\n" +
            "<td>最低价</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>close</td>\n" +
            "<td>float</td>\n" +
            "<td>Y</td>\n" +
            "<td>收盘价</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>settle</td>\n" +
            "<td>float</td>\n" +
            "<td>Y</td>\n" +
            "<td>结算价</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>change1</td>\n" +
            "<td>float</td>\n" +
            "<td>Y</td>\n" +
            "<td>涨跌1 收盘价-昨结算价</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>change2</td>\n" +
            "<td>float</td>\n" +
            "<td>Y</td>\n" +
            "<td>涨跌2 结算价-昨结算价</td>\n" +
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
            "<td>成交金额(万元)</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>oi</td>\n" +
            "<td>float</td>\n" +
            "<td>Y</td>\n" +
            "<td>持仓量(手)</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>oi_chg</td>\n" +
            "<td>float</td>\n" +
            "<td>Y</td>\n" +
            "<td>持仓量变化</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>delv_settle</td>\n" +
            "<td>float</td>\n" +
            "<td>N</td>\n" +
            "<td>交割结算价</td>\n" +
            "</tr>\n" +
            "</tbody>";

    @Test
    public void codeg() {
        CodeUtils.codeg4(content);
    }
}