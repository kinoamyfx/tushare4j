package com.github.kinoamyfx.tushare4j.market;

import com.github.kinoamyfx.tushare4j.CodeUtils;
import org.junit.Test;

public class DailyBasicTest {
    String content = "<tbody><tr>\n" +
            "<td>ts_code</td>\n" +
            "<td>str</td>\n" +
            "<td>TS股票代码</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>trade_date</td>\n" +
            "<td>str</td>\n" +
            "<td>交易日期</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>close</td>\n" +
            "<td>float</td>\n" +
            "<td>当日收盘价</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>turnover_rate</td>\n" +
            "<td>float</td>\n" +
            "<td>换手率（%）</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>turnover_rate_f</td>\n" +
            "<td>float</td>\n" +
            "<td>换手率（自由流通股）</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>volume_ratio</td>\n" +
            "<td>float</td>\n" +
            "<td>量比</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>pe</td>\n" +
            "<td>float</td>\n" +
            "<td>市盈率（总市值/净利润）</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>pe_ttm</td>\n" +
            "<td>float</td>\n" +
            "<td>市盈率（TTM）</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>pb</td>\n" +
            "<td>float</td>\n" +
            "<td>市净率（总市值/净资产）</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>ps</td>\n" +
            "<td>float</td>\n" +
            "<td>市销率</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>ps_ttm</td>\n" +
            "<td>float</td>\n" +
            "<td>市销率（TTM）</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>total_share</td>\n" +
            "<td>float</td>\n" +
            "<td>总股本 （万股）</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>float_share</td>\n" +
            "<td>float</td>\n" +
            "<td>流通股本 （万股）</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>free_share</td>\n" +
            "<td>float</td>\n" +
            "<td>自由流通股本 （万）</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>total_mv</td>\n" +
            "<td>float</td>\n" +
            "<td>总市值 （万元）</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>circ_mv</td>\n" +
            "<td>float</td>\n" +
            "<td>流通市值（万元）</td>\n" +
            "</tr>\n" +
            "</tbody>";

    @Test
    public void codeg() {
        CodeUtils.codeg3(content);
    }
}