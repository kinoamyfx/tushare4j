package com.github.kinoamyfx.tushare4j.reference;

import lombok.Data;

@Data
public class HsgtTop10 {
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
     * 涨跌额
     */
    private Float change;
    /**
     * 资金排名
     */
    private Integer rank;
    /**
     * 市场类型（1：沪市 3：深市）
     */
    private String market_type;
    /**
     * 成交金额（元）
     */
    private Float amount;
    /**
     * 净成交金额（元）
     */
    private Float net_amount;
    /**
     * 买入金额（元）
     */
    private Float buy;
    /**
     * 卖出金额（元）
     */
    private Float sell;
}
