package com.github.kinoamyfx.tushare4j.basic;

import com.github.kinoamyfx.tushare4j.core.TsParam;
import com.github.kinoamyfx.tushare4j.core.TsRequest;
import com.github.kinoamyfx.tushare4j.enums.Exchange;
import com.github.kinoamyfx.tushare4j.enums.IsHs;
import com.github.kinoamyfx.tushare4j.enums.ListStatus;
import lombok.Data;

@Data
public class StockBasicRequest implements TsRequest<StockBasic> {

    @TsParam(name = "is_hs")
    private IsHs isHs;

    @TsParam(name = "list_status")
    private ListStatus listStatus;

    @TsParam(name = "exchange")
    private Exchange exchange;

    @Override
    public String apiName() {
        return "stock_basic";
    }
}
