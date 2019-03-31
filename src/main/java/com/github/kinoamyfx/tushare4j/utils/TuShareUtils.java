package com.github.kinoamyfx.tushare4j.utils;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.kinoamyfx.tushare4j.core.TsParam;
import com.github.kinoamyfx.tushare4j.core.TsRequest;
import com.github.kinoamyfx.tushare4j.market.KLine;
import com.github.kinoamyfx.tushare4j.market.StockDailyRequest;
import lombok.experimental.UtilityClass;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.reflect.TypeUtils;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static com.github.kinoamyfx.tushare4j.core.TsParam.RequiredType.ALTERNATIVE;
import static com.github.kinoamyfx.tushare4j.core.TsParam.RequiredType.REQUIRED;

@Slf4j
@UtilityClass
public class TuShareUtils {
    private static ConcurrentHashMap<Class, Class> respCache = new ConcurrentHashMap<>();

    /**
     * @param <R> example: {@link StockDailyRequest} is {@link KLine}
     * @return 返回request对应的response类型
     */
    @SuppressWarnings("unchecked")
    public static <R> Class<R> getResponseType(TsRequest<R> tsRequest) {

        return
                respCache.computeIfAbsent(tsRequest.getClass(), aClass -> {
                    Map<TypeVariable<?>, Type> typeArguments = TypeUtils.getTypeArguments(aClass, TsRequest.class);

                    for (Map.Entry<TypeVariable<?>, Type> entry : typeArguments.entrySet()) {
                        if (entry.getKey().getName().equals("R")) {
                            if (entry.getValue() instanceof ParameterizedType) {
                                return (Class) ((ParameterizedType) entry.getValue()).getRawType();
                            }

                            if (entry.getValue() instanceof Class) {
                                return (Class) entry.getValue();
                            }
                        }
                    }
                    throw new IllegalStateException();
                });
    }


    /**
     * @return
     */
    public static Map<String, String> resolveTsParams(Object o) {

        Map<String, String> params = new HashMap<>();

        Map<String, Object> required = new HashMap<>();

        for (Field f : o.getClass().getDeclaredFields()) {

            if (f.isSynthetic()) {
                continue;
            }

            Optional.ofNullable(f.getAnnotation(TsParam.class)).ifPresent(tsParam -> {
                f.setAccessible(true);
                try {
                    Object value = f.get(o);

                    if (tsParam.required() == REQUIRED && value == null) {
                        throw new IllegalStateException(tsParam.name() + " required");
                    }

                    if (tsParam.required() == ALTERNATIVE) {
                        required.put(tsParam.name(), value);
                    }

                    if (value == null) {
                        return;
                    }

                    params.put(tsParam.name(), value.toString());
                } catch (IllegalAccessException | IllegalStateException e) {
                    throw new IllegalArgumentException(e);
                }
            });
        }

        if (!required.isEmpty() && required.values().stream().noneMatch(Objects::nonNull)) {
            throw new IllegalArgumentException("need at least one param");
        }


        return params;
    }

    public static List<String> resolveTsFields(Class clz) {

        return
                Stream.of(clz.getDeclaredFields())
                        .map(field -> {
                            if (field.isSynthetic()) {
                                return null;
                            }
                            JsonProperty annotation = field.getAnnotation(JsonProperty.class);
                            if (annotation != null) {
                                return annotation.value();
                            }
                            return field.getName();
                        })
                        .filter(Objects::nonNull)
                        .collect(Collectors.toList());
    }
}
