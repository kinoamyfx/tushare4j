package com.github.kinoamyfx.tushare4j.fund;

import com.github.kinoamyfx.tushare4j.core.TsParam;
import com.github.kinoamyfx.tushare4j.core.TsRequest;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class FundDividendRequest implements TsRequest<FundDividend> {

    @TsParam(name = "ts_code")
    private String tsCode;

    @TsParam(name = "ann_date")
    private String annDate;

    @TsParam(name = "ex_date")
    private String exDate;

    @TsParam(name = "pay_date")
    private String payDate;


    @Override
    public String apiName() {
        return "fund_div";
    }
}
