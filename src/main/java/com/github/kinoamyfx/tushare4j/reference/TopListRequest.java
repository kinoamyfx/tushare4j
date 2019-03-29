package com.github.kinoamyfx.tushare4j.reference;

import com.github.kinoamyfx.tushare4j.core.TsParam;
import com.github.kinoamyfx.tushare4j.core.TsRequest;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class TopListRequest implements TsRequest<TopList> {

    @TsParam(name = "trade_date")
    private String tradeDate;

    @TsParam(name = "ts_code")
    private String tsCode;

    @Override
    public String apiName() {
        return "top_list";
    }
}
