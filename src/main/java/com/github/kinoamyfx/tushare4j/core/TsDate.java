package com.github.kinoamyfx.tushare4j.core;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.apache.commons.lang3.Validate;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalUnit;
import java.util.Objects;


@JsonSerialize(using = TsDateSerialize.class)
@JsonDeserialize(using = TsDateDeserialize.class)
public class TsDate {

    public static final DateTimeFormatter TS_DATE_FORMAT = DateTimeFormatter.ofPattern("yyyyMMdd");

    LocalDate date;

    private TsDate(LocalDate date) {
        this.date = date;
    }

    private TsDate(String yyyyMMdd) {
        date = parse(yyyyMMdd).date;
    }

    public static TsDate today() {
        return new TsDate(LocalDate.now());
    }

    public static TsDate of(int year, int month, int day) {
        LocalDate date = LocalDate.of(year, month, day);
        return new TsDate(date);
    }

    public static TsDate parse(String content) {
        Validate.isTrue(content.length() == 8);
        int year = Integer.valueOf(content.substring(0, 4));
        int month = Integer.valueOf(content.substring(4, 6));
        int day = Integer.valueOf(content.substring(6, 8));
        return of(year, month, day);
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
