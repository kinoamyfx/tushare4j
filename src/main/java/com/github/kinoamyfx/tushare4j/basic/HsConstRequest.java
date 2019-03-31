package com.github.kinoamyfx.tushare4j.basic;

import com.github.kinoamyfx.tushare4j.core.TsParam;
import com.github.kinoamyfx.tushare4j.core.TsRequest;
import lombok.Data;

import static com.github.kinoamyfx.tushare4j.core.TsParam.RequiredType.REQUIRED;

@Data
public class HsConstRequest implements TsRequest<HsConst> {

    @TsParam(name = "hs_type", required = REQUIRED)
    private HsType hsType;

    @TsParam(name = "is_new")
    private int isNew = 1;

    @Override
    public String apiName() {
        return "hs_const";
    }
}
