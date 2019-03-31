package com.github.kinoamyfx.tushare4j.utils;

import lombok.experimental.UtilityClass;

import java.time.LocalDate;

@UtilityClass
public class DateUtils {

    public static String monthLastDay(int year, int month) {
        LocalDate date = LocalDate.now();
        return date.toString();
    }
}
