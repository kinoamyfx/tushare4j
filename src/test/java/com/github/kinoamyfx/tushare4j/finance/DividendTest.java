package com.github.kinoamyfx.tushare4j.finance;

import com.github.kinoamyfx.tushare4j.CodeUtils;
import org.junit.Test;

public class DividendTest {

    String content = "<tbody><tr>\n" +
            "<td>ts_code</td>\n" +
            "<td>str</td>\n" +
            "<td>Y</td>\n" +
            "<td>TS代码</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>end_date</td>\n" +
            "<td>str</td>\n" +
            "<td>Y</td>\n" +
            "<td>分红年度</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>ann_date</td>\n" +
            "<td>str</td>\n" +
            "<td>Y</td>\n" +
            "<td>预案公告日</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>div_proc</td>\n" +
            "<td>str</td>\n" +
            "<td>Y</td>\n" +
            "<td>实施进度</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>stk_div</td>\n" +
            "<td>float</td>\n" +
            "<td>Y</td>\n" +
            "<td>每股送转</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>stk_bo_rate</td>\n" +
            "<td>float</td>\n" +
            "<td>Y</td>\n" +
            "<td>每股送股比例</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>stk_co_rate</td>\n" +
            "<td>float</td>\n" +
            "<td>Y</td>\n" +
            "<td>每股转增比例</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>cash_div</td>\n" +
            "<td>float</td>\n" +
            "<td>Y</td>\n" +
            "<td>每股分红（税后）</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>cash_div_tax</td>\n" +
            "<td>float</td>\n" +
            "<td>Y</td>\n" +
            "<td>每股分红（税前）</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>record_date</td>\n" +
            "<td>str</td>\n" +
            "<td>Y</td>\n" +
            "<td>股权登记日</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>ex_date</td>\n" +
            "<td>str</td>\n" +
            "<td>Y</td>\n" +
            "<td>除权除息日</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>pay_date</td>\n" +
            "<td>str</td>\n" +
            "<td>Y</td>\n" +
            "<td>派息日</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>div_listdate</td>\n" +
            "<td>str</td>\n" +
            "<td>Y</td>\n" +
            "<td>红股上市日</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>imp_ann_date</td>\n" +
            "<td>str</td>\n" +
            "<td>Y</td>\n" +
            "<td>实施公告日</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>base_date</td>\n" +
            "<td>str</td>\n" +
            "<td>N</td>\n" +
            "<td>基准日</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>base_share</td>\n" +
            "<td>float</td>\n" +
            "<td>N</td>\n" +
            "<td>基准股本（万）</td>\n" +
            "</tr>\n" +
            "</tbody>";

    @Test
    public void codeg() {
        CodeUtils.codeg4(content);
    }
}