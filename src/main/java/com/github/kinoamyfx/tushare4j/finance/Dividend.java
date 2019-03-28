package com.github.kinoamyfx.tushare4j.finance;

import lombok.Data;

@Data
public class Dividend {

    /**
     * TS代码
     */
    private String ts_code;
    /**
     * 分红年度
     */
    private String end_date;
    /**
     * 预案公告日
     */
    private String ann_date;
    /**
     * 实施进度
     */
    private String div_proc;
    /**
     * 每股送转
     */
    private Float stk_div;
    /**
     * 每股送股比例
     */
    private Float stk_bo_rate;
    /**
     * 每股转增比例
     */
    private Float stk_co_rate;
    /**
     * 每股分红（税后）
     */
    private Float cash_div;
    /**
     * 每股分红（税前）
     */
    private Float cash_div_tax;
    /**
     * 股权登记日
     */
    private String record_date;
    /**
     * 除权除息日
     */
    private String ex_date;
    /**
     * 派息日
     */
    private String pay_date;
    /**
     * 红股上市日
     */
    private String div_listdate;
    /**
     * 实施公告日
     */
    private String imp_ann_date;
    /**
     * 基准日
     */
    private String base_date;
    /**
     * 基准股本（万）
     */
    private Float base_share;

}
