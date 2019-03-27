package com.github.kinoamyfx.tushare4j.basic;

import com.github.kinoamyfx.tushare4j.core.TsParam;
import com.github.kinoamyfx.tushare4j.core.TsRequest;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Accessors(chain = true)
public class StockBasicListRequest implements TsRequest<StockBasic> {

    @TsParam(name = "is_hs")
    @Setter
    private IsHs isHs;

    @TsParam(name = "list_status")
    @Setter
    private ListStatus listStatus;

    @TsParam(name = "exchange")
    @Setter
    private Exchange exchange;

    @Override
    public String apiName() {
        return "stock_basic";
    }

    /**
     * 是否沪深港通标的
     */
    public enum IsHs {
        /**
         * 不是
         */
        N,
        /**
         * 沪股通
         */
        H,
        /**
         * 深股通
         */
        S
    }

    public enum ListStatus {
        /**
         * 上市
         */
        L,
        /**
         * 退市
         */
        D,
        /**
         * 暂停上市
         */
        P
    }

}
