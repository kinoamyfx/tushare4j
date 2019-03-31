package com.github.kinoamyfx.tushare4j.reference;

import lombok.Data;

@Data
public class StkAccountOld {
    /**
     * 统计周期
     */
    private String date;
    /**
     * 本周新增（上海，户）
     */
    private Integer new_sh;
    /**
     * 本周新增（深圳，户）
     */
    private Integer new_sz;
    /**
     * 期末有效账户（上海，万户）
     */
    private Float active_sh;
    /**
     * 期末有效账户（深圳，万户）
     */
    private Float active_sz;
    /**
     * 期末账户数（上海，万户）
     */
    private Float total_sh;
    /**
     * 期末账户数（深圳，万户）
     */
    private Float total_sz;
    /**
     * 参与交易账户数（上海，万户）
     */
    private Float trade_sh;
    /**
     * 参与交易账户数（深圳，万户）
     */
    private Float trade_sz;
}
