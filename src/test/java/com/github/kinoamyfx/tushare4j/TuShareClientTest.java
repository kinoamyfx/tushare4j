package com.github.kinoamyfx.tushare4j;

import java.io.IOException;
import java.util.Properties;

public class TuShareClientTest {
    public static TuShareClient client;

    static {
        try {
            Properties properties = new Properties();
            properties.load(Thread.class.getResourceAsStream("/token.properties"));
            String token = properties.getProperty("token").trim();
            client = new TuShareClient(token);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}