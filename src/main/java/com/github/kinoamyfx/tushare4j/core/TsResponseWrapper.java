package com.github.kinoamyfx.tushare4j.core;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class TsResponseWrapper {
    private int code;
    private String msg;
    private TsResponseWrapperData data;
}