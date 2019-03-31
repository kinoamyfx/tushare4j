package com.github.kinoamyfx.tushare4j.option;

import com.github.kinoamyfx.tushare4j.core.TsParam;
import com.github.kinoamyfx.tushare4j.core.TsRequest;
import lombok.Data;

@Data
public class OptionDailyRequest implements TsRequest<OptionDaily> {

    @TsParam(name = "ts_code")
    private String tsCode;

    @TsParam(name = "trade_date")
    private String tradeDate;

    @TsParam(name = "start_date")
    private String startDate;

    @TsParam(name = "end_date")
    private String endDate;

    @TsParam(name = "exchange")
    private String exchange;


    @Override
    public String apiName() {
        return "opt_daily";
    }
}
