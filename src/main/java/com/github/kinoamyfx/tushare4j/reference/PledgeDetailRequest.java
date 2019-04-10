package com.github.kinoamyfx.tushare4j.reference;

import com.github.kinoamyfx.tushare4j.core.TsParam;
import com.github.kinoamyfx.tushare4j.core.TsRequest;
import lombok.Data;

import static com.github.kinoamyfx.tushare4j.core.TsParam.RequiredType.REQUIRED;

@Data
public class PledgeDetailRequest implements TsRequest<PledgeDetail> {
    @TsParam(name = "ts_code", required = REQUIRED)
    private String tsCode;

    @Override
    public String apiName() {
        return "pledge_detail";
    }
}