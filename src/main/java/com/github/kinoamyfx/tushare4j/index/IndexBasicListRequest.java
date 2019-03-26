package com.github.kinoamyfx.tushare4j.index;

import com.github.kinoamyfx.tushare4j.core.TsParam;
import com.github.kinoamyfx.tushare4j.core.TsRequest;
import com.github.kinoamyfx.tushare4j.utils.ClassUtils;
import lombok.NonNull;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.List;


@Accessors(chain = true)
public class IndexBasicListRequest implements TsRequest<IndexBasic> {

    @TsParam(name = "market", required = true)
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

    @Override
    public List<String> fields() {
        return ClassUtils.resolveFields(IndexBasic.class);
    }

}
