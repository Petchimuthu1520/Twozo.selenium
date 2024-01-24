package org.twozo.components.Utilities;

import org.twozo.components.driver.Type;

import java.io.FileInputStream;
import java.io.IOException;

import java.util.Objects;
import java.util.Properties;

public class PropertyFileReader {

    private final Properties properties = new Properties();
    private static PropertyFileReader propertyFileReader;

    private PropertyFileReader() {
    }


    public static PropertyFileReader getInstance() {
        if (propertyFileReader == null) {
            propertyFileReader = new PropertyFileReader();
        }

        return propertyFileReader;
    }

    private Properties properties() {
        String filePath = "C:\\Users\\V Karthick\\IdeaProjects\\TestNG\\src\\main\\java\\org\\twozo\\components\\property\\file\\config.properties";

        try (final FileInputStream fileInputStream = new FileInputStream(filePath)) {
            properties.load(fileInputStream);

            return properties;
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    public Type readBrowser() {
        final Properties properties1 = properties();

        return Objects.isNull(properties1) ? null : Type.valueOf(properties1.getProperty("Browser").toUpperCase());
    }

    public String readUrl() {
        final Properties properties1 = properties();

        return Objects.isNull(properties1) ? null : properties1.getProperty("Url");
    }

}


