package com.github.kinoamyfx.tushare4j.reference;

import com.github.kinoamyfx.tushare4j.utils.CodeUtils;
import org.junit.Test;

public class MarginTest {
    String content = "<tbody><tr>\n" +
            "<td>trade_date</td>\n" +
            "<td>str</td>\n" +
            "<td>交易日期</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>exchange_id</td>\n" +
            "<td>str</td>\n" +
            "<td>交易所代码（SSE上交所SZSE深交所）</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>rzye</td>\n" +
            "<td>float</td>\n" +
            "<td>融资余额(元)</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>rzmre</td>\n" +
            "<td>float</td>\n" +
            "<td>融资买入额(元)</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>rzche</td>\n" +
            "<td>float</td>\n" +
            "<td>融资偿还额(元)</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>rqye</td>\n" +
            "<td>float</td>\n" +
            "<td>融券余额(元)</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>rqmcl</td>\n" +
            "<td>float</td>\n" +
            "<td>融券卖出量(股,份,手)</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>rzrqye</td>\n" +
            "<td>float</td>\n" +
            "<td>融资融券余额(元)</td>\n" +
            "</tr>\n" +
            "</tbody>";

    @Test
    public void codeg() {
        CodeUtils.codeg3(content);
    }
}