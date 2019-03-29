package com.github.kinoamyfx.tushare4j.reference;

import com.github.kinoamyfx.tushare4j.core.TsParam;
import com.github.kinoamyfx.tushare4j.core.TsRequest;
import lombok.Data;
import lombok.NonNull;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class PledgeDetailRequest implements TsRequest<PledgeDetail> {

    @TsParam(name = "ts_code")
    @NonNull
    private String tsCode;

    public PledgeDetailRequest(@NonNull String tsCode) {
        this.tsCode = tsCode;
    }

    @Override
    public String apiName() {
        return "pledge_detail";
    }
}
