package com.github.kinoamyfx.tushare4j.reference;

import lombok.Data;

@Data
public class TopInst {
    /**
     * 交易日期
     */
    private String trade_date;
    /**
     * TS代码
     */
    private String ts_code;
    /**
     * 营业部名称
     */
    private String exalter;
    /**
     * 买入额（万）
     */
    private Float buy;
    /**
     * 买入占总成交比例
     */
    private Float buy_rate;
    /**
     * 卖出额（万）
     */
    private Float sell;
    /**
     * 卖出占总成交比例
     */
    private Float sell_rate;
    /**
     * 净成交额（万）
     */
    private Float net_buy;
}
