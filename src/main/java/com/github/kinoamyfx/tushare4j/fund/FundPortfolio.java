package com.github.kinoamyfx.tushare4j.fund;

import lombok.Data;

@Data
public class FundPortfolio {
    /**
     * TS基金代码
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
     * 股票代码
     */
    private String symbol;
    /**
     * 持有股票市值(元)
     */
    private Float mkv;
    /**
     * 持有股票数量（股）
     */
    private Float amount;
    /**
     * 占股票市值比
     */
    private Float stk_mkv_ratio;
    /**
     * 占流通股本比例
     */
    private Float stk_float_ratio;
}
