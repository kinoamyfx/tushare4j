package com.github.kinoamyfx.tushare4j.tmt;

import com.github.kinoamyfx.tushare4j.core.TsDate;
import com.github.kinoamyfx.tushare4j.core.TsParam;
import com.github.kinoamyfx.tushare4j.core.TsRequest;
import lombok.Data;

@Data
public class TmtTwIncomeRequest implements TsRequest<TmtTwIncome> {

    @TsParam(name = "date")
    private TsDate date;

    @TsParam(name = "item", required = TsParam.RequiredType.REQUIRED)
    private Integer item;

    @TsParam(name = "start_date")
    private TsDate start_date;

    @TsParam(name = "end_date")
    private TsDate end_date;

    @Override
    public String apiName() {
        return "tmt_twincome";
    }
}
