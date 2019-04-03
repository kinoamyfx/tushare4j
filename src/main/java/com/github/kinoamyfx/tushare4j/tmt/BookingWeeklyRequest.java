package com.github.kinoamyfx.tushare4j.tmt;

import com.github.kinoamyfx.tushare4j.core.TsDate;
import com.github.kinoamyfx.tushare4j.core.TsParam;
import com.github.kinoamyfx.tushare4j.core.TsRequest;
import lombok.Data;

import static com.github.kinoamyfx.tushare4j.core.TsParam.RequiredType.REQUIRED;

@Data
public class BookingWeeklyRequest implements TsRequest<WeeklyBooking> {

    @TsParam(name = "date", required = REQUIRED)
    private TsDate date;

    @Override
    public String apiName() {
        return "bo_weekly";
    }
}
