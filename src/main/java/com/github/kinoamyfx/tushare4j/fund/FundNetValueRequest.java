package com.github.kinoamyfx.tushare4j.fund;

import com.github.kinoamyfx.tushare4j.core.TsDate;
import com.github.kinoamyfx.tushare4j.core.TsParam;
import com.github.kinoamyfx.tushare4j.core.TsRequest;
import lombok.Data;

import static com.github.kinoamyfx.tushare4j.core.TsParam.RequiredType.ALTERNATIVE;

@Data
public class FundNetValueRequest implements TsRequest<FundNetValue> {

    @TsParam(name = "ts_code", required = ALTERNATIVE)
    private String tsCode;

    @TsParam(name = "end_date", required = ALTERNATIVE)
    private TsDate endDate;


    @Override
    public String apiName() {
        return "fund_nav";
    }

}
