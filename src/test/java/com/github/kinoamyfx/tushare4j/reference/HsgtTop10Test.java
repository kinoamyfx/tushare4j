package com.github.kinoamyfx.tushare4j.reference;

import com.github.kinoamyfx.tushare4j.CodeUtils;
import org.junit.Test;

public class HsgtTop10Test {
    String content = "<tbody><tr>\n" +
            "<td>trade_date</td>\n" +
            "<td>str</td>\n" +
            "<td>交易日期</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>ts_code</td>\n" +
            "<td>str</td>\n" +
            "<td>股票代码</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>name</td>\n" +
            "<td>str</td>\n" +
            "<td>股票名称</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>close</td>\n" +
            "<td>float</td>\n" +
            "<td>收盘价</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>change</td>\n" +
            "<td>float</td>\n" +
            "<td>涨跌额</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>rank</td>\n" +
            "<td>int</td>\n" +
            "<td>资金排名</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>market_type</td>\n" +
            "<td>str</td>\n" +
            "<td>市场类型（1：沪市 3：深市）</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>amount</td>\n" +
            "<td>float</td>\n" +
            "<td>成交金额（元）</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>net_amount</td>\n" +
            "<td>float</td>\n" +
            "<td>净成交金额（元）</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>buy</td>\n" +
            "<td>float</td>\n" +
            "<td>买入金额（元）</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>sell</td>\n" +
            "<td>float</td>\n" +
            "<td>卖出金额（元）</td>\n" +
            "</tr>\n" +
            "</tbody>";

    @Test
    public void codeg() {
        CodeUtils.codeg3(content);
    }
}