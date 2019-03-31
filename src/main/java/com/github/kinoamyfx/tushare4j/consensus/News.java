package com.github.kinoamyfx.tushare4j.consensus;

import lombok.Data;

@Data
public class News {
    /**
     * 新闻时间
     */
    private String datetime;
    /**
     * 内容
     */
    private String content;
    /**
     * 标题
     */
    private String title;
    /**
     * 分类
     */
    private String channels;
}
