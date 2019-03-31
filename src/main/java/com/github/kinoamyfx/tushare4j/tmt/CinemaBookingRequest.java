package com.github.kinoamyfx.tushare4j.tmt;

import com.github.kinoamyfx.tushare4j.core.TsParam;
import com.github.kinoamyfx.tushare4j.core.TsRequest;
import lombok.Data;
import lombok.NonNull;

@Data
public class CinemaBookingRequest implements TsRequest<CinemaBooking> {

    @TsParam(name = "date")
    @NonNull
    private String date;

    public CinemaBookingRequest(@NonNull String date) {
        this.date = date;
    }

    @Override
    public String apiName() {
        return "bo_cinema";
    }
}
