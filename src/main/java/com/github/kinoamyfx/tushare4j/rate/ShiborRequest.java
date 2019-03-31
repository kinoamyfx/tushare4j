package com.github.kinoamyfx.tushare4j.rate;

import com.github.kinoamyfx.tushare4j.core.TsParam;
import com.github.kinoamyfx.tushare4j.core.TsRequest;
import lombok.Data;

@Data
public class ShiborRequest implements TsRequest<Shibor> {

    @TsParam(name = "date")
    private String date;

    @TsParam(name = "start_date")
    private String start_date;

    @TsParam(name = "end_date")
    private String end_date;

    @Override
    public String apiName() {
        return "shibor";
    }
}
