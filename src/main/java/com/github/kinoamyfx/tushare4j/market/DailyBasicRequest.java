package com.github.kinoamyfx.tushare4j.market;

import com.github.kinoamyfx.tushare4j.core.TsParam;
import com.github.kinoamyfx.tushare4j.core.TsRequest;
import com.github.kinoamyfx.tushare4j.utils.ClassUtils;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

@Data
@Accessors(chain = true)
public class DailyBasicRequest implements TsRequest<DailyBasic> {

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
        return "daily_basic";
    }

    @Override
    public List<String> fields() {
        return ClassUtils.resolveFields(DailyBasic.class);
    }
}
