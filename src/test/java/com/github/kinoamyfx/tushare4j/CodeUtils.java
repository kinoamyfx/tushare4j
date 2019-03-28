package com.github.kinoamyfx.tushare4j;

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
                    "    private " + (matcher.group(2).equals("str") ? "String" : "Float") + " " + matcher.group(1) + ";");
        }
    }

    public static void codeg4(String content) {

        Matcher matcher = compile4.matcher(content);

        while (matcher.find()) {
            System.out.println("    /**\n" +
                    "     * " + matcher.group(4) + " \n" +
                    "     */\n" +
                    "    private " + (matcher.group(2).equals("str") ? "String" : "Float") + " " + matcher.group(1) + ";");
        }
    }

}
