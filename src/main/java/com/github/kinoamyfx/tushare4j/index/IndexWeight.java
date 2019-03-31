package com.github.kinoamyfx.tushare4j.index;

import lombok.Data;

@Data
public class IndexWeight {
    /**
     * 指数代码
     */
    private String index_code;

    /**
     * 成分代码
     */
    private String con_code;


    /**
     * 交易日期
     */
    private String trade_date;

    /**
     * 权重
     */
    private Float weight;
}
