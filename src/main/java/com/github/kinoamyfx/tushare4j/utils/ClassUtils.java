package com.github.kinoamyfx.tushare4j.utils;

import java.lang.reflect.Field;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ClassUtils {
    public static List<String> resolveFields(Class clz) {
        return Stream.of(clz.getDeclaredFields()).map(Field::getName).collect(Collectors.toList());
    }
}
