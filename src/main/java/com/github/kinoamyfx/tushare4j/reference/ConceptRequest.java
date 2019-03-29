package com.github.kinoamyfx.tushare4j.reference;

import com.github.kinoamyfx.tushare4j.core.TsParam;
import com.github.kinoamyfx.tushare4j.core.TsRequest;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class ConceptRequest implements TsRequest<Concept> {

    @TsParam(name = "src")
    private String src = "ts";

    @Override
    public String apiName() {
        return "concept";
    }
}
