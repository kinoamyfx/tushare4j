package com.github.kinoamyfx.tushare4j.basic;

import com.github.kinoamyfx.tushare4j.core.TsParam;
import com.github.kinoamyfx.tushare4j.core.TsRequest;
import com.github.kinoamyfx.tushare4j.utils.ClassUtils;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

@Data
@Accessors(chain = true)
public class StockCompanyRequest implements TsRequest<StockCompany> {

    @TsParam(name = "exchange")
    private Exchange exchange = Exchange.SSE;

    @Override
    public String apiName() {
        return "stock_company";
    }

    @Override
    public List<String> fields() {
        return ClassUtils.resolveFields(StockCompany.class);
    }
}
