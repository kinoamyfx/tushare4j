package com.github.kinoamyfx.tushare4j.market;

import lombok.Data;

@Data
public class DailyBasic {
    /**
     * TS股票代码
     */
    private String ts_code;
    /**
     * 交易日期
     */
    private String trade_date;
    /**
     * 当日收盘价
     */
    private Float close;
    /**
     * 换手率（%）
     */
    private Float turnover_rate;
    /**
     * 换手率（自由流通股）
     */
    private Float turnover_rate_f;
    /**
     * 量比
     */
    private Float volume_ratio;
    /**
     * 市盈率（总市值/净利润）
     */
    private Float pe;
    /**
     * 市盈率（TTM）
     */
    private Float pe_ttm;
    /**
     * 市净率（总市值/净资产）
     */
    private Float pb;
    /**
     * 市销率
     */
    private Float ps;
    /**
     * 市销率（TTM）
     */
    private Float ps_ttm;
    /**
     * 总股本 （万股）
     */
    private Float total_share;
    /**
     * 流通股本 （万股）
     */
    private Float float_share;
    /**
     * 自由流通股本 （万）
     */
    private Float free_share;
    /**
     * 总市值 （万元）
     */
    private Float total_mv;
    /**
     * 流通市值（万元）
     */
    private Float circ_mv;
}
