package com.github.kinoamyfx.tushare4j.tmt;

import lombok.Data;

@Data
public class FilmRecord {
    /**
     * 备案号
     */
    private String rec_no;
    /**
     * 影片名称
     */
    private String film_name;
    /**
     * 备案单位
     */
    private String rec_org;
    /**
     * 编剧
     */
    private String script_writer;
    /**
     * 备案结果
     */
    private String rec_result;
    /**
     * 备案地（备案时间）
     */
    private String rec_area;
    /**
     * 影片分类
     */
    private String classified;
    /**
     * 备案日期区间
     */
    private String date_range;
    /**
     * 备案结果发布时间
     */
    private String ann_date;
}
