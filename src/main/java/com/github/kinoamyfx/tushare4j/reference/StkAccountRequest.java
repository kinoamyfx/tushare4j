package com.github.kinoamyfx.tushare4j.reference;

import com.github.kinoamyfx.tushare4j.core.TsDate;
import com.github.kinoamyfx.tushare4j.core.TsParam;
import com.github.kinoamyfx.tushare4j.core.TsRequest;
import lombok.Data;

import static com.github.kinoamyfx.tushare4j.core.TsParam.RequiredType.ALTERNATIVE;

@Data
public class StkAccountRequest implements TsRequest<StkAccount> {

    @TsParam(name = "date", required = ALTERNATIVE)
    private TsDate date;

    @TsParam(name = "start_date", required = ALTERNATIVE)
    private TsDate startDate;

    @TsParam(name = "end_date", required = ALTERNATIVE)
    private TsDate endDate;

    @Override
    public String apiName() {
        return "stk_account";
    }
}
