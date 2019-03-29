package com.github.kinoamyfx.tushare4j.reference;

import com.github.kinoamyfx.tushare4j.core.TsParam;
import com.github.kinoamyfx.tushare4j.core.TsRequest;
import lombok.Data;
import lombok.NonNull;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class TopInstRequest implements TsRequest<TopInst> {


    @TsParam(name = "trade_date")
    @NonNull
    private String tradeDate;

    @TsParam(name = "ts_code")
    private String tsCode;

    public TopInstRequest(@NonNull String tradeDate) {
        this.tradeDate = tradeDate;
    }

    @Override
    public String apiName() {
        return "top_inst";
    }
}
