package com.github.kinoamyfx.tushare4j.market;

import lombok.Data;

@Data
public class AdjFactor {
    private String ts_code;
    private String trade_date;
    private Float adj_factor;
}
