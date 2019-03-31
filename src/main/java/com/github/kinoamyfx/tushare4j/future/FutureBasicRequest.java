package com.github.kinoamyfx.tushare4j.future;

import com.github.kinoamyfx.tushare4j.core.TsParam;
import com.github.kinoamyfx.tushare4j.core.TsRequest;
import lombok.Data;

@Data
public class FutureBasicRequest implements TsRequest<FutureBasic> {

    @TsParam(name = "exchange")
    private String exchange;

    @TsParam(name = "fut_type")
    private String type;

    @Override
    public String apiName() {
        return "fut_basic";
    }
}
