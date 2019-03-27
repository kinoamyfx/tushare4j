package com.github.kinoamyfx.tushare4j.market;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public strictfp class KLine {

    @JsonProperty("ts_code")
    private String tsCode;
    @JsonProperty("trade_date")
    private String tradeDate;
    @JsonProperty("pre_close")
    private Float preClose;
    private Float open;
    private Float close;
    private Float high;
    private Float low;
    private Float change;
    @JsonProperty("pct_chg")
    private Float pctChg;
    private Float vol;
    private Float amount;
}
