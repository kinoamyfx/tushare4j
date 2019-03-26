package com.github.kinoamyfx.tushare4j.utils;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPool {
    private static ThreadPoolExecutor IO_POOL = new ThreadPoolExecutor(3, Runtime.getRuntime().availableProcessors() * 6, 30, TimeUnit.SECONDS, new ArrayBlockingQueue<>(32), new ThreadPoolExecutor.CallerRunsPolicy());

    public static ThreadPoolExecutor io() {
        return IO_POOL;
    }
}
