package com.github.kinoamyfx.tushare4j.index;

import com.github.kinoamyfx.tushare4j.core.TsDate;
import com.github.kinoamyfx.tushare4j.core.TsParam;
import com.github.kinoamyfx.tushare4j.core.TsRequest;
import lombok.Data;

@Data
public class IndexDailyBasicRequest implements TsRequest<IndexDailyBasic> {

    @TsParam(name = "ts_code", required = TsParam.RequiredType.ALTERNATIVE)
    private String tsCode;

    @TsParam(name = "trade_date", required = TsParam.RequiredType.ALTERNATIVE)
    private TsDate tradeDate;

    @TsParam(name = "start_date")
    private TsDate startDate;

    @TsParam(name = "end_date")
    private TsDate endDate;

    @Override
    public String apiName() {
        return "index_dailybasic";
    }
}
