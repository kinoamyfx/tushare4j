package com.github.kinoamyfx.tushare4j.fund;

import com.github.kinoamyfx.tushare4j.core.TsRequest;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class FundCompanyRequest implements TsRequest<FundCompany> {

    @Override
    public String apiName() {
        return "fund_company";
    }
}
