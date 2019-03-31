package com.github.kinoamyfx.tushare4j.reference;

import com.github.kinoamyfx.tushare4j.CodeUtils;
import org.junit.Test;

public class ConceptDetailTest {
    String content = "<tbody><tr>\n" +
            "<td>id</td>\n" +
            "<td>str</td>\n" +
            "<td>Y</td>\n" +
            "<td>概念代码</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>ts_code</td>\n" +
            "<td>str</td>\n" +
            "<td>Y</td>\n" +
            "<td>股票代码</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>name</td>\n" +
            "<td>str</td>\n" +
            "<td>Y</td>\n" +
            "<td>股票名称</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>in_date</td>\n" +
            "<td>str</td>\n" +
            "<td>N</td>\n" +
            "<td>纳入日期</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>out_date</td>\n" +
            "<td>str</td>\n" +
            "<td>N</td>\n" +
            "<td>剔除日期</td>\n" +
            "</tr>\n" +
            "</tbody>";

    @Test
    public void codeg() {
        CodeUtils.codeg4(content);
    }
}