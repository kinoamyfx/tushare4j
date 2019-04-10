package com.github.kinoamyfx.tushare4j.index;

import com.github.kinoamyfx.tushare4j.core.TsParam;
import com.github.kinoamyfx.tushare4j.core.TsRequest;
import lombok.Data;

import static com.github.kinoamyfx.tushare4j.core.TsParam.RequiredType.REQUIRED;


@Data
public class IndexBasicRequest implements TsRequest<IndexBasic> {

    @TsParam(name = "market", required = REQUIRED)
    private IndexMarket market;

    @TsParam(name = "publisher")
    private String publisher;

    @TsParam(name = "category")
    private String category;

    @Override
    public String apiName() {
        return "index_basic";
    }
}
