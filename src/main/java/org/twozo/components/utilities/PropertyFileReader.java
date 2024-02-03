package org.twozo.components.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

/**
 * Singleton class for reading properties from a configuration file.
 */
public final class PropertyFileReader {

    // Get the current working directory
    static String currentDirectory = System.getProperty("user.dir");

    // Define the path to the resources directory
    private static final String path = currentDirectory + "\\src\\main\\resources";

    // Singleton instance of the PropertyFileReader
    private static PropertyFileReader propertyFileReader;

    // Private constructor to restrict instantiation
    private PropertyFileReader() {
    }

    /**
     * Get the instance of PropertyFileReader using the singleton pattern.
     *
     * @return The singleton instance of PropertyFileReader.
     */
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

        // Create a File object representing the config.properties file
        final File file = new File(path, "config.properties");

        // Get the absolute path of the config.properties file
        final String filePath = file.getAbsolutePath();

        try (final FileInputStream fileInputStream = new FileInputStream(filePath)) {
            // Load properties from the file
            properties.load(fileInputStream);
            return properties;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
}
