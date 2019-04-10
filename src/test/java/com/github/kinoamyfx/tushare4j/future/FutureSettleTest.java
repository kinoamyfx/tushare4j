package com.github.kinoamyfx.tushare4j.future;

import com.github.kinoamyfx.tushare4j.CodeUtils;
import org.junit.Test;

public class FutureSettleTest {
    String content = "<tbody><tr>\n" +
            "<td>ts_code</td>\n" +
            "<td>str</td>\n" +
            "<td>Y</td>\n" +
            "<td>合约代码</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>trade_date</td>\n" +
            "<td>str</td>\n" +
            "<td>Y</td>\n" +
            "<td>交易日期</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>settle</td>\n" +
            "<td>float</td>\n" +
            "<td>Y</td>\n" +
            "<td>结算价</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>trading_fee_rate</td>\n" +
            "<td>float</td>\n" +
            "<td>Y</td>\n" +
            "<td>交易手续费率</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>trading_fee</td>\n" +
            "<td>float</td>\n" +
            "<td>Y</td>\n" +
            "<td>交易手续费</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>delivery_fee</td>\n" +
            "<td>float</td>\n" +
            "<td>Y</td>\n" +
            "<td>交割手续费</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>b_hedging_margin_rate</td>\n" +
            "<td>float</td>\n" +
            "<td>Y</td>\n" +
            "<td>买套保交易保证金率</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>s_hedging_margin_rate</td>\n" +
            "<td>float</td>\n" +
            "<td>Y</td>\n" +
            "<td>卖套保交易保证金率</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>long_margin_rate</td>\n" +
            "<td>float</td>\n" +
            "<td>Y</td>\n" +
            "<td>买投机交易保证金率</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>short_margin_rate</td>\n" +
            "<td>float</td>\n" +
            "<td>Y</td>\n" +
            "<td>卖投机交易保证金率</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>offset_today_fee</td>\n" +
            "<td>float</td>\n" +
            "<td>N</td>\n" +
            "<td>平今仓手续率</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>exchange</td>\n" +
            "<td>str</td>\n" +
            "<td>N</td>\n" +
            "<td>交易所</td>\n" +
            "</tr>\n" +
            "</tbody>";

    public void codeg() {
        CodeUtils.codeg4(content);
    }
}