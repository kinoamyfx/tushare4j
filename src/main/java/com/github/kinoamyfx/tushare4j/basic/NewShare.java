package com.github.kinoamyfx.tushare4j.basic;

import lombok.Data;

@Data
public class NewShare {
    private String ts_code;
    private String sub_code;
    private String name;
    private String ipo_date;
    private String issue_date;
    private Float amount;
    private Float market_amount;
    private Float price;
    private Float pe;
    private Float limit_amount;
    private Float funds;
    private Float ballot;
}
