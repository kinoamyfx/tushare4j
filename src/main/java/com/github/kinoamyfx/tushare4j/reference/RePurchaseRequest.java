package com.github.kinoamyfx.tushare4j.reference;

import com.github.kinoamyfx.tushare4j.core.TsParam;
import com.github.kinoamyfx.tushare4j.core.TsRequest;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class RePurchaseRequest implements TsRequest<RePurchase> {

    @TsParam(name = "ann_date")
    private String ann_date;

    @TsParam(name = "start_date")
    private String start_date;

    @TsParam(name = "end_date")
    private String end_date;


    @Override
    public String apiName() {
        return "repurchase";
    }
}
