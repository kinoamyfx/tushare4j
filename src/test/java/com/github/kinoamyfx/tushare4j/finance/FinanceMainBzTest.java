package com.github.kinoamyfx.tushare4j.finance;

import com.github.kinoamyfx.tushare4j.CodeUtils;
import org.junit.Test;

public class FinanceMainBzTest {

    String content = "<tbody><tr>\n" +
            "<td>ts_code</td>\n" +
            "<td>str</td>\n" +
            "<td>TS代码</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>end_date</td>\n" +
            "<td>str</td>\n" +
            "<td>报告期</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>bz_item</td>\n" +
            "<td>str</td>\n" +
            "<td>主营业务来源</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>bz_sales</td>\n" +
            "<td>float</td>\n" +
            "<td>主营业务收入(元)</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>bz_profit</td>\n" +
            "<td>float</td>\n" +
            "<td>主营业务利润(元)</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>bz_cost</td>\n" +
            "<td>float</td>\n" +
            "<td>主营业务成本(元)</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>curr_type</td>\n" +
            "<td>str</td>\n" +
            "<td>货币代码</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>update_flag</td>\n" +
            "<td>str</td>\n" +
            "<td>是否更新</td>\n" +
            "</tr>\n" +
            "</tbody>";

    public void codeg() {
        CodeUtils.codeg3(content);
    }
}