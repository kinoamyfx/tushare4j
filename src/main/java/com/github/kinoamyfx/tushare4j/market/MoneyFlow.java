package com.github.kinoamyfx.tushare4j.market;

import lombok.Data;

@Data
public class MoneyFlow {

    private String ts_code;
    private String trade_date;

    private Integer buy_sm_vol;
    private Float buy_sm_amount;

    private Integer sell_sm_vol;
    private Float sell_sm_amount;

    private Integer buy_md_vol;
    private Float buy_md_amount;

    private Integer sell_md_vol;
    private Float sell_md_amount;


    private Integer buy_lg_vol;
    private Float buy_lg_amount;

    private Integer sell_lg_vol;
    private Float sell_lg_amount;

    private Integer buy_elg_vol;
    private Float buy_elg_amount;

    private Integer sell_elg_vol;
    private Float sell_elg_amount;

    private Integer net_mf_vol;
    private Float net_mf_amount;
}
