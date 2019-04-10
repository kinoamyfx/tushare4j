package com.github.kinoamyfx.tushare4j.finance;

import com.github.kinoamyfx.tushare4j.core.TsDate;
import com.github.kinoamyfx.tushare4j.core.TsParam;
import com.github.kinoamyfx.tushare4j.core.TsRequest;
import lombok.Data;

@Data
public class DividendRequest implements TsRequest<Dividend> {

    @TsParam(name = "ts_code")
    private String tsCode;

    @TsParam(name = "ann_date")
    private TsDate annDate;

    @TsParam(name = "record_date")
    private TsDate recordDate;

    @TsParam(name = "ex_date")
    private TsDate exDate;

    @TsParam(name = "imp_ann_date")
    private TsDate impAnnDate;


    @Override
    public String apiName() {
        return "dividend";
    }
}
