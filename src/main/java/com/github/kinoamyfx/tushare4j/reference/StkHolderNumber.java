package com.github.kinoamyfx.tushare4j.reference;

import lombok.Data;

@Data
public class StkHolderNumber {
    /**
     * TS股票代码
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
     * 股东户数
     */
    private Integer holder_num;
}
