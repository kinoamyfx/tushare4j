package com.github.kinoamyfx.tushare4j.index;

import com.github.kinoamyfx.tushare4j.core.TsParam;
import com.github.kinoamyfx.tushare4j.core.TsRequest;
import com.github.kinoamyfx.tushare4j.stock.KLine;
import com.github.kinoamyfx.tushare4j.utils.ClassUtils;
import lombok.Data;
import lombok.NonNull;
import lombok.ToString;

import java.util.List;

@Data
@ToString
public class IndexDailyRequest implements TsRequest<KLine> {

    @TsParam(name = "ts_code")
    @NonNull
    private String tsCode;

    @TsParam(name = "trade_date")
    private String tradeDate;

    @TsParam(name = "start_date")
    private String startDate;

    @TsParam(name = "end_date")
    private String endDate;


    public IndexDailyRequest(@NonNull String tsCode) {
        this.tsCode = tsCode;
    }

    @Override
    public String apiName() {
        return "index_daily";
    }

    @Override
    public List<String> fields() {
        return ClassUtils.resolveFields(KLine.class);
    }
}
