package com.github.kinoamyfx.tushare4j.reference;

import lombok.Data;

@Data
public class ShareFloat {
    /**
     * TS代码
     */
    private String ts_code;
    /**
     * 公告日期
     */
    private String ann_date;
    /**
     * 解禁日期
     */
    private String float_date;
    /**
     * 流通股份
     */
    private Float float_share;
    /**
     * 流通股份占总股本比率
     */
    private Float float_ratio;
    /**
     * 股东名称
     */
    private String holder_name;
    /**
     * 股份类型
     */
    private String share_type;
}
