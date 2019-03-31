package com.github.kinoamyfx.tushare4j.finance;

import com.github.kinoamyfx.tushare4j.core.TsParam;
import com.github.kinoamyfx.tushare4j.core.TsRequest;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class ExpressRequest implements TsRequest<Express> {

    @TsParam(name = "ts_code")
    private String tsCode;

    @TsParam(name = "ann_date")
    private String annDate;

    @TsParam(name = "start_date")
    private String startDate;

    @TsParam(name = "end_date")
    private String endDate;

    @TsParam(name = "period")
    private String period;

    @Override
    public String apiName() {
        return "express";
    }
}
