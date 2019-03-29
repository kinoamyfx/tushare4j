package com.github.kinoamyfx.tushare4j.reference;

import com.github.kinoamyfx.tushare4j.utils.CodeUtils;
import org.junit.Test;

public class ShareFloatTest {

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
            "<td>公告日期</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>float_date</td>\n" +
            "<td>str</td>\n" +
            "<td>Y</td>\n" +
            "<td>解禁日期</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>float_share</td>\n" +
            "<td>float</td>\n" +
            "<td>Y</td>\n" +
            "<td>流通股份</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>float_ratio</td>\n" +
            "<td>float</td>\n" +
            "<td>Y</td>\n" +
            "<td>流通股份占总股本比率</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>holder_name</td>\n" +
            "<td>str</td>\n" +
            "<td>Y</td>\n" +
            "<td>股东名称</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>share_type</td>\n" +
            "<td>str</td>\n" +
            "<td>Y</td>\n" +
            "<td>股份类型</td>\n" +
            "</tr>\n" +
            "</tbody>";

    @Test
    public void codeg() {
        CodeUtils.codeg4(content);
    }
}