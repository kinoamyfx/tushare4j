package com.github.kinoamyfx.tushare4j.finance;

import com.github.kinoamyfx.tushare4j.CodeUtils;
import org.junit.Test;

public class DisclosureDateTest {

    String content = "<tbody><tr>\n" +
            "<td>ts_code</td>\n" +
            "<td>str</td>\n" +
            "<td>Y</td>\n" +
            "<td>TS代码</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>ann_date</td>\n" +
            "<td>str</td>\n" +
            "<td>Y</td>\n" +
            "<td>最新披露公告日</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>end_date</td>\n" +
            "<td>str</td>\n" +
            "<td>Y</td>\n" +
            "<td>报告期</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>pre_date</td>\n" +
            "<td>str</td>\n" +
            "<td>Y</td>\n" +
            "<td>预计披露日期</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>actual_date</td>\n" +
            "<td>str</td>\n" +
            "<td>Y</td>\n" +
            "<td>实际披露日期</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>modify_date</td>\n" +
            "<td>str</td>\n" +
            "<td>Y</td>\n" +
            "<td>披露日期修正记录</td>\n" +
            "</tr>\n" +
            "</tbody>";

    @Test
    public void codeg() {
        CodeUtils.codeg4(content);
    }
}