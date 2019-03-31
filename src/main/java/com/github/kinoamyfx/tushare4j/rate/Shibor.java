package com.github.kinoamyfx.tushare4j.rate;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Shibor {
    /**
     * 日期
     */
    private String date;
    /**
     * 隔夜
     */
    private Float on;
    /**
     * 1周
     */
    @JsonProperty("1w")
    private Float _1w;
    /**
     * 2周
     */
    @JsonProperty("2w")
    private Float _2w;
    /**
     * 1个月
     */
    @JsonProperty("1m")
    private Float _1m;
    /**
     * 3个月
     */
    @JsonProperty("3m")
    private Float _3m;
    /**
     * 6个月
     */
    @JsonProperty("6m")
    private Float _6m;
    /**
     * 9个月
     */
    @JsonProperty("9m")
    private Float _9m;
    /**
     * 1年
     */
    @JsonProperty("1y")
    private Float _1y;

}
