package com.github.kinoamyfx.tushare4j.tmt;

import com.github.kinoamyfx.tushare4j.core.TsParam;
import com.github.kinoamyfx.tushare4j.core.TsRequest;
import lombok.Data;

@Data
public class BookingWeeklyRequest implements TsRequest<Booking> {

    @TsParam(name = "date")
    private String date;

    @Override
    public String apiName() {
        return "bo_weekly";
    }
}
