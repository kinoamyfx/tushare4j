package com.github.kinoamyfx.tushare4j.rate;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ShiborLpr {
    private String date;
    @JsonProperty("1y")
    private String _1y;
}
