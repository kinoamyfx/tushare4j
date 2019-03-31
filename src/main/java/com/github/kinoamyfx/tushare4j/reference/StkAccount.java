package com.github.kinoamyfx.tushare4j.reference;

import lombok.Data;

@Data
public class StkAccount {
    /**
     * 统计周期
     */
    private String date;
    /**
     * 本周新增（万）
     */
    private Float weekly_new;
    /**
     * 期末总账户数（万）
     */
    private Float total;
    /**
     * 本周持仓账户数（万）
     */
    private Float weekly_hold;
    /**
     * 本周参与交易账户数（万）
     */
    private Float weekly_trade;
}
