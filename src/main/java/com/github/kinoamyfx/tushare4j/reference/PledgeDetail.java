package com.github.kinoamyfx.tushare4j.reference;

import lombok.Data;

@Data
public class PledgeDetail {
    /**
     * TS股票代码
     */
    private String ts_code;
    /**
     * 公告日期
     */
    private String ann_date;
    /**
     * 股东名称
     */
    private String holder_name;
    /**
     * 质押数量
     */
    private Float pledge_amount;
    /**
     * 质押开始日期
     */
    private String start_date;
    /**
     * 质押结束日期
     */
    private String end_date;
    /**
     * 是否已解押
     */
    private String is_release;
    /**
     * 解押日期
     */
    private String release_date;
    /**
     * 质押方
     */
    private String pledgor;
    /**
     * 持股总数
     */
    private Float holding_amount;
    /**
     * 质押总数
     */
    private Float pledged_amount;
    /**
     * 本次质押占总股本比例
     */
    private Float p_total_ratio;
    /**
     * 持股总数占总股本比例
     */
    private Float h_total_ratio;
    /**
     * 是否回购
     */
    private String is_buyback;
}
