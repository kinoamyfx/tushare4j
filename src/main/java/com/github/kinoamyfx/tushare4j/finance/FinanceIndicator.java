package com.github.kinoamyfx.tushare4j.finance;

import lombok.Data;

@Data
public class FinanceIndicator {
    /**
     * TS代码
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
     * 基本每股收益
     */
    private Float eps;
    /**
     * 稀释每股收益
     */
    private Float dt_eps;
    /**
     * 每股营业总收入
     */
    private Float total_revenue_ps;
    /**
     * 每股营业收入
     */
    private Float revenue_ps;
    /**
     * 每股资本公积
     */
    private Float capital_rese_ps;
    /**
     * 每股盈余公积
     */
    private Float surplus_rese_ps;
    /**
     * 每股未分配利润
     */
    private Float undist_profit_ps;
    /**
     * 非经常性损益
     */
    private Float extra_item;
    /**
     * 扣除非经常性损益后的净利润
     */
    private Float profit_dedt;
    /**
     * 毛利
     */
    private Float gross_margin;
    /**
     * 流动比率
     */
    private Float current_ratio;
    /**
     * 速动比率
     */
    private Float quick_ratio;
    /**
     * 保守速动比率
     */
    private Float cash_ratio;
    /**
     * 存货周转天数
     */
    private Float invturn_days;
    /**
     * 应收账款周转天数
     */
    private Float arturn_days;
    /**
     * 存货周转率
     */
    private Float inv_turn;
    /**
     * 应收账款周转率
     */
    private Float ar_turn;
    /**
     * 流动资产周转率
     */
    private Float ca_turn;
    /**
     * 固定资产周转率
     */
    private Float fa_turn;
    /**
     * 总资产周转率
     */
    private Float assets_turn;
    /**
     * 经营活动净收益
     */
    private Float op_income;
    /**
     * 价值变动净收益
     */
    private Float valuechange_income;
    /**
     * 利息费用
     */
    private Float interst_income;
    /**
     * 折旧与摊销
     */
    private Float daa;
    /**
     * 息税前利润
     */
    private Float ebit;
    /**
     * 息税折旧摊销前利润
     */
    private Float ebitda;
    /**
     * 企业自由现金流量
     */
    private Float fcff;
    /**
     * 股权自由现金流量
     */
    private Float fcfe;
    /**
     * 无息流动负债
     */
    private Float current_exint;
    /**
     * 无息非流动负债
     */
    private Float noncurrent_exint;
    /**
     * 带息债务
     */
    private Float interestdebt;
    /**
     * 净债务
     */
    private Float netdebt;
    /**
     * 有形资产
     */
    private Float tangible_asset;
    /**
     * 营运资金
     */
    private Float working_capital;
    /**
     * 营运流动资本
     */
    private Float networking_capital;
    /**
     * 全部投入资本
     */
    private Float invest_capital;
    /**
     * 留存收益
     */
    private Float retained_earnings;
    /**
     * 期末摊薄每股收益
     */
    private Float diluted2_eps;
    /**
     * 每股净资产
     */
    private Float bps;
    /**
     * 每股经营活动产生的现金流量净额
     */
    private Float ocfps;
    /**
     * 每股留存收益
     */
    private Float retainedps;
    /**
     * 每股现金流量净额
     */
    private Float cfps;
    /**
     * 每股息税前利润
     */
    private Float ebit_ps;
    /**
     * 每股企业自由现金流量
     */
    private Float fcff_ps;
    /**
     * 每股股东自由现金流量
     */
    private Float fcfe_ps;
    /**
     * 销售净利率
     */
    private Float netprofit_margin;
    /**
     * 销售毛利率
     */
    private Float grossprofit_margin;
    /**
     * 销售成本率
     */
    private Float cogs_of_sales;
    /**
     * 销售期间费用率
     */
    private Float expense_of_sales;
    /**
     * 净利润/营业总收入
     */
    private Float profit_to_gr;
    /**
     * 销售费用/营业总收入
     */
    private Float saleexp_to_gr;
    /**
     * 管理费用/营业总收入
     */
    private Float adminexp_of_gr;
    /**
     * 财务费用/营业总收入
     */
    private Float finaexp_of_gr;
    /**
     * 资产减值损失/营业总收入
     */
    private Float impai_ttm;
    /**
     * 营业总成本/营业总收入
     */
    private Float gc_of_gr;
    /**
     * 营业利润/营业总收入
     */
    private Float op_of_gr;
    /**
     * 息税前利润/营业总收入
     */
    private Float ebit_of_gr;
    /**
     * 净资产收益率
     */
    private Float roe;
    /**
     * 加权平均净资产收益率
     */
    private Float roe_waa;
    /**
     * 净资产收益率(扣除非经常损益)
     */
    private Float roe_dt;
    /**
     * 总资产报酬率
     */
    private Float roa;
    /**
     * 总资产净利润
     */
    private Float npta;
    /**
     * 投入资本回报率
     */
    private Float roic;
    /**
     * 年化净资产收益率
     */
    private Float roe_yearly;
    /**
     * 年化总资产报酬率
     */
    private Float roa2_yearly;
    /**
     * 平均净资产收益率(增发条件)
     */
    private Float roe_avg;
    /**
     * 经营活动净收益/利润总额
     */
    private Float opincome_of_ebt;
    /**
     * 价值变动净收益/利润总额
     */
    private Float investincome_of_ebt;
    /**
     * 营业外收支净额/利润总额
     */
    private Float n_op_profit_of_ebt;
    /**
     * 所得税/利润总额
     */
    private Float tax_to_ebt;
    /**
     * 扣除非经常损益后的净利润/净利润
     */
    private Float dtprofit_to_profit;
    /**
     * 销售商品提供劳务收到的现金/营业收入
     */
    private Float salescash_to_or;
    /**
     * 经营活动产生的现金流量净额/营业收入
     */
    private Float ocf_to_or;
    /**
     * 经营活动产生的现金流量净额/经营活动净收益
     */
    private Float ocf_to_opincome;
    /**
     * 资本支出/折旧和摊销
     */
    private Float capitalized_to_da;
    /**
     * 资产负债率
     */
    private Float debt_to_assets;
    /**
     * 权益乘数
     */
    private Float assets_to_eqt;
    /**
     * 权益乘数(杜邦分析)
     */
    private Float dp_assets_to_eqt;
    /**
     * 流动资产/总资产
     */
    private Float ca_to_assets;
    /**
     * 非流动资产/总资产
     */
    private Float nca_to_assets;
    /**
     * 有形资产/总资产
     */
    private Float tbassets_to_totalassets;
    /**
     * 带息债务/全部投入资本
     */
    private Float int_to_talcap;
    /**
     * 归属于母公司的股东权益/全部投入资本
     */
    private Float eqt_to_talcapital;
    /**
     * 流动负债/负债合计
     */
    private Float currentdebt_to_debt;
    /**
     * 非流动负债/负债合计
     */
    private Float longdeb_to_debt;
    /**
     * 经营活动产生的现金流量净额/流动负债
     */
    private Float ocf_to_shortdebt;
    /**
     * 产权比率
     */
    private Float debt_to_eqt;
    /**
     * 归属于母公司的股东权益/负债合计
     */
    private Float eqt_to_debt;
    /**
     * 归属于母公司的股东权益/带息债务
     */
    private Float eqt_to_interestdebt;
    /**
     * 有形资产/负债合计
     */
    private Float tangibleasset_to_debt;
    /**
     * 有形资产/带息债务
     */
    private Float tangasset_to_intdebt;
    /**
     * 有形资产/净债务
     */
    private Float tangibleasset_to_netdebt;
    /**
     * 经营活动产生的现金流量净额/负债合计
     */
    private Float ocf_to_debt;
    /**
     * 经营活动产生的现金流量净额/带息债务
     */
    private Float ocf_to_interestdebt;
    /**
     * 经营活动产生的现金流量净额/净债务
     */
    private Float ocf_to_netdebt;
    /**
     * 已获利息倍数(EBIT/利息费用)
     */
    private Float ebit_to_interest;
    /**
     * 长期债务与营运资金比率
     */
    private Float longdebt_to_workingcapital;
    /**
     * 息税折旧摊销前利润/负债合计
     */
    private Float ebitda_to_debt;
    /**
     * 营业周期
     */
    private Float turn_days;
    /**
     * 年化总资产净利率
     */
    private Float roa_yearly;
    /**
     * 总资产净利率(杜邦分析)
     */
    private Float roa_dp;
    /**
     * 固定资产合计
     */
    private Float fixed_assets;
    /**
     * 扣除财务费用前营业利润
     */
    private Float profit_prefin_exp;
    /**
     * 非营业利润
     */
    private Float non_op_profit;
    /**
     * 营业利润／利润总额
     */
    private Float op_to_ebt;
    /**
     * 非营业利润／利润总额
     */
    private Float nop_to_ebt;
    /**
     * 经营活动产生的现金流量净额／营业利润
     */
    private Float ocf_to_profit;
    /**
     * 货币资金／流动负债
     */
    private Float cash_to_liqdebt;
    /**
     * 货币资金／带息流动负债
     */
    private Float cash_to_liqdebt_withinterest;
    /**
     * 营业利润／流动负债
     */
    private Float op_to_liqdebt;
    /**
     * 营业利润／负债合计
     */
    private Float op_to_debt;
    /**
     * 年化投入资本回报率
     */
    private Float roic_yearly;
    /**
     * 利润总额／营业收入
     */
    private Float profit_to_op;
    /**
     * 经营活动单季度净收益
     */
    private Float q_opincome;
    /**
     * 价值变动单季度净收益
     */
    private Float q_investincome;
    /**
     * 扣除非经常损益后的单季度净利润
     */
    private Float q_dtprofit;
    /**
     * 每股收益(单季度)
     */
    private Float q_eps;
    /**
     * 销售净利率(单季度)
     */
    private Float q_netprofit_margin;
    /**
     * 销售毛利率(单季度)
     */
    private Float q_gsprofit_margin;
    /**
     * 销售期间费用率(单季度)
     */
    private Float q_exp_to_sales;
    /**
     * 净利润／营业总收入(单季度)
     */
    private Float q_profit_to_gr;
    /**
     * 销售费用／营业总收入 (单季度)
     */
    private Float q_saleexp_to_gr;
    /**
     * 管理费用／营业总收入 (单季度)
     */
    private Float q_adminexp_to_gr;
    /**
     * 财务费用／营业总收入 (单季度)
     */
    private Float q_finaexp_to_gr;
    /**
     * 资产减值损失／营业总收入(单季度)
     */
    private Float q_impair_to_gr_ttm;
    /**
     * 营业总成本／营业总收入 (单季度)
     */
    private Float q_gc_to_gr;
    /**
     * 营业利润／营业总收入(单季度)
     */
    private Float q_op_to_gr;
    /**
     * 净资产收益率(单季度)
     */
    private Float q_roe;
    /**
     * 净资产单季度收益率(扣除非经常损益)
     */
    private Float q_dt_roe;
    /**
     * 总资产净利润(单季度)
     */
    private Float q_npta;
    /**
     * 经营活动净收益／利润总额(单季度)
     */
    private Float q_opincome_to_ebt;
    /**
     * 价值变动净收益／利润总额(单季度)
     */
    private Float q_investincome_to_ebt;
    /**
     * 扣除非经常损益后的净利润／净利润(单季度)
     */
    private Float q_dtprofit_to_profit;
    /**
     * 销售商品提供劳务收到的现金／营业收入(单季度)
     */
    private Float q_salescash_to_or;
    /**
     * 经营活动产生的现金流量净额／营业收入(单季度)
     */
    private Float q_ocf_to_sales;
    /**
     * 经营活动产生的现金流量净额／经营活动净收益(单季度)
     */
    private Float q_ocf_to_or;
    /**
     * 基本每股收益同比增长率(%)
     */
    private Float basic_eps_yoy;
    /**
     * 稀释每股收益同比增长率(%)
     */
    private Float dt_eps_yoy;
    /**
     * 每股经营活动产生的现金流量净额同比增长率(%)
     */
    private Float cfps_yoy;
    /**
     * 营业利润同比增长率(%)
     */
    private Float op_yoy;
    /**
     * 利润总额同比增长率(%)
     */
    private Float ebt_yoy;
    /**
     * 归属母公司股东的净利润同比增长率(%)
     */
    private Float netprofit_yoy;
    /**
     * 归属母公司股东的净利润-扣除非经常损益同比增长率(%)
     */
    private Float dt_netprofit_yoy;
    /**
     * 经营活动产生的现金流量净额同比增长率(%)
     */
    private Float ocf_yoy;
    /**
     * 净资产收益率(摊薄)同比增长率(%)
     */
    private Float roe_yoy;
    /**
     * 每股净资产相对年初增长率(%)
     */
    private Float bps_yoy;
    /**
     * 资产总计相对年初增长率(%)
     */
    private Float assets_yoy;
    /**
     * 归属母公司的股东权益相对年初增长率(%)
     */
    private Float eqt_yoy;
    /**
     * 营业总收入同比增长率(%)
     */
    private Float tr_yoy;
    /**
     * 营业收入同比增长率(%)
     */
    private Float or_yoy;
    /**
     * 营业总收入同比增长率(%)(单季度)
     */
    private Float q_gr_yoy;
    /**
     * 营业总收入环比增长率(%)(单季度)
     */
    private Float q_gr_qoq;
    /**
     * 营业收入同比增长率(%)(单季度)
     */
    private Float q_sales_yoy;
    /**
     * 营业收入环比增长率(%)(单季度)
     */
    private Float q_sales_qoq;
    /**
     * 营业利润同比增长率(%)(单季度)
     */
    private Float q_op_yoy;
    /**
     * 营业利润环比增长率(%)(单季度)
     */
    private Float q_op_qoq;
    /**
     * 净利润同比增长率(%)(单季度)
     */
    private Float q_profit_yoy;
    /**
     * 净利润环比增长率(%)(单季度)
     */
    private Float q_profit_qoq;
    /**
     * 归属母公司股东的净利润同比增长率(%)(单季度)
     */
    private Float q_netprofit_yoy;
    /**
     * 归属母公司股东的净利润环比增长率(%)(单季度)
     */
    private Float q_netprofit_qoq;
    /**
     * 净资产同比增长率
     */
    private Float equity_yoy;
    /**
     * 研发费用
     */
    private Float rd_exp;
}
