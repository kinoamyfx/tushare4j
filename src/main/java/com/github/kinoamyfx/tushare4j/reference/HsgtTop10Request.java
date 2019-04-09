package com.github.kinoamyfx.tushare4j.reference;

import com.github.kinoamyfx.tushare4j.core.TsDate;
import com.github.kinoamyfx.tushare4j.core.TsParam;
import com.github.kinoamyfx.tushare4j.core.TsRequest;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class HsgtTop10Request implements TsRequest<HsgtTop10> {

    @TsParam(name = "ts_code", required = TsParam.RequiredType.ALTERNATIVE)
    private String tsCode;

    @TsParam(name = "trade_date", required = TsParam.RequiredType.ALTERNATIVE)
    private TsDate tradeDate;

    @TsParam(name = "start_date")
    private TsDate startDate;

    @TsParam(name = "end_date")
    private TsDate endDate;

    /**
     * 市场类型（1：沪市 3：深市）
     */
    @TsParam(name = "market_type")
    private Integer marketType;


    @Override
    public String apiName() {
        return "hsgt_top10";
    }
}
