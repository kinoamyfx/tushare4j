package com.github.kinoamyfx.tushare4j.basic;

import com.github.kinoamyfx.tushare4j.core.TsParam;
import com.github.kinoamyfx.tushare4j.core.TsRequest;
import lombok.Data;

@Data
public class HsConstRequest implements TsRequest<HsConst> {

    @TsParam(name = "hs_type", required = true)
    private String hsType;

    @TsParam(name = "is_new")
    private String isNew;

    public HsConstRequest(String hsType) {
        this.hsType = hsType;
    }

    @Override
    public String apiName() {
        return "hs_const";
    }
}
