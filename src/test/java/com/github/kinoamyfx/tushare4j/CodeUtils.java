package com.github.kinoamyfx.tushare4j;

import com.github.kinoamyfx.tushare4j.utils.JsonUtils;
import org.junit.Assert;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CodeUtils {
    private static Pattern compile3 = Pattern.compile("<tr>\\n<td>(.+?)</td>\\n<td>(.+?)</td>\\n<td>(.+?)</td>\\n</tr>");
    private static Pattern compile4 = Pattern.compile("<tr>\\n<td>(.+?)</td>\\n<td>(.+?)</td>\\n<td>(.+?)</td>\\n<td>(.+?)</td>\\n</tr>");

    public static void codeg3(String content) {

        Matcher matcher = compile3.matcher(content);

        while (matcher.find()) {
            System.out.println("    /**\n" +
                    "     * " + matcher.group(3) + " \n" +
                    "     */\n" +
                    "    private " + toType(matcher.group(2)) + " " + matcher.group(1) + ";");
        }
    }

    public static void codeg4(String content) {

        Matcher matcher = compile4.matcher(content);

        while (matcher.find()) {
            System.out.println("    /**\n" +
                    "     * " + matcher.group(4) + " \n" +
                    "     */\n" +
                    "    private " + toType(matcher.group(2)) + " " + matcher.group(1) + ";");
        }
    }


    private static String toType(String s) {
        switch (s) {
            case "int":
                return "Integer";
            case "float":
                return "Float";
            case "str":
                return "String";
            default:
                throw new UnsupportedOperationException();
        }
    }


    public static void assertDataMethod(Object o) {
        Object copy = JsonUtils.deepCopy(o);
        Assert.assertEquals(o, copy);
        Assert.assertEquals(o.hashCode(), copy.hashCode());
        Assert.assertNotNull(o.toString());
    }

    public static void assertFields(List results, List<String> excludes) {

        Assert.assertFalse(results.isEmpty());

        results.parallelStream().limit(100).forEach(result -> {
            try {
                Field[] fields = result.getClass().getDeclaredFields();

                for (Field field : fields) {
                    if (field.isSynthetic()) {
                        continue;
                    }

                    Method set = result.getClass().getDeclaredMethod(field.getName(), field.getType());
                    Method get = result.getClass().getDeclaredMethod(field.getName());

                    Object v = get.invoke(result);

                    if (v == null && excludes.contains(field.getName())) {
                        Assert.assertNotNull(set.invoke(result, v));
                        continue;
                    }

                    Assert.assertNotNull(v);
                    Assert.assertNotNull(set.invoke(result, v));
                    assertDataMethod(result);
                }
            } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
                throw new RuntimeException(e);
            }
        });
    }

    public static void assertFields(List results, String... excludes) {
        if (excludes.length == 0) {
            assertFields(results, Collections.emptyList());
        } else {
            assertFields(results, Arrays.asList(excludes));
        }
    }
}
