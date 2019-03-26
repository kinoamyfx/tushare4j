package com.github.kinoamyfx.tushare4j.core;

import java.util.List;

public interface TsRequest<R> {
    String apiName();

    default void validate() {
    }

    List<String> fields();
}
