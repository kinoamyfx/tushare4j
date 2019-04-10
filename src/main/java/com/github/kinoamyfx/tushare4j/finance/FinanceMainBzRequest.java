package com.github.kinoamyfx.tushare4j.finance;

import com.github.kinoamyfx.tushare4j.core.TsDate;
import com.github.kinoamyfx.tushare4j.core.TsParam;
import com.github.kinoamyfx.tushare4j.core.TsRequest;
import lombok.Data;

import static com.github.kinoamyfx.tushare4j.core.TsParam.RequiredType.REQUIRED;

@Data
public class FinanceMainBzRequest implements TsRequest<FinanceMainBz> {

    @TsParam(name = "ts_code", required = REQUIRED)
    private String tsCode;

    @TsParam(name = "type")
    private BizType type;

    @TsParam(name = "start_date")
    private TsDate startDate;

    @TsParam(name = "end_date")
    private TsDate endDate;

    @TsParam(name = "period")
    private TsDate period;

    @Override
    public String apiName() {
        return "fina_mainbz";
    }
}