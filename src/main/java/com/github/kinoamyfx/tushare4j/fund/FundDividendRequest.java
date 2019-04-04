package com.github.kinoamyfx.tushare4j.fund;

import com.github.kinoamyfx.tushare4j.core.TsDate;
import com.github.kinoamyfx.tushare4j.core.TsParam;
import com.github.kinoamyfx.tushare4j.core.TsRequest;
import lombok.Data;

import static com.github.kinoamyfx.tushare4j.core.TsParam.RequiredType.ALTERNATIVE;

@Data
public class FundDividendRequest implements TsRequest<FundDividend> {

    @TsParam(name = "ts_code", required = ALTERNATIVE)
    private String tsCode;

    @TsParam(name = "ann_date", required = ALTERNATIVE)
    private TsDate annDate;

    @TsParam(name = "ex_date", required = ALTERNATIVE)
    private TsDate exDate;

    @TsParam(name = "pay_date", required = ALTERNATIVE)
    private TsDate payDate;


    @Override
    public String apiName() {
        return "fund_div";
    }
}
