package com.github.kinoamyfx.tushare4j.finance;

import lombok.Data;

@Data
public class DisclosureDate {
    /**
     * TS代码
     */
    private String ts_code;
    /**
     * 最新披露公告日
     */
    private String ann_date;
    /**
     * 报告期
     */
    private String end_date;
    /**
     * 预计披露日期
     */
    private String pre_date;
    /**
     * 实际披露日期
     */
    private String actual_date;
    /**
     * 披露日期修正记录
     */
    private String modify_date;
}
