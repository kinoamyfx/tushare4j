package com.github.kinoamyfx.tushare4j.reference;

import com.github.kinoamyfx.tushare4j.core.TsParam;
import com.github.kinoamyfx.tushare4j.core.TsRequest;
import lombok.Data;

import static com.github.kinoamyfx.tushare4j.core.TsParam.RequiredType.REQUIRED;

@Data
public class ConceptDetailRequest implements TsRequest<ConceptDetail> {

    @TsParam(name = "id", required = REQUIRED)
    private String id;

    @Override
    public String apiName() {
        return "concept_detail";
    }
}
