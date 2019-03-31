package com.github.kinoamyfx.tushare4j.tmt;

import com.github.kinoamyfx.tushare4j.CodeUtils;
import org.junit.Test;

public class CinemaBookingTest {
    String content = "<tbody><tr>\n" +
            "<td>date</td>\n" +
            "<td>str</td>\n" +
            "<td>Y</td>\n" +
            "<td>日期</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>c_name</td>\n" +
            "<td>str</td>\n" +
            "<td>Y</td>\n" +
            "<td>影院名称</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>aud_count</td>\n" +
            "<td>int</td>\n" +
            "<td>Y</td>\n" +
            "<td>观众人数</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>att_ratio</td>\n" +
            "<td>float</td>\n" +
            "<td>Y</td>\n" +
            "<td>上座率</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>day_amount</td>\n" +
            "<td>float</td>\n" +
            "<td>Y</td>\n" +
            "<td>当日票房</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>day_showcount</td>\n" +
            "<td>float</td>\n" +
            "<td>Y</td>\n" +
            "<td>当日场次</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>avg_price</td>\n" +
            "<td>float</td>\n" +
            "<td>Y</td>\n" +
            "<td>场均票价（元）</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>p_pc</td>\n" +
            "<td>float</td>\n" +
            "<td>Y</td>\n" +
            "<td>场均人次</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>rank</td>\n" +
            "<td>int</td>\n" +
            "<td>Y</td>\n" +
            "<td>排名</td>\n" +
            "</tr>\n" +
            "</tbody>";

    @Test
    public void codeg() {
        CodeUtils.codeg4(content);
    }
}