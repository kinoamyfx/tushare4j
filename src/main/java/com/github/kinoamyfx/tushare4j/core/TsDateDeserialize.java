package com.github.kinoamyfx.tushare4j.core;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

import java.io.IOException;

public class TsDateDeserialize extends JsonDeserializer<TsDate> {

    @Override
    public TsDate deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        return TsDate.parse(jsonParser.getValueAsString());
    }
}
