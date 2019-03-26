package com.github.kinoamyfx.tushare4j.index;

import com.github.kinoamyfx.tushare4j.core.TsRequest;
import com.github.kinoamyfx.tushare4j.stock.KLine;
import com.github.kinoamyfx.tushare4j.utils.ClassUtils;
import lombok.NonNull;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class IndexDailyRequest implements TsRequest<KLine> {

    @NonNull
    private String tsCode;

    private String tradeDate;

    private String startDate;

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

    @Override
    public Map<String, String> params() {
        Map<String, String> params = new HashMap<>();
        Optional.ofNullable(tsCode).ifPresent(s -> params.put("ts_code", tsCode));
        Optional.ofNullable(tradeDate).ifPresent(s -> params.put("trade_date", tradeDate));
        Optional.ofNullable(startDate).ifPresent(s -> params.put("start_date", startDate));
        Optional.ofNullable(endDate).ifPresent(s -> params.put("end_date", endDate));
        return params;
    }
}
