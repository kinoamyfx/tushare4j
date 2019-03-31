package com.github.kinoamyfx.tushare4j.rate;

import lombok.Data;

@Data
public class Libor {
    /**
     * 日期
     */
    private String date;
    /**
     * 货币
     */
    private String curr_type;
    /**
     * 隔夜
     */
    private Float on;
    /**
     * 1周
     */
    private Float _1w;
    /**
     * 1个月
     */
    private Float _1m;
    /**
     * 2个月
     */
    private Float _2m;
    /**
     * 3个月
     */
    private Float _3m;
    /**
     * 6个月
     */
    private Float _6m;
    /**
     * 12个月
     */
    private Float _12m;
}
