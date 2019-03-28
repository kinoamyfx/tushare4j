package com.github.kinoamyfx.tushare4j.finance;

import com.github.kinoamyfx.tushare4j.core.TsParam;
import com.github.kinoamyfx.tushare4j.core.TsRequest;
import lombok.Data;
import lombok.NonNull;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class BalanceSheetRequest implements TsRequest<BalanceSheet> {

    @TsParam(name = "ts_code")
    @NonNull
    private String tsCode;

    @TsParam(name = "ann_date")
    private String annDate;

    @TsParam(name = "start_date")
    private String startDate;

    @TsParam(name = "end_date")
    private String endDate;

    @TsParam(name = "period")
    private String period;

    @TsParam(name = "report_type")
    private String reportType;

    @TsParam(name = "comp_type")
    private String compType;

    public BalanceSheetRequest(@NonNull String tsCode) {
        this.tsCode = tsCode;
    }

    @Override
    public String apiName() {
        return "balancesheet";
    }
}
