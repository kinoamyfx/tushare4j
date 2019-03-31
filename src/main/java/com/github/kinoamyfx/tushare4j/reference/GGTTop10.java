package com.github.kinoamyfx.tushare4j.reference;

import lombok.Data;

@Data
public class GGTTop10 {
    /**
     * 交易日期
     */
    private String trade_date;
    /**
     * 股票代码
     */
    private String ts_code;
    /**
     * 股票名称
     */
    private String name;
    /**
     * 收盘价
     */
    private Float close;
    /**
     * 涨跌幅
     */
    private Float p_change;
    /**
     * 资金排名
     */
    private String rank;
    /**
     * 市场类型 2：港股通（沪） 4：港股通（深）
     */
    private String market_type;
    /**
     * 累计成交金额（元）
     */
    private Float amount;
    /**
     * 净买入金额（元）
     */
    private Float net_amount;
    /**
     * 沪市成交金额（元）
     */
    private Float sh_amount;
    /**
     * 沪市净买入金额（元）
     */
    private Float sh_net_amount;
    /**
     * 沪市买入金额（元）
     */
    private Float sh_buy;
    /**
     * 沪市卖出金额
     */
    private Float sh_sell;
    /**
     * 深市成交金额（元）
     */
    private Float sz_amount;
    /**
     * 深市净买入金额（元）
     */
    private Float sz_net_amount;
    /**
     * 深市买入金额（元）
     */
    private Float sz_buy;
    /**
     * 深市卖出金额（元）
     */
    private Float sz_sell;
}
