package com.github.kinoamyfx.tushare4j.rate;

import com.github.kinoamyfx.tushare4j.core.TsDate;
import com.github.kinoamyfx.tushare4j.core.TsParam;
import com.github.kinoamyfx.tushare4j.core.TsRequest;
import com.github.kinoamyfx.tushare4j.enums.Currency;
import lombok.Data;

@Data
public class LiborRequest implements TsRequest<Libor> {
    @TsParam(name = "date")
    private TsDate date;

    @TsParam(name = "start_date")
    private TsDate startDate;

    @TsParam(name = "end_date")
    private TsDate endDate;

    @TsParam(name = "curr_type")
    private Currency currType;

    @Override
    public String apiName() {
        return "libor";
    }
}
