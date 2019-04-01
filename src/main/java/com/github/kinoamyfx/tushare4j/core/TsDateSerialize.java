package com.github.kinoamyfx.tushare4j.core;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;

import static com.github.kinoamyfx.tushare4j.core.TsDate.TS_DATE_FORMAT;

public class TsDateSerialize extends JsonSerializer<TsDate> {

    @Override
    public void serialize(TsDate tsDate, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        jsonGenerator.writeString(tsDate.date.format(TS_DATE_FORMAT));
    }
}
