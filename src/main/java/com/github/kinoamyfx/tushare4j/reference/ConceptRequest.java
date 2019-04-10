package com.github.kinoamyfx.tushare4j.reference;

import com.github.kinoamyfx.tushare4j.core.TsParam;
import com.github.kinoamyfx.tushare4j.core.TsRequest;
import lombok.Data;

@Data
public class ConceptRequest implements TsRequest<Concept> {

    @TsParam(name = "src")
    private String src = "ts";

    @Override
    public String apiName() {
        return "concept";
    }
}
