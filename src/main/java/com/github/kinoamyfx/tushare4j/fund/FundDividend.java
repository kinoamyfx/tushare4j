package com.github.kinoamyfx.tushare4j.fund;

import lombok.Data;

@Data
public class FundDividend {
    /**
     * TS代码
     */
    private String ts_code;
    /**
     * 公告日期
     */
    private String ann_date;
    /**
     * 分红实施公告日
     */
    private String imp_anndate;
    /**
     * 分配收益基准日
     */
    private String base_date;
    /**
     * 方案进度
     */
    private String div_proc;
    /**
     * 权益登记日
     */
    private String record_date;
    /**
     * 除息日
     */
    private String ex_date;
    /**
     * 派息日
     */
    private String pay_date;
    /**
     * 收益支付日
     */
    private String earpay_date;
    /**
     * 净值除权日
     */
    private String net_ex_date;
    /**
     * 每股派息(元)
     */
    private Float div_cash;
    /**
     * 基准基金份额(万份)
     */
    private Float base_unit;
    /**
     * 可分配收益(元)
     */
    private Float ear_distr;
    /**
     * 收益分配金额(元)
     */
    private Float ear_amount;
    /**
     * 红利再投资到账日
     */
    private String account_date;
    /**
     * 份额基准年度
     */
    private String base_year;
}
