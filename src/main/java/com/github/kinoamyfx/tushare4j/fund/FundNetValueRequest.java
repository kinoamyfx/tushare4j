package com.github.kinoamyfx.tushare4j.fund;

import com.github.kinoamyfx.tushare4j.core.TsParam;
import com.github.kinoamyfx.tushare4j.core.TsRequest;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class FundNetValueRequest implements TsRequest<FundNetValue> {

    @TsParam(name = "ts_code")
    private String tsCode;
    @TsParam(name = "end_date")
    private String endDate;

    @Override
    public String apiName() {
        return "fund_nav";
    }

}
