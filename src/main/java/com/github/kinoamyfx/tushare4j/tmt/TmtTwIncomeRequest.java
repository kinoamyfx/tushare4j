package com.github.kinoamyfx.tushare4j.tmt;

import com.github.kinoamyfx.tushare4j.core.TsParam;
import com.github.kinoamyfx.tushare4j.core.TsRequest;
import lombok.Data;
import lombok.NonNull;

@Data
public class TmtTwIncomeRequest implements TsRequest<TmtTwIncome> {

    @TsParam(name = "date")
    private String date;

    @TsParam(name = "item")
    @NonNull
    private String item;

    @TsParam(name = "start_date")
    private String start_date;

    @TsParam(name = "end_date")
    private String end_date;

    public TmtTwIncomeRequest(@NonNull String item) {
        this.item = item;
    }

    @Override
    public String apiName() {
        return "tmt_twincome";
    }
}
