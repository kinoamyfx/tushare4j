package com.github.kinoamyfx.tushare4j.tmt;

import com.github.kinoamyfx.tushare4j.core.TsDate;
import com.github.kinoamyfx.tushare4j.core.TsParam;
import com.github.kinoamyfx.tushare4j.core.TsRequest;
import lombok.Data;

@Data
public class TmtTWIncomeDetailRequest implements TsRequest<TmtTWIncomeDetail> {
    /**
     * 报告期
     */
    @TsParam(name = "date")
    private TsDate date;
    /**
     * 产品代码
     */
    @TsParam(name = "item")
    private Integer item;
    /**
     * 公司代码
     */
    @TsParam(name = "symbol")
    private Long symbol;

    /**
     * 报告期开始日期
     */
    @TsParam(name = "start_date")
    private TsDate start_date;
    /**
     * 报告期结束日期
     */
    @TsParam(name = "end_date")
    private TsDate end_date;
    /**
     *
     */
    @TsParam(name = "source")
    private String source;

    @Override
    public String apiName() {
        return "tmt_twincomedetail";
    }
}
