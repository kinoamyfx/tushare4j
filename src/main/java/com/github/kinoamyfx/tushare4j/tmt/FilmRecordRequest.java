package com.github.kinoamyfx.tushare4j.tmt;

import com.github.kinoamyfx.tushare4j.core.TsDate;
import com.github.kinoamyfx.tushare4j.core.TsParam;
import com.github.kinoamyfx.tushare4j.core.TsRequest;
import lombok.Data;

@Data
public class FilmRecordRequest implements TsRequest<FilmRecord> {

    @TsParam(name = "ann_date")
    private TsDate ann_date;

    @TsParam(name = "start_date")
    private TsDate start_date;

    @TsParam(name = "end_date")
    private TsDate end_date;


    @Override
    public String apiName() {
        return "film_record";
    }
}
