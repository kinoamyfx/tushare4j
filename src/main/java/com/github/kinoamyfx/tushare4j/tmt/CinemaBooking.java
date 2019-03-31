package com.github.kinoamyfx.tushare4j.tmt;

import lombok.Data;

@Data
public class CinemaBooking {
    /**
     * 日期
     */
    private String date;
    /**
     * 影院名称
     */
    private String c_name;
    /**
     * 观众人数
     */
    private Integer aud_count;
    /**
     * 上座率
     */
    private Float att_ratio;
    /**
     * 当日票房
     */
    private Float day_amount;
    /**
     * 当日场次
     */
    private Float day_showcount;
    /**
     * 场均票价（元）
     */
    private Float avg_price;
    /**
     * 场均人次
     */
    private Float p_pc;
    /**
     * 排名
     */
    private Integer rank;
}
