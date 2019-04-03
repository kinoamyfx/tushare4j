package com.github.kinoamyfx.tushare4j.option;

import com.github.kinoamyfx.tushare4j.core.TsParam;
import com.github.kinoamyfx.tushare4j.core.TsRequest;
import lombok.Data;

@Data
public class OptionBasicRequest implements TsRequest<OptionBasic> {
    /**
     * 交易所
     */
    @TsParam(name = "exchange")
    private OptionExchange exchange;
    /**
     * 期权类型
     */
    @TsParam(name = "call_put")
    private CallPut callPut;

    @Override
    public String apiName() {
        return "opt_basic";
    }
}
