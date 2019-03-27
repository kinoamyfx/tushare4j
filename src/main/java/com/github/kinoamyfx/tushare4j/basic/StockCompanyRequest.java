package com.github.kinoamyfx.tushare4j.basic;

import com.github.kinoamyfx.tushare4j.core.TsParam;
import com.github.kinoamyfx.tushare4j.core.TsRequest;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class StockCompanyRequest implements TsRequest<StockCompany> {

    @TsParam(name = "exchange")
    private Exchange exchange = Exchange.SSE;

    @Override
    public String apiName() {
        return "stock_company";
    }

}
