package com.github.kinoamyfx.tushare4j.reference;

import com.github.kinoamyfx.tushare4j.core.TsDate;
import com.github.kinoamyfx.tushare4j.core.TsParam;
import com.github.kinoamyfx.tushare4j.core.TsRequest;
import lombok.Data;

import static com.github.kinoamyfx.tushare4j.core.TsParam.RequiredType.REQUIRED;

@Data
public class Top10FloatHoldersRequest implements TsRequest<Top10FloatHolders> {

    @TsParam(name = "ts_code", required = REQUIRED)
    private String tsCode;

    @TsParam(name = "period")
    private TsDate period;

    @TsParam(name = "ann_date")
    private TsDate annDate;

    @TsParam(name = "start_date")
    private TsDate startDate;

    @TsParam(name = "end_date")
    private TsDate endDate;

    @Override
    public String apiName() {
        return "top10_floatholders";
    }
}
