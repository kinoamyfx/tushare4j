package com.github.kinoamyfx.tushare4j.reference;

import com.github.kinoamyfx.tushare4j.core.TsParam;
import com.github.kinoamyfx.tushare4j.core.TsRequest;
import lombok.Data;

@Data
public class PledgeStatRequest implements TsRequest<PledgeStat> {

    @TsParam(name = "ts_code")
    private String tsCode;

    @Override
    public String apiName() {
        return "pledge_stat";
    }
}
