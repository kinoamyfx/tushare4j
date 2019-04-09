package com.github.kinoamyfx.tushare4j.index;

import com.github.kinoamyfx.tushare4j.core.TsParam;
import com.github.kinoamyfx.tushare4j.core.TsRequest;
import lombok.Data;

import static com.github.kinoamyfx.tushare4j.core.TsParam.RequiredType.REQUIRED;


@Data
public class IndexBasicRequest implements TsRequest<IndexBasic> {

    @TsParam(name = "market", required = REQUIRED)
    private Market market;

    @TsParam(name = "publisher")
    private String publisher;

    @TsParam(name = "category")
    private String category;

    @Override
    public String apiName() {
        return "index_basic";
    }

    public enum Market {
        /**
         * MSCI指数
         */
        MSCI,
        /**
         * 中证指数
         */
        CSI,
        /**
         * 上交所指数
         */
        SSE,
        /**
         * 深交所指数
         */
        SZSE,
        /**
         * 中金所指数
         */
        CICC,
        /**
         * 申万指数
         */
        SW,
        /**
         * 国证指数
         */
        CNI,
        /**
         * 其他指数
         */
        OTH
    }
}
