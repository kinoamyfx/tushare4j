package com.github.kinoamyfx.tushare4j.reference;

import lombok.Data;

@Data
public class MoneyFlowHsgt {
    /**
     * 交易日期
     */
    private String trade_date;
    /**
     * 港股通（上海）
     */
    private String ggt_ss;
    /**
     * 港股通（深圳）
     */
    private String ggt_sz;
    /**
     * 沪股通（百万元）
     */
    private String hgt;
    /**
     * 深股通（百万元）
     */
    private String sgt;
    /**
     * 北向资金（百万元）
     */
    private String north_money;
    /**
     * 南向资金（百万元）
     */
    private String south_money;
}
