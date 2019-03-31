package com.github.kinoamyfx.tushare4j.core;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalUnit;
import java.util.Objects;


public class TsDate {
    private static final DateTimeFormatter TS_DATE_FORMAT = DateTimeFormatter.ofPattern("yyyyMMdd");

    @JsonFormat(pattern = "yyyyMMdd")
    private LocalDate date;


    @JsonCreator
    private TsDate(@JsonProperty("date") LocalDate date) {
        this.date = date;
    }


    public static TsDate today() {
        return new TsDate(LocalDate.now());
    }

    public static TsDate of(int year, int month, int day) {
        LocalDate date = LocalDate.of(year, month, day);
        return new TsDate(date);
    }


    public TsDate minus(long amountToSubtract, TemporalUnit unit) {
        return new TsDate(date.minus(amountToSubtract, unit));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TsDate tsDate = (TsDate) o;
        return Objects.equals(date, tsDate.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(date);
    }

    @Override
    public String toString() {
        return date.format(TS_DATE_FORMAT);
    }
}
