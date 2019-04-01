package com.github.kinoamyfx.tushare4j.market;

import lombok.Data;

@Data
public class MoneyFlow {
    /**
     * TS代码
     */
    private String ts_code;
    /**
     * 交易日期
     */
    private String trade_date;
    /**
     * 小单买入量（手）
     */
    private Integer buy_sm_vol;
    /**
     * 小单买入金额（万元）
     */
    private Float buy_sm_amount;
    /**
     * 小单卖出量（手）
     */
    private Integer sell_sm_vol;
    /**
     * 小单卖出金额（万元）
     */
    private Float sell_sm_amount;
    /**
     * 中单买入量（手）
     */
    private Integer buy_md_vol;
    /**
     * 中单买入金额（万元）
     */
    private Float buy_md_amount;
    /**
     * 中单卖出量（手）
     */
    private Integer sell_md_vol;
    /**
     * 中单卖出金额（万元）
     */
    private Float sell_md_amount;
    /**
     * 大单买入量（手）
     */
    private Integer buy_lg_vol;
    /**
     * 大单买入金额（万元）
     */
    private Float buy_lg_amount;
    /**
     * 大单卖出量（手）
     */
    private Integer sell_lg_vol;
    /**
     * 大单卖出金额（万元）
     */
    private Float sell_lg_amount;
    /**
     * 特大单买入量（手）
     */
    private Integer buy_elg_vol;
    /**
     * 特大单买入金额（万元）
     */
    private Float buy_elg_amount;
    /**
     * 特大单卖出量（手）
     */
    private Integer sell_elg_vol;
    /**
     * 特大单卖出金额（万元）
     */
    private Float sell_elg_amount;
    /**
     * 净流入量（手）
     */
    private Integer net_mf_vol;
    /**
     * 净流入额（万元）
     */
    private Float net_mf_amount;
}
