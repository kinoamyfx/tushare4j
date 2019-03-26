package com.github.kinoamyfx.tushare4j.stock;

import com.github.kinoamyfx.tushare4j.core.TsRequest;
import com.github.kinoamyfx.tushare4j.utils.ClassUtils;
import lombok.Data;
import lombok.Singular;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Data
@Accessors(chain = true)
@ToString
public class StockDailyRequest implements TsRequest<KLine> {

    @Singular
    private String[] fields = new String[]{"ts_code", "trade_date", "open", "high", "low", "close", "pre_close", "change", "pct_chg", "vol", "amount"};

    private String tsCode;

    private String tradeDate;

    private String startDate;

    private String endDate;

    @Override
    public String apiName() {
        return "daily";
    }

    @Override
    public List<String> fields() {
        return ClassUtils.resolveFields(KLine.class);
    }

    @Override
    public Map<String, String> params() {

        Map<String, String> params = new HashMap<>();

        if (tsCode == null && tradeDate == null) {
            throw new IllegalStateException();
        }

        Optional.ofNullable(tsCode).ifPresent(s -> params.put("ts_code", tsCode));
        Optional.ofNullable(tradeDate).ifPresent(s -> params.put("trade_date", tradeDate));
        Optional.ofNullable(startDate).ifPresent(s -> params.put("start_date", startDate));
        Optional.ofNullable(endDate).ifPresent(s -> params.put("end_date", endDate));
        return params;
    }
}
