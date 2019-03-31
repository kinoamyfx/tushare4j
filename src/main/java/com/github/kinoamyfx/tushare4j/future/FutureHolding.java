package com.github.kinoamyfx.tushare4j.future;

import lombok.Data;

@Data
public class FutureHolding {
    /**
     * 交易日期
     */
    private String trade_date;
    /**
     * 合约代码或类型
     */
    private String symbol;
    /**
     * 期货公司会员简称
     */
    private String broker;
    /**
     * 成交量
     */
    private Integer vol;
    /**
     * 成交量变化
     */
    private Integer vol_chg;
    /**
     * 持买仓量
     */
    private Integer long_hld;
    /**
     * 持买仓量变化
     */
    private Integer long_chg;
    /**
     * 持卖仓量
     */
    private Integer short_hld;
    /**
     * 持卖仓量变化
     */
    private Integer short_chg;
    /**
     * 交易所
     */
    private String exchange;
}
