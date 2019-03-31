package com.github.kinoamyfx.tushare4j.index;

import com.github.kinoamyfx.tushare4j.CodeUtils;
import org.junit.Test;

public class IndexDailyBasicTest {
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
            "<td>total_mv</td>\n" +
            "<td>float</td>\n" +
            "<td>Y</td>\n" +
            "<td>当日总市值（元）</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>float_mv</td>\n" +
            "<td>float</td>\n" +
            "<td>Y</td>\n" +
            "<td>当日流通市值（元）</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>total_share</td>\n" +
            "<td>float</td>\n" +
            "<td>Y</td>\n" +
            "<td>当日总股本（股）</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>float_share</td>\n" +
            "<td>float</td>\n" +
            "<td>Y</td>\n" +
            "<td>当日流通股本（股）</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>free_share</td>\n" +
            "<td>float</td>\n" +
            "<td>Y</td>\n" +
            "<td>当日自由流通股本（股）</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>turnover_rate</td>\n" +
            "<td>float</td>\n" +
            "<td>Y</td>\n" +
            "<td>换手率</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>turnover_rate_f</td>\n" +
            "<td>float</td>\n" +
            "<td>Y</td>\n" +
            "<td>换手率(基于自由流通股本)</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>pe</td>\n" +
            "<td>float</td>\n" +
            "<td>Y</td>\n" +
            "<td>市盈率</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>pe_ttm</td>\n" +
            "<td>float</td>\n" +
            "<td>Y</td>\n" +
            "<td>市盈率TTM</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>pb</td>\n" +
            "<td>float</td>\n" +
            "<td>Y</td>\n" +
            "<td>市净率</td>\n" +
            "</tr>\n" +
            "</tbody>";

    @Test
    public void codeg() {
        CodeUtils.codeg4(content);
    }
}