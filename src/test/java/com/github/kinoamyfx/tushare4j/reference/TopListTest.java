package com.github.kinoamyfx.tushare4j.reference;

import com.github.kinoamyfx.tushare4j.utils.CodeUtils;
import org.junit.Test;

public class TopListTest {
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
            "<td>name</td>\n" +
            "<td>str</td>\n" +
            "<td>Y</td>\n" +
            "<td>名称</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>close</td>\n" +
            "<td>float</td>\n" +
            "<td>Y</td>\n" +
            "<td>收盘价</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>pct_change</td>\n" +
            "<td>float</td>\n" +
            "<td>Y</td>\n" +
            "<td>涨跌幅</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>turnover_rate</td>\n" +
            "<td>float</td>\n" +
            "<td>Y</td>\n" +
            "<td>换手率</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>amount</td>\n" +
            "<td>float</td>\n" +
            "<td>Y</td>\n" +
            "<td>总成交额</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>l_sell</td>\n" +
            "<td>float</td>\n" +
            "<td>Y</td>\n" +
            "<td>龙虎榜卖出额</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>l_buy</td>\n" +
            "<td>float</td>\n" +
            "<td>Y</td>\n" +
            "<td>龙虎榜买入额</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>l_amount</td>\n" +
            "<td>float</td>\n" +
            "<td>Y</td>\n" +
            "<td>龙虎榜成交额</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>net_amount</td>\n" +
            "<td>float</td>\n" +
            "<td>Y</td>\n" +
            "<td>龙虎榜净买入额</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>net_rate</td>\n" +
            "<td>float</td>\n" +
            "<td>Y</td>\n" +
            "<td>龙虎榜净买额占比</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>amount_rate</td>\n" +
            "<td>float</td>\n" +
            "<td>Y</td>\n" +
            "<td>龙虎榜成交额占比</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>float_values</td>\n" +
            "<td>float</td>\n" +
            "<td>Y</td>\n" +
            "<td>当日流通市值</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>reason</td>\n" +
            "<td>str</td>\n" +
            "<td>Y</td>\n" +
            "<td>上榜理由</td>\n" +
            "</tr>\n" +
            "</tbody>";

    @Test
    public void codeg() {
        CodeUtils.codeg4(content);
    }
}