package com.github.kinoamyfx.tushare4j.stock;

import lombok.Data;

@Data
public strictfp class KLine {
    private String ts_code;
    private String trade_date;
    private float open;
    private float high;
    private float low;
    private float close;
    private float pre_close;
    private float change;
    private float pct_chg;
    private float vol;
    private float amount;
}
