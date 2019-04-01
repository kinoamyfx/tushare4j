package com.github.kinoamyfx.tushare4j.consensus;

import com.github.kinoamyfx.tushare4j.core.TsDate;
import com.github.kinoamyfx.tushare4j.core.TsParam;
import com.github.kinoamyfx.tushare4j.core.TsRequest;
import lombok.Data;

import static com.github.kinoamyfx.tushare4j.core.TsParam.RequiredType.REQUIRED;

@Data
public class CCTVNewsRequest implements TsRequest<CCTVNews> {

    @TsParam(name = "date", required = REQUIRED)
    private TsDate date;

    @Override
    public String apiName() {
        return "cctv_news";
    }
}
