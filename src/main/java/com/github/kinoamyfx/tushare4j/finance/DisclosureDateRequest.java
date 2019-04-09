package com.github.kinoamyfx.tushare4j.finance;

import com.github.kinoamyfx.tushare4j.core.TsDate;
import com.github.kinoamyfx.tushare4j.core.TsParam;
import com.github.kinoamyfx.tushare4j.core.TsRequest;
import lombok.Data;

@Data
public class DisclosureDateRequest implements TsRequest<DisclosureDate> {

    @TsParam(name = "ts_code")
    private String ts_code;

    @TsParam(name = "end_date")
    private TsDate end_date;

    @TsParam(name = "pre_date")
    private TsDate pre_date;

    @TsParam(name = "actual_date")
    private TsDate actual_date;

    @Override
    public String apiName() {
        return "disclosure_date";
    }
}
