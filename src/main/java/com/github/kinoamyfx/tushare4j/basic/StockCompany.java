package com.github.kinoamyfx.tushare4j.basic;

import lombok.Data;

@Data
public class StockCompany {
    private String ts_code;
    private String exchange;
    private String chairman;
    private String manager;
    private String secretary;
    private Float reg_capital;
    private String setup_date;
    private String province;
    private String city;
    private String introduction;
    private String website;
    private String email;
    private String office;
    private String employees;
    private String main_business;
    private String business_scope;
}
