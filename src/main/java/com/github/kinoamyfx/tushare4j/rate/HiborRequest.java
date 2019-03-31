package com.github.kinoamyfx.tushare4j.rate;

import com.github.kinoamyfx.tushare4j.core.TsParam;
import com.github.kinoamyfx.tushare4j.core.TsRequest;
import lombok.Data;

@Data
public class HiborRequest implements TsRequest<Hibor> {

    @TsParam(name = "date")
    private String date;

    @TsParam(name = "start_date")
    private String startDate;

    @TsParam(name = "end_date")
    private String endDate;

    @Override
    public String apiName() {
        return "hibor";
    }
}
