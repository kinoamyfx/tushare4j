package com.github.kinoamyfx.tushare4j.core;


import java.lang.annotation.*;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface TsParam {

    String name();

    RequiredType required() default RequiredType.NOT;

    enum RequiredType {
        NOT,
        ALTERNATIVE,
        REQUIRED
    }
}
