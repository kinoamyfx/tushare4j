package com.github.kinoamyfx.tushare4j.future;

import com.github.kinoamyfx.tushare4j.CodeUtils;
import org.junit.Test;

public class FutureWsrTest {
    String content = "<tbody><tr>\n" +
            "<td>trade_date</td>\n" +
            "<td>str</td>\n" +
            "<td>Y</td>\n" +
            "<td>交易日期</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>symbol</td>\n" +
            "<td>str</td>\n" +
            "<td>Y</td>\n" +
            "<td>产品代码</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>fut_name</td>\n" +
            "<td>str</td>\n" +
            "<td>Y</td>\n" +
            "<td>产品名称</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>warehouse</td>\n" +
            "<td>str</td>\n" +
            "<td>Y</td>\n" +
            "<td>仓库名称</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>wh_id</td>\n" +
            "<td>str</td>\n" +
            "<td>N</td>\n" +
            "<td>仓库编号</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>pre_vol</td>\n" +
            "<td>int</td>\n" +
            "<td>Y</td>\n" +
            "<td>昨日仓单量</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>vol</td>\n" +
            "<td>int</td>\n" +
            "<td>Y</td>\n" +
            "<td>今日仓单量</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>vol_chg</td>\n" +
            "<td>int</td>\n" +
            "<td>Y</td>\n" +
            "<td>增减量</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>area</td>\n" +
            "<td>str</td>\n" +
            "<td>N</td>\n" +
            "<td>地区</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>year</td>\n" +
            "<td>str</td>\n" +
            "<td>N</td>\n" +
            "<td>年度</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>grade</td>\n" +
            "<td>str</td>\n" +
            "<td>N</td>\n" +
            "<td>等级</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>brand</td>\n" +
            "<td>str</td>\n" +
            "<td>N</td>\n" +
            "<td>品牌</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>place</td>\n" +
            "<td>str</td>\n" +
            "<td>N</td>\n" +
            "<td>产地</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>pd</td>\n" +
            "<td>int</td>\n" +
            "<td>N</td>\n" +
            "<td>升贴水</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>is_ct</td>\n" +
            "<td>str</td>\n" +
            "<td>N</td>\n" +
            "<td>是否折算仓单</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>unit</td>\n" +
            "<td>str</td>\n" +
            "<td>Y</td>\n" +
            "<td>单位</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>exchange</td>\n" +
            "<td>str</td>\n" +
            "<td>N</td>\n" +
            "<td>交易所</td>\n" +
            "</tr>\n" +
            "</tbody>";


    @Test
    public void codeg() {

        CodeUtils.codeg4(content);
    }
}