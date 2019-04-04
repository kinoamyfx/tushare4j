package com.github.kinoamyfx.tushare4j.fund;

import com.github.kinoamyfx.tushare4j.core.TsParam;
import com.github.kinoamyfx.tushare4j.core.TsRequest;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class FundBasicRequest implements TsRequest<FundBasic> {

    @TsParam(name = "market")
    private FundMarket market = FundMarket.E;

    @Override
    public String apiName() {
        return "fund_basic";
    }
}
