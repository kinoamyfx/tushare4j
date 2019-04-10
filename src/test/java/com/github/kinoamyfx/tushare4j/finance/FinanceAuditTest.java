package com.github.kinoamyfx.tushare4j.finance;

import com.github.kinoamyfx.tushare4j.CodeUtils;
import org.junit.Test;

public class FinanceAuditTest {

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
            "<td>audit_result</td>\n" +
            "<td>str</td>\n" +
            "<td>审计结果</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>audit_fees</td>\n" +
            "<td>float</td>\n" +
            "<td>审计总费用（元）</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>audit_agency</td>\n" +
            "<td>str</td>\n" +
            "<td>会计事务所</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>audit_sign</td>\n" +
            "<td>str</td>\n" +
            "<td>签字会计师</td>\n" +
            "</tr>\n" +
            "</tbody>";


    public void codeg() {
        CodeUtils.codeg3(content);
    }
}