package com.github.kinoamyfx.tushare4j.core;

import com.github.kinoamyfx.tushare4j.utils.JSONUtils;
import lombok.Data;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Data
public class TsResponseWrapperData {
    private List<String> fields;
    private List<Object[]> items;

    public String toString() {
        List<Map<String, Object>> collect = items.stream().map(item -> {
            Map<String, Object> map = new HashMap<>();

            for (int i = 0; i < item.length; i++) {
                map.put(fields.get(i), item[i]);
            }
            return map;
        }).collect(Collectors.toList());

        return JSONUtils.toJson(collect);
    }
}
