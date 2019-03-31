package com.github.kinoamyfx.tushare4j.future;

import lombok.Data;

@Data
public class FutureSettle {
    /**
     * 合约代码
     */
    private String ts_code;
    /**
     * 交易日期
     */
    private String trade_date;
    /**
     * 结算价
     */
    private Float settle;
    /**
     * 交易手续费率
     */
    private Float trading_fee_rate;
    /**
     * 交易手续费
     */
    private Float trading_fee;
    /**
     * 交割手续费
     */
    private Float delivery_fee;
    /**
     * 买套保交易保证金率
     */
    private Float b_hedging_margin_rate;
    /**
     * 卖套保交易保证金率
     */
    private Float s_hedging_margin_rate;
    /**
     * 买投机交易保证金率
     */
    private Float long_margin_rate;
    /**
     * 卖投机交易保证金率
     */
    private Float short_margin_rate;
    /**
     * 平今仓手续率
     */
    private Float offset_today_fee;
    /**
     * 交易所
     */
    private String exchange;
}
