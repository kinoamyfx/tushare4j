package com.github.kinoamyfx.tushare4j.tmt;

import com.github.kinoamyfx.tushare4j.core.TsDate;
import com.github.kinoamyfx.tushare4j.core.TsParam;
import com.github.kinoamyfx.tushare4j.core.TsRequest;
import lombok.Data;

@Data
public class CinemaBookingRequest implements TsRequest<CinemaBooking> {

    @TsParam(name = "date", required = TsParam.RequiredType.REQUIRED)
    private TsDate date;

    @Override
    public String apiName() {
        return "bo_cinema";
    }
}
