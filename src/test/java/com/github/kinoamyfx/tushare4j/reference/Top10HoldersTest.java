package com.github.kinoamyfx.tushare4j.reference;

import com.github.kinoamyfx.tushare4j.CodeUtils;
import org.junit.Test;

public class Top10HoldersTest {
    String content = "<tbody><tr>\n" +
            "<td>ts_code</td>\n" +
            "<td>str</td>\n" +
            "<td>TS股票代码</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>ann_date</td>\n" +
            "<td>str</td>\n" +
            "<td>公告日期</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>end_date</td>\n" +
            "<td>str</td>\n" +
            "<td>报告期</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>holder_name</td>\n" +
            "<td>str</td>\n" +
            "<td>股东名称</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>hold_amount</td>\n" +
            "<td>float</td>\n" +
            "<td>持有数量（股）</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>hold_ratio</td>\n" +
            "<td>float</td>\n" +
            "<td>持有比例</td>\n" +
            "</tr>\n" +
            "</tbody>";

    public void codeg() {
        CodeUtils.codeg3(content);
    }
}