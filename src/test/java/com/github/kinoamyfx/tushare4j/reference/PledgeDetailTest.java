package com.github.kinoamyfx.tushare4j.reference;

import com.github.kinoamyfx.tushare4j.CodeUtils;
import org.junit.Test;

public class PledgeDetailTest {

    String content = "<tbody><tr>\n" +
            "<td>ts_code</td>\n" +
            "<td>str</td>\n" +
            "<td>Y</td>\n" +
            "<td>TS股票代码</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>ann_date</td>\n" +
            "<td>str</td>\n" +
            "<td>Y</td>\n" +
            "<td>公告日期</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>holder_name</td>\n" +
            "<td>str</td>\n" +
            "<td>Y</td>\n" +
            "<td>股东名称</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>pledge_amount</td>\n" +
            "<td>float</td>\n" +
            "<td>Y</td>\n" +
            "<td>质押数量</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>start_date</td>\n" +
            "<td>str</td>\n" +
            "<td>Y</td>\n" +
            "<td>质押开始日期</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>end_date</td>\n" +
            "<td>str</td>\n" +
            "<td>Y</td>\n" +
            "<td>质押结束日期</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>is_release</td>\n" +
            "<td>str</td>\n" +
            "<td>Y</td>\n" +
            "<td>是否已解押</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>release_date</td>\n" +
            "<td>str</td>\n" +
            "<td>Y</td>\n" +
            "<td>解押日期</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>pledgor</td>\n" +
            "<td>str</td>\n" +
            "<td>Y</td>\n" +
            "<td>质押方</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>holding_amount</td>\n" +
            "<td>float</td>\n" +
            "<td>Y</td>\n" +
            "<td>持股总数</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>pledged_amount</td>\n" +
            "<td>float</td>\n" +
            "<td>Y</td>\n" +
            "<td>质押总数</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>p_total_ratio</td>\n" +
            "<td>float</td>\n" +
            "<td>Y</td>\n" +
            "<td>本次质押占总股本比例</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>h_total_ratio</td>\n" +
            "<td>float</td>\n" +
            "<td>Y</td>\n" +
            "<td>持股总数占总股本比例</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>is_buyback</td>\n" +
            "<td>str</td>\n" +
            "<td>Y</td>\n" +
            "<td>是否回购</td>\n" +
            "</tr>\n" +
            "</tbody>";

    public void codeg() {
        CodeUtils.codeg4(content);
    }
}