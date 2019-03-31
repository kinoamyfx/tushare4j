package com.github.kinoamyfx.tushare4j.index;

import lombok.Data;

@Data
public class IndexDailyBasic {
    /**
     * TS代码
     */
    private String ts_code;
    /**
     * 交易日期
     */
    private String trade_date;
    /**
     * 当日总市值（元）
     */
    private Float total_mv;
    /**
     * 当日流通市值（元）
     */
    private Float float_mv;
    /**
     * 当日总股本（股）
     */
    private Float total_share;
    /**
     * 当日流通股本（股）
     */
    private Float float_share;
    /**
     * 当日自由流通股本（股）
     */
    private Float free_share;
    /**
     * 换手率
     */
    private Float turnover_rate;
    /**
     * 换手率(基于自由流通股本)
     */
    private Float turnover_rate_f;
    /**
     * 市盈率
     */
    private Float pe;
    /**
     * 市盈率TTM
     */
    private Float pe_ttm;
    /**
     * 市净率
     */
    private Float pb;
}
