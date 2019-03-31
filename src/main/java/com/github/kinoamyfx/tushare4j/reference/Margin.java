package com.github.kinoamyfx.tushare4j.reference;

import lombok.Data;

@Data
public class Margin {
    /**
     * 交易日期
     */
    private String trade_date;
    /**
     * 交易所代码（SSE上交所SZSE深交所）
     */
    private String exchange_id;
    /**
     * 融资余额(元)
     */
    private Float rzye;
    /**
     * 融资买入额(元)
     */
    private Float rzmre;
    /**
     * 融资偿还额(元)
     */
    private Float rzche;
    /**
     * 融券余额(元)
     */
    private Float rqye;
    /**
     * 融券卖出量(股,份,手)
     */
    private Float rqmcl;
    /**
     * 融资融券余额(元)
     */
    private Float rzrqye;
}
