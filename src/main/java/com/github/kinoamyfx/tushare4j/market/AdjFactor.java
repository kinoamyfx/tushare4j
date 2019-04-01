package com.github.kinoamyfx.tushare4j.market;

import com.github.kinoamyfx.tushare4j.core.TsDate;
import lombok.Data;

@Data
public class AdjFactor {

    private String ts_code;

    private TsDate trade_date;

    private Float adj_factor;
}
