package com.github.kinoamyfx.tushare4j.market;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public strictfp class KLine {

    @JsonProperty("ts_code")
    private String ts_code;
    private String trade_date;
    private Float pre_close;
    private Float open;
    private Float close;
    private Float high;
    private Float low;
    private Float change;
    private Float pct_chg;
    private Float vol;
    private Float amount;
}
