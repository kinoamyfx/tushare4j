package com.github.kinoamyfx.tushare4j.reference;

import com.github.kinoamyfx.tushare4j.utils.CodeUtils;
import org.junit.Test;

public class MarginDetailTest {
    String content = "<tbody><tr>\n" +
            "<td>trade_date</td>\n" +
            "<td>str</td>\n" +
            "<td>交易日期</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>ts_code</td>\n" +
            "<td>str</td>\n" +
            "<td>TS股票代码</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>rzye</td>\n" +
            "<td>float</td>\n" +
            "<td>融资余额(元)</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>rqye</td>\n" +
            "<td>float</td>\n" +
            "<td>融券余额(元)</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>rzmre</td>\n" +
            "<td>float</td>\n" +
            "<td>融资买入额(元)</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>rqyl</td>\n" +
            "<td>float</td>\n" +
            "<td>融券余量（手）</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>rzche</td>\n" +
            "<td>float</td>\n" +
            "<td>融资偿还额(元)</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>rqchl</td>\n" +
            "<td>float</td>\n" +
            "<td>融券偿还量(手)</td>\n" +
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