package com.github.kinoamyfx.tushare4j.reference;

import lombok.Data;

@Data
public class TopList {
    /**
     * 交易日期
     */
    private String trade_date;
    /**
     * TS代码
     */
    private String ts_code;
    /**
     * 名称
     */
    private String name;
    /**
     * 收盘价
     */
    private Float close;
    /**
     * 涨跌幅
     */
    private Float pct_change;
    /**
     * 换手率
     */
    private Float turnover_rate;
    /**
     * 总成交额
     */
    private Float amount;
    /**
     * 龙虎榜卖出额
     */
    private Float l_sell;
    /**
     * 龙虎榜买入额
     */
    private Float l_buy;
    /**
     * 龙虎榜成交额
     */
    private Float l_amount;
    /**
     * 龙虎榜净买入额
     */
    private Float net_amount;
    /**
     * 龙虎榜净买额占比
     */
    private Float net_rate;
    /**
     * 龙虎榜成交额占比
     */
    private Float amount_rate;
    /**
     * 当日流通市值
     */
    private Float float_values;
    /**
     * 上榜理由
     */
    private String reason;
}
