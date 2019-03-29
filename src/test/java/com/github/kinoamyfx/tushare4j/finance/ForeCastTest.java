package com.github.kinoamyfx.tushare4j.finance;

import com.github.kinoamyfx.tushare4j.utils.CodeUtils;

public class ForeCastTest {

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
            "<td>type</td>\n" +
            "<td>str</td>\n" +
            "<td>业绩预告类型(预增/预减/扭亏/首亏/续亏/续盈/略增/略减)</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>p_change_min</td>\n" +
            "<td>float</td>\n" +
            "<td>预告净利润变动幅度下限（%）</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>p_change_max</td>\n" +
            "<td>float</td>\n" +
            "<td>预告净利润变动幅度上限（%）</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>net_profit_min</td>\n" +
            "<td>float</td>\n" +
            "<td>预告净利润下限（万元）</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>net_profit_max</td>\n" +
            "<td>float</td>\n" +
            "<td>预告净利润上限（万元）</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>last_parent_net</td>\n" +
            "<td>float</td>\n" +
            "<td>上年同期归属母公司净利润</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>first_ann_date</td>\n" +
            "<td>str</td>\n" +
            "<td>首次公告日</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>summary</td>\n" +
            "<td>str</td>\n" +
            "<td>业绩预告摘要</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>change_reason</td>\n" +
            "<td>str</td>\n" +
            "<td>业绩变动原因</td>\n" +
            "</tr>\n" +
            "</tbody>";


    public void codeg() {
        CodeUtils.codeg3(content);
    }
}