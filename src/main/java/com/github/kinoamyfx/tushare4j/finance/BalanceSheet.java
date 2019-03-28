package com.github.kinoamyfx.tushare4j.finance;

import lombok.Data;

@Data
public class BalanceSheet {
    /**
     * TS股票代码
     */
    private String ts_code;
    /**
     * 公告日期
     */
    private String ann_date;
    /**
     * 实际公告日期
     */
    private String f_ann_date;
    /**
     * 报告期
     */
    private String end_date;
    /**
     * 报表类型：见下方详细说明
     */
    private String report_type;
    /**
     * 公司类型：1一般工商业 2银行 3保险 4证券
     */
    private String comp_type;
    /**
     * 期末总股本
     */
    private Float total_share;
    /**
     * 资本公积金 (元，下同)
     */
    private Float cap_rese;
    /**
     * 未分配利润
     */
    private Float undistr_porfit;
    /**
     * 盈余公积金
     */
    private Float surplus_rese;
    /**
     * 专项储备
     */
    private Float special_rese;
    /**
     * 货币资金
     */
    private Float money_cap;
    /**
     * 交易性金融资产
     */
    private Float trad_asset;
    /**
     * 应收票据
     */
    private Float notes_receiv;
    /**
     * 应收账款
     */
    private Float accounts_receiv;
    /**
     * 其他应收款
     */
    private Float oth_receiv;
    /**
     * 预付款项
     */
    private Float prepayment;
    /**
     * 应收股利
     */
    private Float div_receiv;
    /**
     * 应收利息
     */
    private Float int_receiv;
    /**
     * 存货
     */
    private Float inventories;
    /**
     * 长期待摊费用
     */
    private Float amor_exp;
    /**
     * 一年内到期的非流动资产
     */
    private Float nca_within_1y;
    /**
     * 结算备付金
     */
    private Float sett_rsrv;
    /**
     * 拆出资金
     */
    private Float loanto_oth_bank_fi;
    /**
     * 应收保费
     */
    private Float premium_receiv;
    /**
     * 应收分保账款
     */
    private Float reinsur_receiv;
    /**
     * 应收分保合同准备金
     */
    private Float reinsur_res_receiv;
    /**
     * 买入返售金融资产
     */
    private Float pur_resale_fa;
    /**
     * 其他流动资产
     */
    private Float oth_cur_assets;
    /**
     * 流动资产合计
     */
    private Float total_cur_assets;
    /**
     * 可供出售金融资产
     */
    private Float fa_avail_for_sale;
    /**
     * 持有至到期投资
     */
    private Float htm_invest;
    /**
     * 长期股权投资
     */
    private Float lt_eqt_invest;
    /**
     * 投资性房地产
     */
    private Float invest_real_estate;
    /**
     * 定期存款
     */
    private Float time_deposits;
    /**
     * 其他资产
     */
    private Float oth_assets;
    /**
     * 长期应收款
     */
    private Float lt_rec;
    /**
     * 固定资产
     */
    private Float fix_assets;
    /**
     * 在建工程
     */
    private Float cip;
    /**
     * 工程物资
     */
    private Float const_materials;
    /**
     * 固定资产清理
     */
    private Float fixed_assets_disp;
    /**
     * 生产性生物资产
     */
    private Float produc_bio_assets;
    /**
     * 油气资产
     */
    private Float oil_and_gas_assets;
    /**
     * 无形资产
     */
    private Float intan_assets;
    /**
     * 研发支出
     */
    private Float r_and_d;
    /**
     * 商誉
     */
    private Float goodwill;
    /**
     * 长期待摊费用
     */
    private Float lt_amor_exp;
    /**
     * 递延所得税资产
     */
    private Float defer_tax_assets;
    /**
     * 发放贷款及垫款
     */
    private Float decr_in_disbur;
    /**
     * 其他非流动资产
     */
    private Float oth_nca;
    /**
     * 非流动资产合计
     */
    private Float total_nca;
    /**
     * 现金及存放中央银行款项
     */
    private Float cash_reser_cb;
    /**
     * 存放同业和其它金融机构款项
     */
    private Float depos_in_oth_bfi;
    /**
     * 贵金属
     */
    private Float prec_metals;
    /**
     * 衍生金融资产
     */
    private Float deriv_assets;
    /**
     * 应收分保未到期责任准备金
     */
    private Float rr_reins_une_prem;
    /**
     * 应收分保未决赔款准备金
     */
    private Float rr_reins_outstd_cla;
    /**
     * 应收分保寿险责任准备金
     */
    private Float rr_reins_lins_liab;
    /**
     * 应收分保长期健康险责任准备金
     */
    private Float rr_reins_lthins_liab;
    /**
     * 存出保证金
     */
    private Float refund_depos;
    /**
     * 保户质押贷款
     */
    private Float ph_pledge_loans;
    /**
     * 存出资本保证金
     */
    private Float refund_cap_depos;
    /**
     * 独立账户资产
     */
    private Float indep_acct_assets;
    /**
     * 其中：客户资金存款
     */
    private Float client_depos;
    /**
     * 其中：客户备付金
     */
    private Float client_prov;
    /**
     * 其中:交易席位费
     */
    private Float transac_seat_fee;
    /**
     * 应收款项类投资
     */
    private Float invest_as_receiv;
    /**
     * 资产总计
     */
    private Float total_assets;
    /**
     * 长期借款
     */
    private Float lt_borr;
    /**
     * 短期借款
     */
    private Float st_borr;
    /**
     * 向中央银行借款
     */
    private Float cb_borr;
    /**
     * 吸收存款及同业存放
     */
    private Float depos_ib_deposits;
    /**
     * 拆入资金
     */
    private Float loan_oth_bank;
    /**
     * 交易性金融负债
     */
    private Float trading_fl;
    /**
     * 应付票据
     */
    private Float notes_payable;
    /**
     * 应付账款
     */
    private Float acct_payable;
    /**
     * 预收款项
     */
    private Float adv_receipts;
    /**
     * 卖出回购金融资产款
     */
    private Float sold_for_repur_fa;
    /**
     * 应付手续费及佣金
     */
    private Float comm_payable;
    /**
     * 应付职工薪酬
     */
    private Float payroll_payable;
    /**
     * 应交税费
     */
    private Float taxes_payable;
    /**
     * 应付利息
     */
    private Float int_payable;
    /**
     * 应付股利
     */
    private Float div_payable;
    /**
     * 其他应付款
     */
    private Float oth_payable;
    /**
     * 预提费用
     */
    private Float acc_exp;
    /**
     * 递延收益
     */
    private Float deferred_inc;
    /**
     * 应付短期债券
     */
    private Float st_bonds_payable;
    /**
     * 应付分保账款
     */
    private Float payable_to_reinsurer;
    /**
     * 保险合同准备金
     */
    private Float rsrv_insur_cont;
    /**
     * 代理买卖证券款
     */
    private Float acting_trading_sec;
    /**
     * 代理承销证券款
     */
    private Float acting_uw_sec;
    /**
     * 一年内到期的非流动负债
     */
    private Float non_cur_liab_due_1y;
    /**
     * 其他流动负债
     */
    private Float oth_cur_liab;
    /**
     * 流动负债合计
     */
    private Float total_cur_liab;
    /**
     * 应付债券
     */
    private Float bond_payable;
    /**
     * 长期应付款
     */
    private Float lt_payable;
    /**
     * 专项应付款
     */
    private Float specific_payables;
    /**
     * 预计负债
     */
    private Float estimated_liab;
    /**
     * 递延所得税负债
     */
    private Float defer_tax_liab;
    /**
     * 递延收益-非流动负债
     */
    private Float defer_inc_non_cur_liab;
    /**
     * 其他非流动负债
     */
    private Float oth_ncl;
    /**
     * 非流动负债合计
     */
    private Float total_ncl;
    /**
     * 同业和其它金融机构存放款项
     */
    private Float depos_oth_bfi;
    /**
     * 衍生金融负债
     */
    private Float deriv_liab;
    /**
     * 吸收存款
     */
    private Float depos;
    /**
     * 代理业务负债
     */
    private Float agency_bus_liab;
    /**
     * 其他负债
     */
    private Float oth_liab;
    /**
     * 预收保费
     */
    private Float prem_receiv_adva;
    /**
     * 存入保证金
     */
    private Float depos_received;
    /**
     * 保户储金及投资款
     */
    private Float ph_invest;
    /**
     * 未到期责任准备金
     */
    private Float reser_une_prem;
    /**
     * 未决赔款准备金
     */
    private Float reser_outstd_claims;
    /**
     * 寿险责任准备金
     */
    private Float reser_lins_liab;
    /**
     * 长期健康险责任准备金
     */
    private Float reser_lthins_liab;
    /**
     * 独立账户负债
     */
    private Float indept_acc_liab;
    /**
     * 其中:质押借款
     */
    private Float pledge_borr;
    /**
     * 应付赔付款
     */
    private Float indem_payable;
    /**
     * 应付保单红利
     */
    private Float policy_div_payable;
    /**
     * 负债合计
     */
    private Float total_liab;
    /**
     * 减:库存股
     */
    private Float treasury_share;
    /**
     * 一般风险准备
     */
    private Float ordin_risk_reser;
    /**
     * 外币报表折算差额
     */
    private Float forex_differ;
    /**
     * 未确认的投资损失
     */
    private Float invest_loss_unconf;
    /**
     * 少数股东权益
     */
    private Float minority_int;
    /**
     * 股东权益合计(不含少数股东权益)
     */
    private Float total_hldr_eqy_exc_min_int;
    /**
     * 股东权益合计(含少数股东权益)
     */
    private Float total_hldr_eqy_inc_min_int;
    /**
     * 负债及股东权益总计
     */
    private Float total_liab_hldr_eqy;
    /**
     * 长期应付职工薪酬
     */
    private Float lt_payroll_payable;
    /**
     * 其他综合收益
     */
    private Float oth_comp_income;
    /**
     * 其他权益工具
     */
    private Float oth_eqt_tools;
    /**
     * 其他权益工具(优先股)
     */
    private Float oth_eqt_tools_p_shr;
    /**
     * 融出资金
     */
    private Float lending_funds;
    /**
     * 应收款项
     */
    private Float acc_receivable;
    /**
     * 应付短期融资款
     */
    private Float st_fin_payable;
    /**
     * 应付款项
     */
    private Float payables;
    /**
     * 持有待售的资产
     */
    private Float hfs_assets;
    /**
     * 持有待售的负债
     */
    private Float hfs_sales;
}
