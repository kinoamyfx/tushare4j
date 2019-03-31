package com.github.kinoamyfx.tushare4j.tmt;

import com.github.kinoamyfx.tushare4j.core.TsParam;
import com.github.kinoamyfx.tushare4j.core.TsRequest;
import lombok.Data;

@Data
public class FilmRecordRequest implements TsRequest<FilmRecord> {

    @TsParam(name = "ann_date")
    private String ann_date;

    @TsParam(name = "start_date")
    private String start_date;

    @TsParam(name = "end_date")
    private String end_date;


    @Override
    public String apiName() {
        return "film_record";
    }
}
