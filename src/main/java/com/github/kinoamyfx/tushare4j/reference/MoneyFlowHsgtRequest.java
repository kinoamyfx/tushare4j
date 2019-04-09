package com.github.kinoamyfx.tushare4j.reference;

import com.github.kinoamyfx.tushare4j.core.TsDate;
import com.github.kinoamyfx.tushare4j.core.TsParam;
import com.github.kinoamyfx.tushare4j.core.TsRequest;
import lombok.Data;

/**
 * hsgt 沪深港通 每日资金流向
 */
@Data
public class MoneyFlowHsgtRequest implements TsRequest<MoneyFlowHsgt> {

    @TsParam(name = "trade_date")
    private TsDate tradeDate;

    @TsParam(name = "start_date")
    private TsDate startDate;

    @TsParam(name = "end_date")
    private TsDate endDate;

    @Override
    public String apiName() {
        return "moneyflow_hsgt";
    }
}
