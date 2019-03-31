package com.github.kinoamyfx.tushare4j.fund;

import com.github.kinoamyfx.tushare4j.core.TsParam;
import com.github.kinoamyfx.tushare4j.core.TsRequest;
import lombok.Data;
import lombok.NonNull;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class FundPortfolioRequest implements TsRequest<FundPortfolio> {

    @TsParam(name = "ts_code")
    @NonNull
    private String tsCode;

    public FundPortfolioRequest(@NonNull String tsCode) {
        this.tsCode = tsCode;
    }

    @Override
    public String apiName() {
        return "fund_portfolio";
    }
}
