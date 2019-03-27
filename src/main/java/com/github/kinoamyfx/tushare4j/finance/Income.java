package com.github.kinoamyfx.tushare4j.finance;

import lombok.Data;

@Data
public class Income {

    private String ts_code;

    private String ann_date;

    private String f_ann_date;

    private String end_date;

    private String report_type;

    private String comp_type;

    private Float basic_eps;

    private Float diluted_eps;

    private Float total_revenue;

    private Float revenue;

    private Float int_income;

    private Float prem_earned;
    private Float comm_income;
    private Float n_commis_income;
    private Float n_oth_income;
    private Float n_oth_b_income;
    private Float prem_income;
    private Float out_prem;
    private Float une_prem_reser;
    private Float reins_income;
    private Float n_sec_tb_income;
    private Float n_sec_uw_income;
    private Float n_asset_mg_income;
    private Float oth_b_income;
    private Float fv_value_chg_gain;
    private Float invest_income;
    private Float ass_invest_income;
    private Float forex_gain;
    private Float total_cogs;
    private Float oper_cost;
    private Float int_exp;
    private Float comm_exp;
    private Float biz_tax_surchg;
    private Float sell_exp;
    private Float admin_exp;
    private Float fin_exp;
    private Float assets_impair_loss;
    private Float prem_refund;
    private Float compens_payout;
    private Float reser_insur_liab;
    private Float div_payt;
    private Float reins_exp;
    private Float oper_exp;
    private Float compens_payout_refu;
    private Float insur_reser_refu;
    private Float reins_cost_refund;
    private Float other_bus_cost;
    private Float operate_profit;
    private Float non_oper_income;
    private Float non_oper_exp;
    private Float nca_disploss;
    private Float total_profit;
    private Float income_tax;
    private Float n_income;
    private Float n_income_attr_p;
    private Float minority_gain;
    private Float oth_compr_income;
    private Float t_compr_income;
    private Float compr_inc_attr_p;
    private Float compr_inc_attr_m_s;
    private Float ebit;
    private Float ebitda;
    private Float insurance_exp;
    private Float undist_profit;
    private Float distable_profit;
}
