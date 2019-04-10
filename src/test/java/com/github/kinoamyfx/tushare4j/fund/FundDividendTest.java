package com.github.kinoamyfx.tushare4j.fund;

import com.github.kinoamyfx.tushare4j.CodeUtils;
import org.junit.Test;

public class FundDividendTest {

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
            "<td>imp_anndate</td>\n" +
            "<td>str</td>\n" +
            "<td>Y</td>\n" +
            "<td>分红实施公告日</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>base_date</td>\n" +
            "<td>str</td>\n" +
            "<td>Y</td>\n" +
            "<td>分配收益基准日</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>div_proc</td>\n" +
            "<td>str</td>\n" +
            "<td>Y</td>\n" +
            "<td>方案进度</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>record_date</td>\n" +
            "<td>str</td>\n" +
            "<td>Y</td>\n" +
            "<td>权益登记日</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>ex_date</td>\n" +
            "<td>str</td>\n" +
            "<td>Y</td>\n" +
            "<td>除息日</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>pay_date</td>\n" +
            "<td>str</td>\n" +
            "<td>Y</td>\n" +
            "<td>派息日</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>earpay_date</td>\n" +
            "<td>str</td>\n" +
            "<td>Y</td>\n" +
            "<td>收益支付日</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>net_ex_date</td>\n" +
            "<td>str</td>\n" +
            "<td>Y</td>\n" +
            "<td>净值除权日</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>div_cash</td>\n" +
            "<td>float</td>\n" +
            "<td>Y</td>\n" +
            "<td>每股派息(元)</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>base_unit</td>\n" +
            "<td>float</td>\n" +
            "<td>Y</td>\n" +
            "<td>基准基金份额(万份)</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>ear_distr</td>\n" +
            "<td>float</td>\n" +
            "<td>Y</td>\n" +
            "<td>可分配收益(元)</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>ear_amount</td>\n" +
            "<td>float</td>\n" +
            "<td>Y</td>\n" +
            "<td>收益分配金额(元)</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>account_date</td>\n" +
            "<td>str</td>\n" +
            "<td>Y</td>\n" +
            "<td>红利再投资到账日</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>base_year</td>\n" +
            "<td>str</td>\n" +
            "<td>Y</td>\n" +
            "<td>份额基准年度</td>\n" +
            "</tr>\n" +
            "</tbody>";

    public void codeg() {
        CodeUtils.codeg4(content);
    }
}