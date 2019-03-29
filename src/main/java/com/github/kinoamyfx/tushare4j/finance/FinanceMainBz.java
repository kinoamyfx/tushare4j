package com.github.kinoamyfx.tushare4j.finance;

import lombok.Data;

@Data
public class FinanceMainBz {
    /**
     * TS代码
     */
    private String ts_code;
    /**
     * 报告期
     */
    private String end_date;
    /**
     * 主营业务来源
     */
    private String bz_item;
    /**
     * 主营业务收入(元)
     */
    private Float bz_sales;
    /**
     * 主营业务利润(元)
     */
    private Float bz_profit;
    /**
     * 主营业务成本(元)
     */
    private Float bz_cost;
    /**
     * 货币代码
     */
    private String curr_type;
    /**
     * 是否更新
     */
    private String update_flag;
}
