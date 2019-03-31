package com.github.kinoamyfx.tushare4j.future;

import lombok.Data;

@Data
public class FutureBasic {
    /**
     * 合约代码
     */
    private String ts_code;
    /**
     * 交易标识
     */
    private String symbol;
    /**
     * 交易市场
     */
    private String exchange;
    /**
     * 中文简称
     */
    private String name;
    /**
     * 合约产品代码
     */
    private String fut_code;
    /**
     * 合约乘数
     */
    private Float multiplier;
    /**
     * 交易计量单位
     */
    private String trade_unit;
    /**
     * 交易单位(每手)
     */
    private Float per_unit;
    /**
     * 报价单位
     */
    private String quote_unit;
    /**
     * 最小报价单位说明
     */
    private String quote_unit_desc;
    /**
     * 交割方式说明
     */
    private String d_mode_desc;
    /**
     * 上市日期
     */
    private String list_date;
    /**
     * 最后交易日期
     */
    private String delist_date;
    /**
     * 交割月份
     */
    private String d_month;
    /**
     * 最后交割日
     */
    private String last_ddate;
    /**
     * 交易时间说明
     */
    private String trade_time_desc;
}
