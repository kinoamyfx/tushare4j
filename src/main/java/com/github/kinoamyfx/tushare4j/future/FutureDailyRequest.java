package com.github.kinoamyfx.tushare4j.future;

import com.github.kinoamyfx.tushare4j.core.TsParam;
import com.github.kinoamyfx.tushare4j.core.TsRequest;
import lombok.Data;

@Data
public class FutureDailyRequest implements TsRequest<FutureDaily> {


    @TsParam(name = "ts_code")
    private String ts_code;
    @TsParam(name = "trade_date")
    private String tradeDate;

    @TsParam(name = "exchange")
    private String exchange;

    @TsParam(name = "start_date")
    private String startDate;

    @TsParam(name = "end_date")
    private String endDate;

    @Override
    public String apiName() {
        return "fut_daily";
    }
}
