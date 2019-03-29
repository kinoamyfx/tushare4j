package com.github.kinoamyfx.tushare4j.finance;

import lombok.Data;

@Data
public class FinanceAudit {
    /**
     * TS股票代码
     */
    private String ts_code;
    /**
     * 公告日期
     */
    private String ann_date;
    /**
     * 报告期
     */
    private String end_date;
    /**
     * 审计结果
     */
    private String audit_result;
    /**
     * 审计总费用（元）
     */
    private Float audit_fees;
    /**
     * 会计事务所
     */
    private String audit_agency;
    /**
     * 签字会计师
     */
    private String audit_sign;
}
