package com.github.kinoamyfx.tushare4j.tmt;

import com.github.kinoamyfx.tushare4j.CodeUtils;
import org.junit.Test;

public class FilmRecordTest {
    String content = "<tbody><tr>\n" +
            "<td>rec_no</td>\n" +
            "<td>str</td>\n" +
            "<td>Y</td>\n" +
            "<td>备案号</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>film_name</td>\n" +
            "<td>str</td>\n" +
            "<td>Y</td>\n" +
            "<td>影片名称</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>rec_org</td>\n" +
            "<td>str</td>\n" +
            "<td>Y</td>\n" +
            "<td>备案单位</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>script_writer</td>\n" +
            "<td>str</td>\n" +
            "<td>Y</td>\n" +
            "<td>编剧</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>rec_result</td>\n" +
            "<td>str</td>\n" +
            "<td>Y</td>\n" +
            "<td>备案结果</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>rec_area</td>\n" +
            "<td>str</td>\n" +
            "<td>Y</td>\n" +
            "<td>备案地（备案时间）</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>classified</td>\n" +
            "<td>str</td>\n" +
            "<td>Y</td>\n" +
            "<td>影片分类</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>date_range</td>\n" +
            "<td>str</td>\n" +
            "<td>Y</td>\n" +
            "<td>备案日期区间</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>ann_date</td>\n" +
            "<td>str</td>\n" +
            "<td>Y</td>\n" +
            "<td>备案结果发布时间</td>\n" +
            "</tr>\n" +
            "</tbody>";

    @Test
    public void codeg() {
        CodeUtils.codeg4(content);
    }
}