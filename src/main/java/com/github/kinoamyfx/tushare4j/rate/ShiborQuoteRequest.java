package com.github.kinoamyfx.tushare4j.rate;

import com.github.kinoamyfx.tushare4j.core.TsParam;
import com.github.kinoamyfx.tushare4j.core.TsRequest;
import lombok.Data;

@Data
public class ShiborQuoteRequest implements TsRequest<ShiborQuote> {

    @TsParam(name = "date")
    private String date;

    @TsParam(name = "start_date")
    private String start_date;

    @TsParam(name = "end_date")
    private String end_date;

    @TsParam(name = "bank")
    private String bank;

    @Override
    public String apiName() {
        return "shibor_quote";
    }
}
