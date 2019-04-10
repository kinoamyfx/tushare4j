package com.github.kinoamyfx.tushare4j.fund;

import com.github.kinoamyfx.tushare4j.CodeUtils;
import org.junit.Test;

public class FundPortfolioTest {
    String content = "<tbody><tr>\n" +
            "<td>ts_code</td>\n" +
            "<td>str</td>\n" +
            "<td>Y</td>\n" +
            "<td>TS基金代码</td>\n" +
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
            "<td>symbol</td>\n" +
            "<td>str</td>\n" +
            "<td>Y</td>\n" +
            "<td>股票代码</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>mkv</td>\n" +
            "<td>float</td>\n" +
            "<td>Y</td>\n" +
            "<td>持有股票市值(元)</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>amount</td>\n" +
            "<td>float</td>\n" +
            "<td>Y</td>\n" +
            "<td>持有股票数量（股）</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>stk_mkv_ratio</td>\n" +
            "<td>float</td>\n" +
            "<td>Y</td>\n" +
            "<td>占股票市值比</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>stk_float_ratio</td>\n" +
            "<td>float</td>\n" +
            "<td>Y</td>\n" +
            "<td>占流通股本比例</td>\n" +
            "</tr>\n" +
            "</tbody>";

    public void codeg() {
        CodeUtils.codeg4(content);
    }
}