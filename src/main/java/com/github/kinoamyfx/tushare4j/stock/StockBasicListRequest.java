package com.github.kinoamyfx.tushare4j.stock;

import com.github.kinoamyfx.tushare4j.core.TsRequest;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.*;

@Getter
@Accessors(chain = true)
public class StockBasicListRequest implements TsRequest<StockBasic> {

    private String[] fields = new String[]{"ts_code", "symbol", "name", "area", "industry", "fullname", "enname", "market", "exchange", "curr_type", "list_status", "list_date", "delist_date", "is_hs"};

    @Setter
    private String isHs;
    @Setter
    private ListStatus listStatus;
    @Setter
    private String exchange;

    @Override
    public String apiName() {
        return "stock_basic";
    }

    @Override
    public List<String> fields() {
        return Arrays.asList(fields);
    }

    @Override
    public Map<String, String> params() {
        Map<String, String> params = new HashMap<>(3);
        Optional.ofNullable(isHs).ifPresent(s -> params.put("is_hs", isHs));
        Optional.ofNullable(listStatus).ifPresent(s -> params.put("list_status", listStatus.name()));
        Optional.ofNullable(exchange).ifPresent(s -> params.put("exchange", exchange));
        return params;
    }

    public enum ListStatus {
        L,
        D,
        p
    }
}
