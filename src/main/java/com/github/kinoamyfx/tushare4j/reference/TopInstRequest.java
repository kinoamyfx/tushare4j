package com.github.kinoamyfx.tushare4j.reference;

import com.github.kinoamyfx.tushare4j.core.TsDate;
import com.github.kinoamyfx.tushare4j.core.TsParam;
import com.github.kinoamyfx.tushare4j.core.TsRequest;
import lombok.Data;

import static com.github.kinoamyfx.tushare4j.core.TsParam.RequiredType.REQUIRED;

@Data
public class TopInstRequest implements TsRequest<TopInst> {
    @TsParam(name = "trade_date", required = REQUIRED)
    private TsDate tradeDate;

    @TsParam(name = "ts_code")
    private String tsCode;

    @Override
    public String apiName() {
        return "top_inst";
    }
}
