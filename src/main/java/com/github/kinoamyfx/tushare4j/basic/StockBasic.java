package com.github.kinoamyfx.tushare4j.basic;

import lombok.Data;

@Data
public class StockBasic {
    private String ts_code;
    private String symbol;
    private String name;
    private String area;
    private String industry;
    private String fullname;
    private String enname;
    private String market;
    private String exchange;
    private String curr_type;
    private String list_status;
    private String list_date;
    private String delist_date;
    private String is_hs;
}
