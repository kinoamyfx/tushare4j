package com.github.kinoamyfx.tushare4j.finance;

import com.github.kinoamyfx.tushare4j.core.TsParam;
import com.github.kinoamyfx.tushare4j.core.TsRequest;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class DividendRequest implements TsRequest<Dividend> {

    @TsParam(name = "ts_code")
    private String tsCode;

    @TsParam(name = "ann_date")
    private String annDate;

    @TsParam(name = "record_date")
    private String recordDate;

    @TsParam(name = "ex_date")
    private String exDate;

    @TsParam(name = "imp_ann_date")
    private String impAnnDate;


    @Override
    public String apiName() {
        return "dividend";
    }
}
