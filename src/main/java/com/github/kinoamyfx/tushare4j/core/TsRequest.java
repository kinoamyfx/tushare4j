package com.github.kinoamyfx.tushare4j.core;

import java.util.List;
import java.util.Map;

public interface TsRequest<R> {

    String apiName();

    List<String> fields();

    Map<String, String> params();
}
