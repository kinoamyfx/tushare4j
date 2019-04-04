package com.github.kinoamyfx.tushare4j.rate;

import com.github.kinoamyfx.tushare4j.core.TsDate;
import com.github.kinoamyfx.tushare4j.core.TsParam;
import com.github.kinoamyfx.tushare4j.core.TsRequest;
import lombok.Data;

@Data
public class ShiborRequest implements TsRequest<Shibor> {

    @TsParam(name = "date")
    private TsDate date;

    @TsParam(name = "start_date")
    private TsDate startDate;

    @TsParam(name = "end_date")
    private TsDate endDate;

    @Override
    public String apiName() {
        return "shibor";
    }
}
