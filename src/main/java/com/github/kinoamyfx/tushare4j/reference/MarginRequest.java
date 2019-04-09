package com.github.kinoamyfx.tushare4j.reference;

import com.github.kinoamyfx.tushare4j.core.TsDate;
import com.github.kinoamyfx.tushare4j.core.TsParam;
import com.github.kinoamyfx.tushare4j.core.TsRequest;
import com.github.kinoamyfx.tushare4j.enums.Exchange;
import lombok.Data;

import static com.github.kinoamyfx.tushare4j.core.TsParam.RequiredType.REQUIRED;

@Data
public class MarginRequest implements TsRequest<Margin> {

    @TsParam(name = "trade_date", required = REQUIRED)
    private TsDate tradeDate;

    @TsParam(name = "exchange_id")
    private Exchange exchange;

    @Override
    public String apiName() {
        return "margin";
    }
}
