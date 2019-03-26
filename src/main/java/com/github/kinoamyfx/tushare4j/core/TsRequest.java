package com.github.kinoamyfx.tushare4j.core;

import java.util.List;

public interface TsRequest<R> {
    String apiName();

    List<String> fields();
}
