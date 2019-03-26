package com.github.kinoamyfx.tushare4j.basic;

import lombok.Data;

@Data
public class TradeCalendar {
    private String exchange;
    private String cal_date;
    private String is_open;
    private String pretrade_date;
}
