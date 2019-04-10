package com.github.kinoamyfx.tushare4j.reference;

import lombok.Data;

@Data
public class Top10FloatHolders {
    private String ts_code;

    private String ann_date;

    private String end_date;

    private String holder_name;

    private Float hold_amount;
}
