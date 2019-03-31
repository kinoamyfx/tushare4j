package com.github.kinoamyfx.tushare4j.reference;

import com.github.kinoamyfx.tushare4j.core.TsParam;
import com.github.kinoamyfx.tushare4j.core.TsRequest;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class Top10FloatHoldersRequest implements TsRequest<Top10FloatHolders> {

    @TsParam(name = "ts_code")
    private String tsCode;

    @TsParam(name = "period")
    private String period;

    @TsParam(name = "ann_date")
    private String annDate;

    @TsParam(name = "start_date")
    private String startDate;

    @TsParam(name = "end_date")
    private String endDate;


    @Override
    public String apiName() {
        return "top10_floatholders";
    }
}
