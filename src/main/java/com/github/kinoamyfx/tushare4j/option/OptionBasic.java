package com.github.kinoamyfx.tushare4j.option;

import lombok.Data;

@Data
public class OptionBasic {
    /**
     * TS代码
     */
    private String ts_code;
    /**
     * 交易市场
     */
    private String exchange;
    /**
     * 合约名称
     */
    private String name;
    /**
     * 合约单位
     */
    private String per_unit;
    /**
     * 标准合约代码
     */
    private String opt_code;
    /**
     * 合约类型
     */
    private String opt_type;
    /**
     * 期权类型
     */
    private String call_put;
    /**
     * 行权方式
     */
    private String exercise_type;
    /**
     * 行权价格
     */
    private Float exercise_price;
    /**
     * 结算月
     */
    private String s_month;
    /**
     * 到期日
     */
    private String maturity_date;
    /**
     * 挂牌基准价
     */
    private Float list_price;
    /**
     * 开始交易日期
     */
    private String list_date;
    /**
     * 最后交易日期
     */
    private String delist_date;
    /**
     * 最后行权日期
     */
    private String last_edate;
    /**
     * 最后交割日期
     */
    private String last_ddate;
    /**
     * 报价单位
     */
    private String quote_unit;
    /**
     * 最小价格波幅
     */
    private String min_price_chg;
}
