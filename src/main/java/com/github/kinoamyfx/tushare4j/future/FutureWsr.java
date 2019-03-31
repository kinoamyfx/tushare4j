package com.github.kinoamyfx.tushare4j.future;

import lombok.Data;

@Data
public class FutureWsr {
    /**
     * 交易日期
     */
    private String trade_date;
    /**
     * 产品代码
     */
    private String symbol;
    /**
     * 产品名称
     */
    private String fut_name;
    /**
     * 仓库名称
     */
    private String warehouse;
    /**
     * 仓库编号
     */
    private String wh_id;
    /**
     * 昨日仓单量
     */
    private Integer pre_vol;
    /**
     * 今日仓单量
     */
    private Integer vol;
    /**
     * 增减量
     */
    private Integer vol_chg;
    /**
     * 地区
     */
    private String area;
    /**
     * 年度
     */
    private String year;
    /**
     * 等级
     */
    private String grade;
    /**
     * 品牌
     */
    private String brand;
    /**
     * 产地
     */
    private String place;
    /**
     * 升贴水
     */
    private Integer pd;
    /**
     * 是否折算仓单
     */
    private String is_ct;
    /**
     * 单位
     */
    private String unit;
    /**
     * 交易所
     */
    private String exchange;
}
