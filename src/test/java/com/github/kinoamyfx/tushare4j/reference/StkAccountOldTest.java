package com.github.kinoamyfx.tushare4j.reference;

import com.github.kinoamyfx.tushare4j.CodeUtils;
import org.junit.Test;

public class StkAccountOldTest {
    String content = "<tbody><tr>\n" +
            "<td>date</td>\n" +
            "<td>str</td>\n" +
            "<td>Y</td>\n" +
            "<td>统计周期</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>new_sh</td>\n" +
            "<td>int</td>\n" +
            "<td>Y</td>\n" +
            "<td>本周新增（上海，户）</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>new_sz</td>\n" +
            "<td>int</td>\n" +
            "<td>Y</td>\n" +
            "<td>本周新增（深圳，户）</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>active_sh</td>\n" +
            "<td>float</td>\n" +
            "<td>Y</td>\n" +
            "<td>期末有效账户（上海，万户）</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>active_sz</td>\n" +
            "<td>float</td>\n" +
            "<td>Y</td>\n" +
            "<td>期末有效账户（深圳，万户）</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>total_sh</td>\n" +
            "<td>float</td>\n" +
            "<td>Y</td>\n" +
            "<td>期末账户数（上海，万户）</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>total_sz</td>\n" +
            "<td>float</td>\n" +
            "<td>Y</td>\n" +
            "<td>期末账户数（深圳，万户）</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>trade_sh</td>\n" +
            "<td>float</td>\n" +
            "<td>Y</td>\n" +
            "<td>参与交易账户数（上海，万户）</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>trade_sz</td>\n" +
            "<td>float</td>\n" +
            "<td>Y</td>\n" +
            "<td>参与交易账户数（深圳，万户）</td>\n" +
            "</tr>\n" +
            "</tbody>";

    public void codeg() {
        CodeUtils.codeg4(content);
    }
}