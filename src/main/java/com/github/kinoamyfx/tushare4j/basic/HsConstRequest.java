package com.github.kinoamyfx.tushare4j.basic;

import com.github.kinoamyfx.tushare4j.core.TsParam;
import com.github.kinoamyfx.tushare4j.core.TsRequest;
import com.github.kinoamyfx.tushare4j.utils.ClassUtils;
import lombok.Data;

import java.util.List;

@Data
public class HsConstRequest implements TsRequest<HsConst> {

    @TsParam(name = "hs_type", required = true)
    private String hsType;

    @TsParam(name = "is_new")
    private String isNew;

    public HsConstRequest(String hsType) {
        this.hsType = hsType;
    }

    @Override
    public String apiName() {
        return "hs_const";
    }

    @Override
    public List<String> fields() {
        return ClassUtils.resolveFields(HsConst.class);
    }
}
