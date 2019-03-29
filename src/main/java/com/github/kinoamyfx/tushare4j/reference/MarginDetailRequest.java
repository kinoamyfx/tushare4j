package com.github.kinoamyfx.tushare4j.reference;

import com.github.kinoamyfx.tushare4j.core.TsParam;
import com.github.kinoamyfx.tushare4j.core.TsRequest;
import lombok.Data;
import lombok.NonNull;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class MarginDetailRequest implements TsRequest<MarginDetail> {

    @TsParam(name = "trade_date")
    @NonNull
    private String trade_date;

    @TsParam(name = "ts_code")
    private String ts_code;


    @Override
    public String apiName() {
        return "margin_detail";
    }
}
