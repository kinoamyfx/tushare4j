package com.github.kinoamyfx.tushare4j.reference;

import lombok.Data;

@Data
public class RePurchase {
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
     * 进度
     */
    private String proc;
    /**
     * 过期日期
     */
    private String exp_date;
    /**
     * 回购数量
     */
    private Float vol;
    /**
     * 回购金额
     */
    private Float amount;
    /**
     * 回购最高价
     */
    private Float high_limit;
    /**
     * 回购最低价
     */
    private Float low_limit;
}
