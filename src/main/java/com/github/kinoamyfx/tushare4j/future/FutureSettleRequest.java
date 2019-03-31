package com.github.kinoamyfx.tushare4j.future;

import com.github.kinoamyfx.tushare4j.core.TsParam;
import com.github.kinoamyfx.tushare4j.core.TsRequest;
import lombok.Data;

@Data
public class FutureSettleRequest implements TsRequest<FutureSettle> {
    @TsParam(name = "trade_date")
    private String tradeDate;

    @TsParam(name = "ts_code")
    private String tsCode;

    @TsParam(name = "start_date")
    private String startDate;

    @TsParam(name = "end_date")
    private String endDate;

    @TsParam(name = "exchange")
    private String exchange;

    @Override
    public String apiName() {
        return "fut_settle";
    }
}
