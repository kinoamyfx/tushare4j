package com.github.kinoamyfx.tushare4j.reference;

import com.github.kinoamyfx.tushare4j.core.TsParam;
import com.github.kinoamyfx.tushare4j.core.TsRequest;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class ShareFloatRequest implements TsRequest<ShareFloat> {

    @TsParam(name = "ts_code")
    private String tsCode;

    @TsParam(name = "ann_date")
    private String annDate;

    @TsParam(name = "float_date")
    private String floatDate;

    @TsParam(name = "start_date")
    private String startDate;

    @TsParam(name = "end_date")
    private String endDate;


    @Override
    public String apiName() {
        return "share_float";
    }
}
