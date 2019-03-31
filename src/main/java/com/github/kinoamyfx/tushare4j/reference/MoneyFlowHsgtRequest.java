package com.github.kinoamyfx.tushare4j.reference;

import com.github.kinoamyfx.tushare4j.core.TsParam;
import com.github.kinoamyfx.tushare4j.core.TsRequest;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class MoneyFlowHsgtRequest implements TsRequest<MoneyFlowHsgt> {

    @TsParam(name = "trade_date")
    private String tradeDate;

    @TsParam(name = "start_date")
    private String startDate;

    @TsParam(name = "end_date")
    private String endDate;


    @Override
    public String apiName() {
        return "moneyflow_hsgt";
    }

}
