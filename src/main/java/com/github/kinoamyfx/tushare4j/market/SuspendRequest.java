package com.github.kinoamyfx.tushare4j.market;

import com.github.kinoamyfx.tushare4j.core.TsParam;
import com.github.kinoamyfx.tushare4j.core.TsRequest;
import com.github.kinoamyfx.tushare4j.utils.ClassUtils;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

@Data
@Accessors(chain = true)
public class SuspendRequest implements TsRequest<Suspend> {

    @TsParam(name = "ts_code")
    private String tsCode;

    @TsParam(name = "suspend_date")
    private String suspendDate;

    @TsParam(name = "resume_date")
    private String resumeDate;

    @Override
    public String apiName() {
        return "suspend";
    }

    @Override
    public List<String> fields() {
        return ClassUtils.resolveFields(Suspend.class);
    }
}
