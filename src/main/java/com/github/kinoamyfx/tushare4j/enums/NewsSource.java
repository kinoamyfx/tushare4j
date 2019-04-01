package com.github.kinoamyfx.tushare4j.enums;

public enum NewsSource {
    SINA("sina"),
    WallStreet("wallstreetcn"),
    TongHuaShun("10jqka"),
    EastMoney("eastmoney"),
    YunCaiJing("yuncaijing");

    private String value;

    NewsSource(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
