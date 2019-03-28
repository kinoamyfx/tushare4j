package com.github.kinoamyfx.tushare4j.finance;

import lombok.Data;

@Data
public class ForeCast {
    /**
     * TS股票代码
     */
    private String ts_code;
    /**
     * 公告日期
     */
    private String ann_date;
    /**
     * 报告期
     */
    private String end_date;
    /**
     * 业绩预告类型(预增/预减/扭亏/首亏/续亏/续盈/略增/略减)
     */
    private String type;
    /**
     * 预告净利润变动幅度下限（%）
     */
    private Float p_change_min;
    /**
     * 预告净利润变动幅度上限（%）
     */
    private Float p_change_max;
    /**
     * 预告净利润下限（万元）
     */
    private Float net_profit_min;
    /**
     * 预告净利润上限（万元）
     */
    private Float net_profit_max;
    /**
     * 上年同期归属母公司净利润
     */
    private Float last_parent_net;
    /**
     * 首次公告日
     */
    private String first_ann_date;
    /**
     * 业绩预告摘要
     */
    private String summary;
    /**
     * 业绩变动原因
     */
    private String change_reason;
}
