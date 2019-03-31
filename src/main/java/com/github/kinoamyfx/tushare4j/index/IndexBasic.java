package com.github.kinoamyfx.tushare4j.index;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.ToString;

@Data
@ToString(callSuper = true)
public class IndexBasic {
    @JsonProperty("ts_code")
    private String tsCode;

    private String name;

    @JsonProperty("fullname")
    private String fullName;

    private String market;
    private String publisher;

    @JsonProperty("index_type")
    private String indexType;
    private String category;

    @JsonProperty("base_date")
    private String baseDate;

    @JsonProperty("base_point")
    private float basePoint;

    @JsonProperty("list_date")
    private String listDate;

    @JsonProperty("weight_rule")
    private String weightRule;

    private String desc;

    @JsonProperty("exp_date")
    private String expDate;
}
