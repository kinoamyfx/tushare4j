package com.github.kinoamyfx.tushare4j.reference;

import com.github.kinoamyfx.tushare4j.utils.CodeUtils;
import org.junit.Test;

public class StkAccountTest {
    String content = "<tbody><tr>\n" +
            "<td>date</td>\n" +
            "<td>str</td>\n" +
            "<td>Y</td>\n" +
            "<td>统计周期</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>weekly_new</td>\n" +
            "<td>float</td>\n" +
            "<td>Y</td>\n" +
            "<td>本周新增（万）</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>total</td>\n" +
            "<td>float</td>\n" +
            "<td>Y</td>\n" +
            "<td>期末总账户数（万）</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>weekly_hold</td>\n" +
            "<td>float</td>\n" +
            "<td>Y</td>\n" +
            "<td>本周持仓账户数（万）</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>weekly_trade</td>\n" +
            "<td>float</td>\n" +
            "<td>Y</td>\n" +
            "<td>本周参与交易账户数（万）</td>\n" +
            "</tr>\n" +
            "</tbody>";

    @Test
    public void codeg() {
        CodeUtils.codeg4(content);
    }
}