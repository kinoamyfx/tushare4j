package com.github.kinoamyfx.tushare4j.reference;

import lombok.Data;

@Data
public class ConceptDetail {
    /**
     * 概念代码
     */
    private String id;
    /**
     * 股票代码
     */
    private String ts_code;
    /**
     * 股票名称
     */
    private String name;
    /**
     * 纳入日期
     */
    private String in_date;
    /**
     * 剔除日期
     */
    private String out_date;
}
