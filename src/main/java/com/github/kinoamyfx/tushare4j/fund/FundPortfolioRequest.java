package com.github.kinoamyfx.tushare4j.fund;

import com.github.kinoamyfx.tushare4j.core.TsParam;
import com.github.kinoamyfx.tushare4j.core.TsRequest;
import lombok.Data;

import static com.github.kinoamyfx.tushare4j.core.TsParam.RequiredType.ALTERNATIVE;

@Data
public class FundPortfolioRequest implements TsRequest<FundPortfolio> {

    @TsParam(name = "ts_code", required = ALTERNATIVE)
    private String tsCode;

    @Override
    public String apiName() {
        return "fund_portfolio";
    }
}
