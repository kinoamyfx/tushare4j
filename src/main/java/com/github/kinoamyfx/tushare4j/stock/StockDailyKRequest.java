package com.github.kinoamyfx.tushare4j.stock;

import com.github.kinoamyfx.tushare4j.core.TsParam;
import com.github.kinoamyfx.tushare4j.core.TsRequest;
import com.github.kinoamyfx.tushare4j.utils.ClassUtils;
import lombok.Data;
import lombok.Singular;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.util.List;

@Data
@Accessors(chain = true)
@ToString
public class StockDailyKRequest implements TsRequest<KLine> {

    @Singular
    private String[] fields = new String[]{"ts_code", "trade_date", "open", "high", "low", "close", "pre_close", "change", "pct_chg", "vol", "amount"};

    @TsParam(name = "ts_code")
    private String tsCode;

    @TsParam(name = "trade_date")
    private String tradeDate;

    @TsParam(name = "start_date")
    private String startDate;

    @TsParam(name = "end_date")
    private String endDate;

    @Override
    public String apiName() {
        return "daily";
    }

    @Override
    public List<String> fields() {
        return ClassUtils.resolveFields(KLine.class);
    }

}
