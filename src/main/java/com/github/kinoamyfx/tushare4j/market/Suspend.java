package com.github.kinoamyfx.tushare4j.market;

import lombok.Data;

@Data
public class Suspend {

    private String ts_code;

    private String suspend_date;

    private String resume_date;

    private String ann_date;

    private String suspend_reason;

    private String reason_type;
}
