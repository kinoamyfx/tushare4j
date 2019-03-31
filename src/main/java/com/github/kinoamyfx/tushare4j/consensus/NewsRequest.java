package com.github.kinoamyfx.tushare4j.consensus;

import com.github.kinoamyfx.tushare4j.core.TsParam;
import com.github.kinoamyfx.tushare4j.core.TsRequest;
import lombok.Data;

import java.util.Date;

@Data
public class NewsRequest implements TsRequest<News> {

    @TsParam(name = "start_date")
    private Date start_date;
    @TsParam(name = "end_date")
    private Date end_date;
    @TsParam(name = "src")
    private String src;

    @Override
    public String apiName() {
        return "news";
    }
}
