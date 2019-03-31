package com.github.kinoamyfx.tushare4j.future;

import lombok.Data;

@Data
public class FutureDaily {
    /**
     * TS合约代码
     */
    private String ts_code;
    /**
     * 交易日期
     */
    private String trade_date;
    /**
     * 昨收盘价
     */
    private Float pre_close;
    /**
     * 昨结算价
     */
    private Float pre_settle;
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
     * 涨跌1 收盘价-昨结算价
     */
    private Float change1;
    /**
     * 涨跌2 结算价-昨结算价
     */
    private Float change2;
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
    /**
     * 持仓量变化
     */
    private Float oi_chg;
    /**
     * 交割结算价
     */
    private Float delv_settle;
}
