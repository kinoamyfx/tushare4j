package com.github.kinoamyfx.tushare4j.basic;

import lombok.Data;

@Data
public class NameChange {
    private String ts_code;
    private String name;
    private String start_date;
    private String end_date;
    private String ann_date;
    private String change_reason;
}
