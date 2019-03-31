package com.github.kinoamyfx.tushare4j.tmt;

import lombok.Data;

@Data
public class TmtTWIncomeDetail {
    /**
     * 报告期
     */
    private String date;
    /**
     * 产品代码
     */
    private String item;
    /**
     * 公司代码
     */
    private String symbol;
    /**
     * 月度营收
     */
    private String op_income;
    /**
     * 合并月度营收（默认不展示）
     */
    private String consop_income;
}
