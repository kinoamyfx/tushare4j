package com.github.kinoamyfx.tushare4j.reference;

import com.github.kinoamyfx.tushare4j.core.TsDate;
import com.github.kinoamyfx.tushare4j.core.TsParam;
import com.github.kinoamyfx.tushare4j.core.TsRequest;
import lombok.Data;

import static com.github.kinoamyfx.tushare4j.core.TsParam.RequiredType.ALTERNATIVE;

@Data
public class ShareFloatRequest implements TsRequest<ShareFloat> {

    @TsParam(name = "ts_code", required = ALTERNATIVE)
    private String tsCode;

    @TsParam(name = "ann_date", required = ALTERNATIVE)
    private TsDate annDate;

    @TsParam(name = "float_date", required = ALTERNATIVE)
    private TsDate floatDate;

    @TsParam(name = "start_date", required = ALTERNATIVE)
    private TsDate startDate;

    @TsParam(name = "end_date", required = ALTERNATIVE)
    private TsDate endDate;

    @Override
    public String apiName() {
        return "share_float";
    }
}
