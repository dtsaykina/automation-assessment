package org.example.config;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Config {
    private static Properties properties;

    static {
        try (InputStream input = new FileInputStream("src/main/resources/config.properties")) {
            properties = new Properties();
            properties.load(input);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getBaseUrl() { return properties.getProperty("baseurl"); }
    public static String getDbUrl() {
        return properties.getProperty("db.url");
    }
    public static String getDbUser() {
        return properties.getProperty("db.username");
    }
    public static String getDbPass() {
        return properties.getProperty("db.password");
    }
}

