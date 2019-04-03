package com.github.kinoamyfx.tushare4j.tmt;

import com.github.kinoamyfx.tushare4j.CodeUtils;
import org.junit.Test;

public class DailyBookingTest {
    String c = "<tbody><tr>\n" +
            "<td>date</td>\n" +
            "<td>str</td>\n" +
            "<td>Y</td>\n" +
            "<td>日期</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>name</td>\n" +
            "<td>str</td>\n" +
            "<td>Y</td>\n" +
            "<td>影片名称</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>avg_price</td>\n" +
            "<td>float</td>\n" +
            "<td>Y</td>\n" +
            "<td>平均票价</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>week_amount</td>\n" +
            "<td>float</td>\n" +
            "<td>Y</td>\n" +
            "<td>当周票房（万）</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>total</td>\n" +
            "<td>float</td>\n" +
            "<td>Y</td>\n" +
            "<td>累计票房（万）</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>list_day</td>\n" +
            "<td>int</td>\n" +
            "<td>Y</td>\n" +
            "<td>上映天数</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>p_pc</td>\n" +
            "<td>int</td>\n" +
            "<td>Y</td>\n" +
            "<td>场均人次</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>wom_index</td>\n" +
            "<td>float</td>\n" +
            "<td>Y</td>\n" +
            "<td>口碑指数</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>up_ratio</td>\n" +
            "<td>float</td>\n" +
            "<td>Y</td>\n" +
            "<td>环比变化 （%）</td>\n" +
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
        CodeUtils.codeg4(c);
    }
}