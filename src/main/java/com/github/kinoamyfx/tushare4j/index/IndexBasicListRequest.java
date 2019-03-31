package com.github.kinoamyfx.tushare4j.index;

import com.github.kinoamyfx.tushare4j.core.TsParam;
import com.github.kinoamyfx.tushare4j.core.TsRequest;
import lombok.NonNull;
import lombok.Setter;
import lombok.experimental.Accessors;

import static com.github.kinoamyfx.tushare4j.core.TsParam.RequiredType.REQUIRED;


@Accessors(chain = true)
public class IndexBasicListRequest implements TsRequest<IndexBasic> {

    @TsParam(name = "market", required = REQUIRED)
    @NonNull
    private String market;

    @TsParam(name = "publisher")
    @Setter
    private String publisher;

    @TsParam(name = "category")
    @Setter
    private String category;

    public IndexBasicListRequest(@NonNull String market) {
        this.market = market;
    }

    @Override
    public String apiName() {
        return "index_basic";
    }
}
