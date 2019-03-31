package com.github.kinoamyfx.tushare4j.basic;

import com.github.kinoamyfx.tushare4j.core.TsDate;
import com.github.kinoamyfx.tushare4j.core.TsParam;
import com.github.kinoamyfx.tushare4j.core.TsRequest;
import com.github.kinoamyfx.tushare4j.enums.Exchange;
import lombok.Data;

@Data
public class TradeCalendarRequest implements TsRequest<TradeCalendar> {

    @TsParam(name = "exchange")
    private Exchange exchange;

    @TsParam(name = "start_date")
    private TsDate startDate;

    @TsParam(name = "end_date")
    private TsDate endDate;

    @TsParam(name = "is_open")
    private Boolean isOpen;

    @Override
    public String apiName() {
        return "trade_cal";
    }
}
