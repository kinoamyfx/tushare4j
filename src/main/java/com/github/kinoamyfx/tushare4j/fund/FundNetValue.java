package com.github.kinoamyfx.tushare4j.fund;

import lombok.Data;

@Data
public class FundNetValue {
    /**
     * TS代码
     */
    private String ts_code;
    /**
     * 公告日期
     */
    private String ann_date;
    /**
     * 截止日期
     */
    private String end_date;
    /**
     * 单位净值
     */
    private Float unit_nav;
    /**
     * 累计净值
     */
    private Float accum_nav;
    /**
     * 累计分红
     */
    private Float accum_div;
    /**
     * 资产净值
     */
    private Float net_asset;
    /**
     * 合计资产净值
     */
    private Float total_netasset;
    /**
     * 复权单位净值
     */
    private Float adj_nav;
}
