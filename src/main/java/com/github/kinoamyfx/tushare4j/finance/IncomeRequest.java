package com.github.kinoamyfx.tushare4j.finance;

import com.github.kinoamyfx.tushare4j.core.TsDate;
import com.github.kinoamyfx.tushare4j.core.TsParam;
import com.github.kinoamyfx.tushare4j.core.TsRequest;
import lombok.Data;

import static com.github.kinoamyfx.tushare4j.core.TsParam.RequiredType.REQUIRED;

@Data
public class IncomeRequest implements TsRequest<Income> {

    @TsParam(name = "ts_code", required = REQUIRED)
    private String tsCode;

    @TsParam(name = "ann_date")
    private TsDate annDate;

    @TsParam(name = "start_date")
    private TsDate startDate;

    @TsParam(name = "end_date")
    private TsDate endDate;

    @TsParam(name = "period")
    private TsDate period;

    @TsParam(name = "report_type")
    private Integer reportType;

    @TsParam(name = "comp_type")
    private Integer compType;

    @Override
    public String apiName() {
        return "income";
    }
}
