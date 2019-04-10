package com.github.kinoamyfx.tushare4j.finance;

import com.github.kinoamyfx.tushare4j.core.TsDate;
import com.github.kinoamyfx.tushare4j.core.TsParam;
import com.github.kinoamyfx.tushare4j.core.TsRequest;
import lombok.Data;

@Data
public class DisclosureDateRequest implements TsRequest<DisclosureDate> {

    @TsParam(name = "ts_code")
    private String tsCode;

    @TsParam(name = "end_date")
    private TsDate endDate;

    @TsParam(name = "pre_date")
    private TsDate preDate;

    @TsParam(name = "actual_date")
    private TsDate actualDate;

    @Override
    public String apiName() {
        return "disclosure_date";
    }
}
