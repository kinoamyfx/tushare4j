package com.github.kinoamyfx.tushare4j.fund;

import lombok.Data;

@Data
public class FundBasic {
    /**
     * 基金代码
     */
    private String ts_code;
    /**
     * 简称
     */
    private String name;
    /**
     * 管理人
     */
    private String management;
    /**
     * 托管人
     */
    private String custodian;
    /**
     * 投资类型
     */
    private String fund_type;
    /**
     * 成立日期
     */
    private String found_date;
    /**
     * 到期日期
     */
    private String due_date;
    /**
     * 上市时间
     */
    private String list_date;
    /**
     * 发行日期
     */
    private String issue_date;
    /**
     * 退市日期
     */
    private String delist_date;
    /**
     * 发行份额(亿)
     */
    private Float issue_amount;
    /**
     * 管理费
     */
    private Float m_fee;
    /**
     * 托管费
     */
    private Float c_fee;
    /**
     * 存续期
     */
    private Float duration_year;
    /**
     * 面值
     */
    private Float p_value;
    /**
     * 起点金额(万元)
     */
    private Float min_amount;
    /**
     * 预期收益率
     */
    private Float exp_return;
    /**
     * 业绩比较基准
     */
    private String benchmark;
    /**
     * 存续状态D摘牌 I发行 L已上市
     */
    private String status;
    /**
     * 投资风格
     */
    private String invest_type;
    /**
     * 基金类型
     */
    private String type;
    /**
     * 受托人
     */
    private String trustee;
    /**
     * 日常申购起始日
     */
    private String purc_startdate;
    /**
     * 日常赎回起始日
     */
    private String redm_startdate;
    /**
     * E场内O场外
     */
    private String market;
}
