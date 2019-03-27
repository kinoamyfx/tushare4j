package com.github.kinoamyfx.tushare4j.market;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class DailyBasic {

    @JsonProperty("ts_code")
    private String tsCode;

    @JsonProperty("trade_date")
    private String tradeDate;

    private Float close;

    @JsonProperty("turnover_rate")
    private Float turnoverRate;

    @JsonProperty("turnover_rate_f")
    private Float turnoverRateF;

    @JsonProperty("volume_ratio")
    private Float volumeRatio;
    private Float pe;

    @JsonProperty("pe_ttm")
    private Float peTtm;
    private Float pb;
    private Float ps;

    @JsonProperty("ps_ttm")
    private Float psTtm;

    @JsonProperty("total_share")
    private Float totalShare;

    @JsonProperty("float_share")
    private Float floatShare;

    @JsonProperty("free_share")
    private Float freeShare;

    @JsonProperty("total_mv")
    private Float totalMv;

    @JsonProperty("circ_mv")
    private Float circMv;
}
