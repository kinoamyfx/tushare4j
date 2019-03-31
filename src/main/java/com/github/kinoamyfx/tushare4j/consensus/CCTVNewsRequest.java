package com.github.kinoamyfx.tushare4j.consensus;

import com.github.kinoamyfx.tushare4j.core.TsParam;
import com.github.kinoamyfx.tushare4j.core.TsRequest;
import lombok.Data;
import lombok.NonNull;

@Data
public class CCTVNewsRequest implements TsRequest<CCTVNews> {

    @TsParam(name = "date")
    @NonNull
    private String date;

    @Override
    public String apiName() {
        return "cctv_news";
    }
}
