package com.github.kinoamyfx.tushare4j.option;

import com.github.kinoamyfx.tushare4j.core.TsParam;
import com.github.kinoamyfx.tushare4j.core.TsRequest;
import lombok.Data;
import lombok.NonNull;

@Data
public class OptionBasicRequest implements TsRequest<OptionBasic> {
    /**
     * 交易所
     */
    @TsParam(name = "exchange")
    @NonNull
    private String exchange;

    /**
     * 期权类型
     */
    @TsParam(name = "call_put")
    private String callPut;

    @Override
    public String apiName() {
        return "opt_basic";
    }
}
