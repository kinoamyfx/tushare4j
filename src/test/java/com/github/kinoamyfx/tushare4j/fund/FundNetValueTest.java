package com.github.kinoamyfx.tushare4j.fund;

import com.github.kinoamyfx.tushare4j.CodeUtils;
import org.junit.Test;

public class FundNetValueTest {
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
            "<td>unit_nav</td>\n" +
            "<td>float</td>\n" +
            "<td>Y</td>\n" +
            "<td>单位净值</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>accum_nav</td>\n" +
            "<td>float</td>\n" +
            "<td>Y</td>\n" +
            "<td>累计净值</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>accum_div</td>\n" +
            "<td>float</td>\n" +
            "<td>Y</td>\n" +
            "<td>累计分红</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>net_asset</td>\n" +
            "<td>float</td>\n" +
            "<td>Y</td>\n" +
            "<td>资产净值</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>total_netasset</td>\n" +
            "<td>float</td>\n" +
            "<td>Y</td>\n" +
            "<td>合计资产净值</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>adj_nav</td>\n" +
            "<td>float</td>\n" +
            "<td>Y</td>\n" +
            "<td>复权单位净值</td>\n" +
            "</tr>\n" +
            "</tbody>";

    public void codeg() {
        CodeUtils.codeg4(content);
    }
}