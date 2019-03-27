package com.github.kinoamyfx.tushare4j.market;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class MoneyFlow {

    @JsonProperty("ts_code")
    private String tsCode;
    @JsonProperty("trade_date")
    private String tradeDate;

    @JsonProperty("buy_sm_vol")
    private Integer buySmVol;

    @JsonProperty("buy_sm_amount")
    private Float buySmAmount;

    @JsonProperty("sell_sm_vol")
    private Integer sellSmVol;

    @JsonProperty("sell_sm_amount")
    private Float sellSmAmount;

    @JsonProperty("buy_md_vol")
    private Integer buyMdVol;

    @JsonProperty("buy_md_amount")
    private Float buyMdAmount;

    @JsonProperty("sell_md_vol")
    private Integer sellMdVol;

    @JsonProperty("sell_md_amount")
    private Float sellMdAmount;

    @JsonProperty("buy_lg_vol")
    private Integer buyLgVol;

    @JsonProperty("buy_lg_amount")
    private Float buyLgAmount;

    @JsonProperty("sell_lg_vol")
    private Integer sellLgVol;

    @JsonProperty("sell_lg_amount")
    private Float sellLgAmount;

    @JsonProperty("buy_elg_vol")
    private Integer buyElgVol;

    @JsonProperty("buy_elg_amount")
    private Float buyElgAmount;


    @JsonProperty("sell_elg_vol")
    private Integer sellElgVol;

    @JsonProperty("sell_elg_amount")
    private Float sellElgAmount;

    @JsonProperty("net_mf_vol")
    private Integer netMfVol;

    @JsonProperty("net_mf_amount")
    private Float netMfAmount;
}
