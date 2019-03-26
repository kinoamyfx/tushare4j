package com.github.kinoamyfx.tushare4j.basic;

import com.github.kinoamyfx.tushare4j.core.TsParam;
import com.github.kinoamyfx.tushare4j.core.TsRequest;
import com.github.kinoamyfx.tushare4j.utils.ClassUtils;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.List;

@Getter
@Accessors(chain = true)
public class TradeCalendarRequest implements TsRequest<TradeCalendar> {

    @TsParam(name = "exchange")
    @Setter
    private Exchange exchange;

    @TsParam(name = "start_date")
    @Setter
    private String startDate;

    @TsParam(name = "end_date")
    @Setter
    private String endDate;

    @TsParam(name = "is_open")
    @Setter
    private Integer isOpen;

    @Override
    public String apiName() {
        return "trade_cal";
    }

    @Override
    public List<String> fields() {
        return ClassUtils.resolveFields(TradeCalendar.class);
    }
}
