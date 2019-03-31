package com.github.kinoamyfx.tushare4j.utils;

import lombok.experimental.UtilityClass;

import java.util.Objects;
import java.util.stream.Stream;

@UtilityClass
public class ValidateUtils {

    /**
     * 当对象数组里边的值都为null的时候抛出错误
     *
     * @param objects
     */
    public void eitherNotNull(Object... objects) {
        if (Stream.of(objects).noneMatch(Objects::nonNull)) {
            throw new IllegalArgumentException("need at least one param");
        }
    }
}
