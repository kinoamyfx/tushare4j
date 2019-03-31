package com.github.kinoamyfx.tushare4j.reference;

import lombok.Data;

@Data
public class BlockTrade {
    /**
     * TS代码
     */
    private String ts_code;
    /**
     * 交易日历
     */
    private String trade_date;
    /**
     * 成交价
     */
    private Float price;
    /**
     * 成交量（万股）
     */
    private Float vol;
    /**
     * 成交金额
     */
    private Float amount;
    /**
     * 买方营业部
     */
    private String buyer;
    /**
     * 卖方营业部
     */
    private String seller;
}
