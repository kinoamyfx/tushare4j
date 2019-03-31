package com.github.kinoamyfx.tushare4j.reference;

import com.github.kinoamyfx.tushare4j.utils.CodeUtils;
import org.junit.Test;

public class PledgeStatTest {
    String content = "<tbody><tr>\n" +
            "<td>ts_code</td>\n" +
            "<td>str</td>\n" +
            "<td>Y</td>\n" +
            "<td>TS代码</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>end_date</td>\n" +
            "<td>str</td>\n" +
            "<td>Y</td>\n" +
            "<td>截至日期</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>pledge_count</td>\n" +
            "<td>int</td>\n" +
            "<td>Y</td>\n" +
            "<td>质押次数</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>unrest_pledge</td>\n" +
            "<td>float</td>\n" +
            "<td>Y</td>\n" +
            "<td>无限售股质押数量（万）</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>rest_pledge</td>\n" +
            "<td>float</td>\n" +
            "<td>Y</td>\n" +
            "<td>限售股份质押数量（万）</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>total_share</td>\n" +
            "<td>float</td>\n" +
            "<td>Y</td>\n" +
            "<td>总股本</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>pledge_ratio</td>\n" +
            "<td>float</td>\n" +
            "<td>Y</td>\n" +
            "<td>质押比例</td>\n" +
            "</tr>\n" +
            "</tbody>";

    @Test
    public void codeg() {
        CodeUtils.codeg4(content);
    }
}