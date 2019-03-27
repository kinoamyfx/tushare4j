package com.github.kinoamyfx.tushare4j.market;

import com.github.kinoamyfx.tushare4j.core.TsParam;
import com.github.kinoamyfx.tushare4j.core.TsRequest;
import lombok.Data;
import lombok.ToString;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
@ToString
public class StockDailyRequest implements TsRequest<KLine> {

    @TsParam(name = "ts_code")
    private String tsCode;

    @TsParam(name = "trade_date")
    private String tradeDate;

    @TsParam(name = "start_date")
    private String startDate;

    @TsParam(name = "end_date")
    private String endDate;

    @Override
    public String apiName() {
        return "daily";
    }

    @Override
    public void validate() {
        if (tsCode == null && tradeDate == null) {
            throw new IllegalArgumentException(" ts_code,trade_date, need at least one");
        }
    }
}
