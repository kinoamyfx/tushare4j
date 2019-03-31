package com.github.kinoamyfx.tushare4j.option;

import lombok.Data;

@Data
public class OptionDaily {
    /**
     * TS代码
     */
    private String ts_code;
    /**
     * 交易日期
     */
    private String trade_date;
    /**
     * 交易市场
     */
    private String exchange;
    /**
     * 昨结算价
     */
    private Float pre_settle;
    /**
     * 前收盘价
     */
    private Float pre_close;
    /**
     * 开盘价
     */
    private Float open;
    /**
     * 最高价
     */
    private Float high;
    /**
     * 最低价
     */
    private Float low;
    /**
     * 收盘价
     */
    private Float close;
    /**
     * 结算价
     */
    private Float settle;
    /**
     * 成交量(手)
     */
    private Float vol;
    /**
     * 成交金额(万元)
     */
    private Float amount;
    /**
     * 持仓量(手)
     */
    private Float oi;
}
