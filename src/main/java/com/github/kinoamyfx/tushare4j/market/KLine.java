package com.github.kinoamyfx.tushare4j.market;

import com.github.kinoamyfx.tushare4j.core.TsDate;
import lombok.Data;

@Data
public strictfp class KLine {
    /**
     * TS代码
     */
    private String ts_code;
    /**
     * 交易日期
     */
    private TsDate trade_date;
    /**
     * 开盘价(元)
     */
    private Float open;
    /**
     * 最高价(元)
     */
    private Float high;
    /**
     * 最低价(元)
     */
    private Float low;
    /**
     * 收盘价(元)
     */
    private Float close;
    /**
     * 昨收盘价(元)
     */
    private Float pre_close;
    /**
     * 涨跌额(元)
     */
    private Float change;
    /**
     * 涨跌幅(%)
     */
    private Float pct_chg;
    /**
     * 成交量(手)
     */
    private Float vol;
    /**
     * 成交额(千元)
     */
    private Float amount;
}
