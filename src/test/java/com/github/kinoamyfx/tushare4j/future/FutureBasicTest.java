package com.github.kinoamyfx.tushare4j.future;

import com.github.kinoamyfx.tushare4j.CodeUtils;
import org.junit.Test;

public class FutureBasicTest {
    String content = "<tbody><tr>\n" +
            "<td>ts_code</td>\n" +
            "<td>str</td>\n" +
            "<td>Y</td>\n" +
            "<td>合约代码</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>symbol</td>\n" +
            "<td>str</td>\n" +
            "<td>Y</td>\n" +
            "<td>交易标识</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>exchange</td>\n" +
            "<td>str</td>\n" +
            "<td>Y</td>\n" +
            "<td>交易市场</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>name</td>\n" +
            "<td>str</td>\n" +
            "<td>Y</td>\n" +
            "<td>中文简称</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>fut_code</td>\n" +
            "<td>str</td>\n" +
            "<td>Y</td>\n" +
            "<td>合约产品代码</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>multiplier</td>\n" +
            "<td>float</td>\n" +
            "<td>Y</td>\n" +
            "<td>合约乘数</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>trade_unit</td>\n" +
            "<td>str</td>\n" +
            "<td>Y</td>\n" +
            "<td>交易计量单位</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>per_unit</td>\n" +
            "<td>float</td>\n" +
            "<td>Y</td>\n" +
            "<td>交易单位(每手)</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>quote_unit</td>\n" +
            "<td>str</td>\n" +
            "<td>Y</td>\n" +
            "<td>报价单位</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>quote_unit_desc</td>\n" +
            "<td>str</td>\n" +
            "<td>Y</td>\n" +
            "<td>最小报价单位说明</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>d_mode_desc</td>\n" +
            "<td>str</td>\n" +
            "<td>Y</td>\n" +
            "<td>交割方式说明</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>list_date</td>\n" +
            "<td>str</td>\n" +
            "<td>Y</td>\n" +
            "<td>上市日期</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>delist_date</td>\n" +
            "<td>str</td>\n" +
            "<td>Y</td>\n" +
            "<td>最后交易日期</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>d_month</td>\n" +
            "<td>str</td>\n" +
            "<td>Y</td>\n" +
            "<td>交割月份</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>last_ddate</td>\n" +
            "<td>str</td>\n" +
            "<td>Y</td>\n" +
            "<td>最后交割日</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>trade_time_desc</td>\n" +
            "<td>str</td>\n" +
            "<td>N</td>\n" +
            "<td>交易时间说明</td>\n" +
            "</tr>\n" +
            "</tbody>";

    @Test
    public void codeg() {
        CodeUtils.codeg4(content);
    }
}