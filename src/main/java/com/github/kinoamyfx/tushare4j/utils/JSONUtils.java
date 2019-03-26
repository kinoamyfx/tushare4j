package com.github.kinoamyfx.tushare4j.utils;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.experimental.UtilityClass;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@UtilityClass
public class JSONUtils {
    private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();

    static {
        OBJECT_MAPPER.setSerializationInclusion(Include.ALWAYS);
    }

    public static String toJson(Object o) {
        try {
            return OBJECT_MAPPER.writeValueAsString(o);
        } catch (JsonProcessingException e) {
            //序列化时产生此异常很诡异
            //有更好的处理办法的话，请重构
            throw new RuntimeException(e);
        }
    }

    /**
     * 将json转化为对象，注意对象不可为Collections
     *
     * @param json
     * @param clz
     * @param <T>
     * @return
     */
    public static <T> T parseObject(String json, Class<T> clz) {
        try {
            return OBJECT_MAPPER.readValue(json, clz);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * TypeFactory解决Json反序列时的泛型问题.
     *
     * @param json
     * @param clz
     * @param <T>
     * @return
     * @see com.fasterxml.jackson.databind.type.TypeFactory#constructCollectionType(Class, JavaType)
     */
    public static <T> List<T> parseList(String json, Class<T> clz) {
        try {
            JavaType type = OBJECT_MAPPER.getTypeFactory().constructCollectionType(ArrayList.class, clz);
            return OBJECT_MAPPER.readValue(json, type);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @SuppressWarnings("unchecked")
    public static <T> T deepCopy(T t) {
        try {
            byte[] bytes = OBJECT_MAPPER.writeValueAsBytes(t);
            return (T) OBJECT_MAPPER.readValue(bytes, t.getClass());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
