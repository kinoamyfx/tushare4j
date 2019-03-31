package com.github.kinoamyfx.tushare4j.reference;

import com.github.kinoamyfx.tushare4j.CodeUtils;
import org.junit.Test;

public class GGTTop10Test {

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
            "<td>p_change</td>\n" +
            "<td>float</td>\n" +
            "<td>涨跌幅</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>rank</td>\n" +
            "<td>str</td>\n" +
            "<td>资金排名</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>market_type</td>\n" +
            "<td>str</td>\n" +
            "<td>市场类型 2：港股通（沪） 4：港股通（深）</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>amount</td>\n" +
            "<td>float</td>\n" +
            "<td>累计成交金额（元）</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>net_amount</td>\n" +
            "<td>float</td>\n" +
            "<td>净买入金额（元）</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>sh_amount</td>\n" +
            "<td>float</td>\n" +
            "<td>沪市成交金额（元）</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>sh_net_amount</td>\n" +
            "<td>float</td>\n" +
            "<td>沪市净买入金额（元）</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>sh_buy</td>\n" +
            "<td>float</td>\n" +
            "<td>沪市买入金额（元）</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>sh_sell</td>\n" +
            "<td>float</td>\n" +
            "<td>沪市卖出金额</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>sz_amount</td>\n" +
            "<td>float</td>\n" +
            "<td>深市成交金额（元）</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>sz_net_amount</td>\n" +
            "<td>float</td>\n" +
            "<td>深市净买入金额（元）</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>sz_buy</td>\n" +
            "<td>float</td>\n" +
            "<td>深市买入金额（元）</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>sz_sell</td>\n" +
            "<td>float</td>\n" +
            "<td>深市卖出金额（元）</td>\n" +
            "</tr>\n" +
            "</tbody>";

    @Test
    public void codeg() {
        CodeUtils.codeg3(content);
    }
}