package com.github.kinoamyfx.tushare4j.index;

import com.github.kinoamyfx.tushare4j.core.TsRequest;
import com.github.kinoamyfx.tushare4j.utils.ClassUtils;
import lombok.NonNull;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;


@Accessors(chain = true)
public class IndexBasicListRequest implements TsRequest<IndexBasic> {

    @NonNull
    private String market;

    @Setter
    private String publisher;

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

    @Override
    public Map<String, String> params() {
        Map<String, String> params = new HashMap<>(3);
        params.put("market", market);
        Optional.ofNullable(publisher).ifPresent(s -> params.put("publisher", publisher));
        Optional.ofNullable(category).ifPresent(s -> params.put("category", category));
        return params;
    }
}
