package com.github.kinoamyfx.tushare4j.basic;

import com.github.kinoamyfx.tushare4j.core.TsParam;
import com.github.kinoamyfx.tushare4j.core.TsRequest;
import lombok.Data;
import lombok.NonNull;

import static com.github.kinoamyfx.tushare4j.core.TsParam.RequiredType.REQUIRED;

@Data
public class HsConstRequest implements TsRequest<HsConst> {

    @TsParam(name = "hs_type", required = REQUIRED)
    @NonNull
    private HsType hsType;

    @TsParam(name = "is_new")
    private int isNew = 1;

    public HsConstRequest(@NonNull HsType hsType) {
        this.hsType = hsType;
    }

    @Override
    public String apiName() {
        return "hs_const";
    }
}
