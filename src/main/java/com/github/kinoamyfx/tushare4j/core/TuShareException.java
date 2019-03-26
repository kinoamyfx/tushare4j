package com.github.kinoamyfx.tushare4j.core;

public class TuShareException extends Exception {
    public TuShareException(int code, String msg) {
        super(code + ":" + msg);
    }
}
