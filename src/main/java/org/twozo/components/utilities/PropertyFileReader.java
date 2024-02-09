package org.twozo.components.utilities;

import java.io.File;
import java.io.FileInputStream;

import java.util.Properties;

/**
 * Singleton class for reading properties from a configuration file.
 */
public final class PropertyFileReader {

    private static final String CURRENT_DIRECTORY = System.getProperty("user.dir");
    private static final String PATH = CURRENT_DIRECTORY + "\\src\\main\\resources";
    private static PropertyFileReader propertyFileReader;

    private PropertyFileReader() {
    }

    public static PropertyFileReader getInstance() {
        if (propertyFileReader == null) {
            propertyFileReader = new PropertyFileReader();
        }

        return propertyFileReader;
    }

    /**
     * Read properties from the configuration file.
     *
     * @return Properties object containing the key-value pairs from the configuration file.
     */
    public Properties properties() {
        final Properties properties = new Properties();
        final File file = new File(PATH, "config.properties");
        final String filePath = file.getAbsolutePath();

        try (final FileInputStream fileInputStream = new FileInputStream(filePath)) {
            properties.load(fileInputStream);

            return properties;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
}
