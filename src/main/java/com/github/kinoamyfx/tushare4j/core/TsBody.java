package com.github.kinoamyfx.tushare4j.core;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
@AllArgsConstructor
public class TsBody {
    private String api_name;
    private String token;
    private List<String> fields;
    private Map<String, String> params;
}
