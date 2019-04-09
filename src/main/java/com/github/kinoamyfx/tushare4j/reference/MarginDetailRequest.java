package com.github.kinoamyfx.tushare4j.reference;

import com.github.kinoamyfx.tushare4j.core.TsDate;
import com.github.kinoamyfx.tushare4j.core.TsParam;
import com.github.kinoamyfx.tushare4j.core.TsRequest;
import lombok.Data;

import static com.github.kinoamyfx.tushare4j.core.TsParam.RequiredType.REQUIRED;

@Data
public class MarginDetailRequest implements TsRequest<MarginDetail> {

    @TsParam(name = "trade_date", required = REQUIRED)
    private TsDate trade_date;

    @TsParam(name = "ts_code")
    private String ts_code;


    @Override
    public String apiName() {
        return "margin_detail";
    }
}
