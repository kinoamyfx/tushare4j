package com.github.kinoamyfx.tushare4j.market;

import com.github.kinoamyfx.tushare4j.core.TsParam;
import com.github.kinoamyfx.tushare4j.core.TsRequest;
import lombok.Data;

import static com.github.kinoamyfx.tushare4j.core.TsParam.RequiredType.ALTERNATIVE;

@Data
public class SuspendRequest implements TsRequest<Suspend> {

    @TsParam(name = "ts_code", required = ALTERNATIVE)
    private String tsCode;

    @TsParam(name = "suspend_date", required = ALTERNATIVE)
    private String suspendDate;

    @TsParam(name = "resume_date", required = ALTERNATIVE)
    private String resumeDate;

    @Override
    public String apiName() {
        return "suspend";
    }

}
