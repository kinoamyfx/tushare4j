package com.github.kinoamyfx.tushare4j.future;

import com.github.kinoamyfx.tushare4j.core.TsDate;
import com.github.kinoamyfx.tushare4j.core.TsParam;
import com.github.kinoamyfx.tushare4j.core.TsRequest;
import lombok.Data;

@Data
public class FutureDailyRequest implements TsRequest<FutureDaily> {


    @TsParam(name = "ts_code")
    private String tsCode;

    @TsParam(name = "trade_date")
    private TsDate tradeDate;

    @TsParam(name = "exchange")
    private FutureExchange exchange;

    @TsParam(name = "start_date")
    private TsDate startDate;

    @TsParam(name = "end_date")
    private TsDate endDate;

    @Override
    public String apiName() {
        return "fut_daily";
    }
}
