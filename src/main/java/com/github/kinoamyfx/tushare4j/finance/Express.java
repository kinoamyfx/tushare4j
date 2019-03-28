package com.github.kinoamyfx.tushare4j.finance;

import lombok.Data;

@Data
public class Express {
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
     * 营业收入(元)
     */
    private Float revenue;
    /**
     * 营业利润(元)
     */
    private Float operate_profit;
    /**
     * 利润总额(元)
     */
    private Float total_profit;
    /**
     * 净利润(元)
     */
    private Float n_income;
    /**
     * 总资产(元)
     */
    private Float total_assets;
    /**
     * 股东权益合计(不含少数股东权益)(元)
     */
    private Float total_hldr_eqy_exc_min_int;
    /**
     * 每股收益(摊薄)(元)
     */
    private Float diluted_eps;
    /**
     * 净资产收益率(摊薄)(%)
     */
    private Float diluted_roe;
    /**
     * 去年同期修正后净利润
     */
    private Float yoy_net_profit;
    /**
     * 每股净资产
     */
    private Float bps;
    /**
     * 同比增长率:营业收入
     */
    private Float yoy_sales;
    /**
     * 同比增长率:营业利润
     */
    private Float yoy_op;
    /**
     * 同比增长率:利润总额
     */
    private Float yoy_tp;
    /**
     * 同比增长率:归属母公司股东的净利润
     */
    private Float yoy_dedu_np;
    /**
     * 同比增长率:基本每股收益
     */
    private Float yoy_eps;
    /**
     * 同比增减:加权平均净资产收益率
     */
    private Float yoy_roe;
    /**
     * 比年初增长率:总资产
     */
    private Float growth_assets;
    /**
     * 比年初增长率:归属母公司的股东权益
     */
    private Float yoy_equity;
    /**
     * 比年初增长率:归属于母公司股东的每股净资产
     */
    private Float growth_bps;
    /**
     * 去年同期营业收入
     */
    private Float or_last_year;
    /**
     * 去年同期营业利润
     */
    private Float op_last_year;
    /**
     * 去年同期利润总额
     */
    private Float tp_last_year;
    /**
     * 去年同期净利润
     */
    private Float np_last_year;
    /**
     * 去年同期每股收益
     */
    private Float eps_last_year;
    /**
     * 期初净资产
     */
    private Float open_net_assets;
    /**
     * 期初每股净资产
     */
    private Float open_bps;
    /**
     * 业绩简要说明
     */
    private String perf_summary;
    /**
     * 是否审计： 1是 0否
     */
    private Float is_audit;
    /**
     * 备注
     */
    private String remark;
}
