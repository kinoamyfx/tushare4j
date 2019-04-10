package com.github.kinoamyfx.tushare4j.reference;

import com.github.kinoamyfx.tushare4j.core.TsDate;
import com.github.kinoamyfx.tushare4j.core.TsParam;
import com.github.kinoamyfx.tushare4j.core.TsRequest;
import lombok.Data;

@Data
public class StkHolderNumberRequest implements TsRequest<StkHolderNumber> {

    @TsParam(name = "ts_code")
    private String tsCode;

    @TsParam(name = "enddate")
    private TsDate lastDate;

    @TsParam(name = "start_date")
    private TsDate startDate;

    @TsParam(name = "end_date")
    private TsDate endDate;

    @Override
    public String apiName() {
        return "stk_holdernumber";
    }
}
