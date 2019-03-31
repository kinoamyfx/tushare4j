package com.github.kinoamyfx.tushare4j.reference;

import lombok.Data;

@Data
public class MarginDetail {
    /**
     * 交易日期
     */
    private String trade_date;
    /**
     * TS股票代码
     */
    private String ts_code;
    /**
     * 融资余额(元)
     */
    private Float rzye;
    /**
     * 融券余额(元)
     */
    private Float rqye;
    /**
     * 融资买入额(元)
     */
    private Float rzmre;
    /**
     * 融券余量（手）
     */
    private Float rqyl;
    /**
     * 融资偿还额(元)
     */
    private Float rzche;
    /**
     * 融券偿还量(手)
     */
    private Float rqchl;
    /**
     * 融券卖出量(股,份,手)
     */
    private Float rqmcl;
    /**
     * 融资融券余额(元)
     */
    private Float rzrqye;
}
