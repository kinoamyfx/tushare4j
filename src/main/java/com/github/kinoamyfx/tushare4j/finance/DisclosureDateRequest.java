package com.github.kinoamyfx.tushare4j.finance;

import com.github.kinoamyfx.tushare4j.core.TsParam;
import com.github.kinoamyfx.tushare4j.core.TsRequest;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class DisclosureDateRequest implements TsRequest<DisclosureDate> {

    @TsParam(name = "ts_code")
    private String ts_code;

    @TsParam(name = "end_date")
    private String end_date;

    @TsParam(name = "pre_date")
    private String pre_date;

    @TsParam(name = "actual_date")
    private String actual_date;

    @Override
    public String apiName() {
        return "disclosure_date";
    }
}
