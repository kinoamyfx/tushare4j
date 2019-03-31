package com.github.kinoamyfx.tushare4j.rate;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Hibor {
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
     * 2个月
     */
    @JsonProperty("2m")
    private Float _2m;
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
     * 12个月
     */
    @JsonProperty("12m")
    private Float _12m;
}
