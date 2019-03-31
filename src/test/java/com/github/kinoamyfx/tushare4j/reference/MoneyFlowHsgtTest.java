package com.github.kinoamyfx.tushare4j.reference;

import com.github.kinoamyfx.tushare4j.utils.CodeUtils;
import org.junit.Test;

public class MoneyFlowHsgtTest {

    String content = "<tbody><tr>\n" +
            "<td>trade_date</td>\n" +
            "<td>str</td>\n" +
            "<td>交易日期</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>ggt_ss</td>\n" +
            "<td>str</td>\n" +
            "<td>港股通（上海）</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>ggt_sz</td>\n" +
            "<td>str</td>\n" +
            "<td>港股通（深圳）</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>hgt</td>\n" +
            "<td>str</td>\n" +
            "<td>沪股通（百万元）</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>sgt</td>\n" +
            "<td>str</td>\n" +
            "<td>深股通（百万元）</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>north_money</td>\n" +
            "<td>str</td>\n" +
            "<td>北向资金（百万元）</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>south_money</td>\n" +
            "<td>str</td>\n" +
            "<td>南向资金（百万元）</td>\n" +
            "</tr>\n" +
            "</tbody>";

    @Test
    public void codeg() {
        CodeUtils.codeg3(content);
    }
}