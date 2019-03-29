package com.github.kinoamyfx.tushare4j.reference;

import com.github.kinoamyfx.tushare4j.core.TsParam;
import com.github.kinoamyfx.tushare4j.core.TsRequest;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class ConceptDetailRequest implements TsRequest<ConceptDetail> {

    @TsParam(name = "id")
    private String id;

    @Override
    public String apiName() {
        return "concept_detail";
    }
}
