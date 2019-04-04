package com.github.kinoamyfx.tushare4j.fund;

import com.github.kinoamyfx.tushare4j.core.TsDate;
import com.github.kinoamyfx.tushare4j.core.TsParam;
import com.github.kinoamyfx.tushare4j.core.TsRequest;
import com.github.kinoamyfx.tushare4j.market.KLine;
import lombok.Data;

import static com.github.kinoamyfx.tushare4j.core.TsParam.RequiredType.ALTERNATIVE;

@Data
public class FundDailyRequest implements TsRequest<KLine> {

    @TsParam(name = "ts_code", required = ALTERNATIVE)
    private String tsCode;

    @TsParam(name = "trade_date", required = ALTERNATIVE)
    private TsDate tradeDate;

    @TsParam(name = "start_date")
    private TsDate startDate;

    @TsParam(name = "end_date")
    private TsDate endDate;

    @Override
    public String apiName() {
        return "fund_daily";
    }

}
