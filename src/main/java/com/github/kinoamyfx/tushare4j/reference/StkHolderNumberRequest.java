package com.github.kinoamyfx.tushare4j.reference;

import com.github.kinoamyfx.tushare4j.core.TsParam;
import com.github.kinoamyfx.tushare4j.core.TsRequest;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class StkHolderNumberRequest implements TsRequest<StkHolderNumber> {

    @TsParam(name = "ts_code")
    private String tsCode;

    @TsParam(name = "enddate")
    private String enddate;

    @TsParam(name = "start_date")
    private String start_date;

    @TsParam(name = "end_date")
    private String end_date;

    @Override
    public String apiName() {
        return "stk_holdernumber";
    }
}
