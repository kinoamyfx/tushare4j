package com.github.kinoamyfx.tushare4j.reference;

import lombok.Data;

@Data
public class PledgeStat {
    /**
     * TS代码
     */
    private String ts_code;
    /**
     * 截至日期
     */
    private String end_date;
    /**
     * 质押次数
     */
    private Integer pledge_count;
    /**
     * 无限售股质押数量（万）
     */
    private Float unrest_pledge;
    /**
     * 限售股份质押数量（万）
     */
    private Float rest_pledge;
    /**
     * 总股本
     */
    private Float total_share;
    /**
     * 质押比例
     */
    private Float pledge_ratio;
}
