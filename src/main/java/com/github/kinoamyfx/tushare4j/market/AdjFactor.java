package com.github.kinoamyfx.tushare4j.market;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class AdjFactor {
    @JsonProperty("ts_code")
    private String tsCode;

    @JsonProperty("trade_date")
    private String tradeDate;

    @JsonProperty("adj_factor")
    private Float adjFactor;
}
