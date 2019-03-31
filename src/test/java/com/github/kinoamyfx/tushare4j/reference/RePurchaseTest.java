package com.github.kinoamyfx.tushare4j.reference;

import com.github.kinoamyfx.tushare4j.CodeUtils;
import org.junit.Test;

public class RePurchaseTest {
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
            "<td>end_date</td>\n" +
            "<td>str</td>\n" +
            "<td>Y</td>\n" +
            "<td>截止日期</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>proc</td>\n" +
            "<td>str</td>\n" +
            "<td>Y</td>\n" +
            "<td>进度</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>exp_date</td>\n" +
            "<td>str</td>\n" +
            "<td>Y</td>\n" +
            "<td>过期日期</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>vol</td>\n" +
            "<td>float</td>\n" +
            "<td>Y</td>\n" +
            "<td>回购数量</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>amount</td>\n" +
            "<td>float</td>\n" +
            "<td>Y</td>\n" +
            "<td>回购金额</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>high_limit</td>\n" +
            "<td>float</td>\n" +
            "<td>Y</td>\n" +
            "<td>回购最高价</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>low_limit</td>\n" +
            "<td>float</td>\n" +
            "<td>Y</td>\n" +
            "<td>回购最低价</td>\n" +
            "</tr>\n" +
            "</tbody>";

    @Test
    public void codeg() {
        CodeUtils.codeg4(content);
    }
}