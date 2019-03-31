package com.github.kinoamyfx.tushare4j.future;

import com.github.kinoamyfx.tushare4j.core.TsParam;
import com.github.kinoamyfx.tushare4j.core.TsRequest;
import lombok.Data;

@Data
public class FutureWsrRequest implements TsRequest<FutureWsr> {

    @TsParam(name = "trade_date")
    private String trade_date;

    @TsParam(name = "symbol")
    private String symbol;

    @TsParam(name = "start_date")
    private String start_date;

    @TsParam(name = "end_date")
    private String end_date;

    @TsParam(name = "exchange")
    private String exchange;

    @Override
    public String apiName() {
        return "fut_wsr";
    }
}
