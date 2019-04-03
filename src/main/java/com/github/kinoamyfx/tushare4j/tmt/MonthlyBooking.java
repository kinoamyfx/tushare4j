package com.github.kinoamyfx.tushare4j.tmt;

import lombok.Data;

@Data
public class MonthlyBooking {
    /**
     * 日期
     */
    private String date;
    /**
     * 影片名称
     */
    private String name;
    /**
     * 上映日期
     */
    private String list_date;
    /**
     * 平均票价
     */
    private Float avg_price;
    /**
     * 当周票房（万）
     */
    private Float month_amount;
    /**
     * 上映天数
     */
    private Integer list_day;
    /**
     * 场均人次
     */
    private Integer p_pc;
    /**
     * 口碑指数
     */
    private Float wom_index;
    /**
     * 环比变化 （%）
     */
    private Float m_ratio;
    /**
     * 排名
     */
    private Integer rank;
}
