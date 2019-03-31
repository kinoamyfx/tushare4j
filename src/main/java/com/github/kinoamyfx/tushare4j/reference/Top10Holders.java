package com.github.kinoamyfx.tushare4j.reference;

import lombok.Data;

@Data
public class Top10Holders {
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
     * 股东名称
     */
    private String holder_name;
    /**
     * 持有数量（股）
     */
    private Float hold_amount;
    /**
     * 持有比例
     */
    private Float hold_ratio;
}
