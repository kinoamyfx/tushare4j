package com.github.kinoamyfx.tushare4j.consensus;

import com.github.kinoamyfx.tushare4j.core.TsDate;
import com.github.kinoamyfx.tushare4j.core.TsParam;
import com.github.kinoamyfx.tushare4j.core.TsRequest;
import com.github.kinoamyfx.tushare4j.enums.NewsSource;
import lombok.Data;

import static com.github.kinoamyfx.tushare4j.core.TsParam.RequiredType.REQUIRED;

@Data
public class NewsRequest implements TsRequest<News> {

    @TsParam(name = "start_date", required = REQUIRED)
    private TsDate start_date;

    @TsParam(name = "end_date", required = REQUIRED)
    private TsDate end_date;

    @TsParam(name = "src", required = REQUIRED)
    private NewsSource src;

    @Override
    public String apiName() {
        return "news";
    }
}
