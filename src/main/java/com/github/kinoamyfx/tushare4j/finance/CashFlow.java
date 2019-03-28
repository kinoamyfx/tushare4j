package com.github.kinoamyfx.tushare4j.finance;

public class CashFlow {
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
     * 公司类型：1一般工商业 2银行 3保险 4证券
     */
    private String comp_type;
    /**
     * 报表类型：见下方详细说明
     */
    private String report_type;
    /**
     * 净利润 (元，下同)
     */
    private Float net_profit;
    /**
     * 财务费用
     */
    private Float finan_exp;
    /**
     * 销售商品、提供劳务收到的现金
     */
    private Float c_fr_sale_sg;
    /**
     * 收到的税费返还
     */
    private Float recp_tax_rends;
    /**
     * 客户存款和同业存放款项净增加额
     */
    private Float n_depos_incr_fi;
    /**
     * 向中央银行借款净增加额
     */
    private Float n_incr_loans_cb;
    /**
     * 向其他金融机构拆入资金净增加额
     */
    private Float n_inc_borr_oth_fi;
    /**
     * 收到原保险合同保费取得的现金
     */
    private Float prem_fr_orig_contr;
    /**
     * 保户储金净增加额
     */
    private Float n_incr_insured_dep;
    /**
     * 收到再保业务现金净额
     */
    private Float n_reinsur_prem;
    /**
     * 处置交易性金融资产净增加额
     */
    private Float n_incr_disp_tfa;
    /**
     * 收取利息和手续费净增加额
     */
    private Float ifc_cash_incr;
    /**
     * 处置可供出售金融资产净增加额
     */
    private Float n_incr_disp_faas;
    /**
     * 拆入资金净增加额
     */
    private Float n_incr_loans_oth_bank;
    /**
     * 回购业务资金净增加额
     */
    private Float n_cap_incr_repur;
    /**
     * 收到其他与经营活动有关的现金
     */
    private Float c_fr_oth_operate_a;
    /**
     * 经营活动现金流入小计
     */
    private Float c_inf_fr_operate_a;
    /**
     * 购买商品、接受劳务支付的现金
     */
    private Float c_paid_goods_s;
    /**
     * 支付给职工以及为职工支付的现金
     */
    private Float c_paid_to_for_empl;
    /**
     * 支付的各项税费
     */
    private Float c_paid_for_taxes;
    /**
     * 客户贷款及垫款净增加额
     */
    private Float n_incr_clt_loan_adv;
    /**
     * 存放央行和同业款项净增加额
     */
    private Float n_incr_dep_cbob;
    /**
     * 支付原保险合同赔付款项的现金
     */
    private Float c_pay_claims_orig_inco;
    /**
     * 支付手续费的现金
     */
    private Float pay_handling_chrg;
    /**
     * 支付保单红利的现金
     */
    private Float pay_comm_insur_plcy;
    /**
     * 支付其他与经营活动有关的现金
     */
    private Float oth_cash_pay_oper_act;
    /**
     * 经营活动现金流出小计
     */
    private Float st_cash_out_act;
    /**
     * 经营活动产生的现金流量净额
     */
    private Float n_cashflow_act;
    /**
     * 收到其他与投资活动有关的现金
     */
    private Float oth_recp_ral_inv_act;
    /**
     * 收回投资收到的现金
     */
    private Float c_disp_withdrwl_invest;
    /**
     * 取得投资收益收到的现金
     */
    private Float c_recp_return_invest;
    /**
     * 处置固定资产、无形资产和其他长期资产收回的现金净额
     */
    private Float n_recp_disp_fiolta;
    /**
     * 处置子公司及其他营业单位收到的现金净额
     */
    private Float n_recp_disp_sobu;
    /**
     * 投资活动现金流入小计
     */
    private Float stot_inflows_inv_act;
    /**
     * 购建固定资产、无形资产和其他长期资产支付的现金
     */
    private Float c_pay_acq_const_fiolta;
    /**
     * 投资支付的现金
     */
    private Float c_paid_invest;
    /**
     * 取得子公司及其他营业单位支付的现金净额
     */
    private Float n_disp_subs_oth_biz;
    /**
     * 支付其他与投资活动有关的现金
     */
    private Float oth_pay_ral_inv_act;
    /**
     * 质押贷款净增加额
     */
    private Float n_incr_pledge_loan;
    /**
     * 投资活动现金流出小计
     */
    private Float stot_out_inv_act;
    /**
     * 投资活动产生的现金流量净额
     */
    private Float n_cashflow_inv_act;
    /**
     * 取得借款收到的现金
     */
    private Float c_recp_borrow;
    /**
     * 发行债券收到的现金
     */
    private Float proc_issue_bonds;
    /**
     * 收到其他与筹资活动有关的现金
     */
    private Float oth_cash_recp_ral_fnc_act;
    /**
     * 筹资活动现金流入小计
     */
    private Float stot_cash_in_fnc_act;
    /**
     * 企业自由现金流量
     */
    private Float free_cashflow;
    /**
     * 偿还债务支付的现金
     */
    private Float c_prepay_amt_borr;
    /**
     * 分配股利、利润或偿付利息支付的现金
     */
    private Float c_pay_dist_dpcp_int_exp;
    /**
     * 其中:子公司支付给少数股东的股利、利润
     */
    private Float incl_dvd_profit_paid_sc_ms;
    /**
     * 支付其他与筹资活动有关的现金
     */
    private Float oth_cashpay_ral_fnc_act;
    /**
     * 筹资活动现金流出小计
     */
    private Float stot_cashout_fnc_act;
    /**
     * 筹资活动产生的现金流量净额
     */
    private Float n_cash_flows_fnc_act;
    /**
     * 汇率变动对现金的影响
     */
    private Float eff_fx_flu_cash;
    /**
     * 现金及现金等价物净增加额
     */
    private Float n_incr_cash_cash_equ;
    /**
     * 期初现金及现金等价物余额
     */
    private Float c_cash_equ_beg_period;
    /**
     * 期末现金及现金等价物余额
     */
    private Float c_cash_equ_end_period;
    /**
     * 吸收投资收到的现金
     */
    private Float c_recp_cap_contrib;
    /**
     * 其中:子公司吸收少数股东投资收到的现金
     */
    private Float incl_cash_rec_saims;
    /**
     * 未确认投资损失
     */
    private Float uncon_invest_loss;
    /**
     * 加:资产减值准备
     */
    private Float prov_depr_assets;
    /**
     * 固定资产折旧、油气资产折耗、生产性生物资产折旧
     */
    private Float depr_fa_coga_dpba;
    /**
     * 无形资产摊销
     */
    private Float amort_intang_assets;
    /**
     * 长期待摊费用摊销
     */
    private Float lt_amort_deferred_exp;
    /**
     * 待摊费用减少
     */
    private Float decr_deferred_exp;
    /**
     * 预提费用增加
     */
    private Float incr_acc_exp;
    /**
     * 处置固定、无形资产和其他长期资产的损失
     */
    private Float loss_disp_fiolta;
    /**
     * 固定资产报废损失
     */
    private Float loss_scr_fa;
    /**
     * 公允价值变动损失
     */
    private Float loss_fv_chg;
    /**
     * 投资损失
     */
    private Float invest_loss;
    /**
     * 递延所得税资产减少
     */
    private Float decr_def_inc_tax_assets;
    /**
     * 递延所得税负债增加
     */
    private Float incr_def_inc_tax_liab;
    /**
     * 存货的减少
     */
    private Float decr_inventories;
    /**
     * 经营性应收项目的减少
     */
    private Float decr_oper_payable;
    /**
     * 经营性应付项目的增加
     */
    private Float incr_oper_payable;
    /**
     * 其他
     */
    private Float others;
    /**
     * 经营活动产生的现金流量净额(间接法)
     */
    private Float im_net_cashflow_oper_act;
    /**
     * 债务转为资本
     */
    private Float conv_debt_into_cap;
    /**
     * 一年内到期的可转换公司债券
     */
    private Float conv_copbonds_due_within_1y;
    /**
     * 融资租入固定资产
     */
    private Float fa_fnc_leases;
    /**
     * 现金的期末余额
     */
    private Float end_bal_cash;
    /**
     * 减:现金的期初余额
     */
    private Float beg_bal_cash;
    /**
     * 加:现金等价物的期末余额
     */
    private Float end_bal_cash_equ;
    /**
     * 减:现金等价物的期初余额
     */
    private Float beg_bal_cash_equ;
    /**
     * 现金及现金等价物净增加额(间接法)
     */
    private Float im_n_incr_cash_equ;
}
