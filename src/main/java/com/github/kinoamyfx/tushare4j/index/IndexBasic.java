package com.github.kinoamyfx.tushare4j.index;

import lombok.Data;

@Data
public class IndexBasic {
    private String ts_code;
    private String name;
    private String fullname;
    private String market;
    private String publisher;
    private String index_type;
    private String category;
    private String base_date;
    private Float base_point;
    private String list_date;
    private String weight_rule;
    private String desc;
    private String exp_date;
}
