package org.twozo.components.driver;

import org.twozo.components.utilities.PropertyFileReader;
import org.twozo.components.driver.service.WebAutomationDriver;

import java.util.Objects;

/**
 * Singleton implementation of the Driver interface providing a method to get a WebAutomationDriver instance.
 */
public final class DriverImpl implements Driver {

    // Singleton instances for PropertyFileReader and DriverFactory
    private static final PropertyFileReader PROPERTY_FILE_READER = PropertyFileReader.getInstance();
    private static final DriverFactory DRIVER_FACTORY = DriverFactory.getInstance();

    // Singleton instance of Driver
    private static Driver driver;

    // Private constructor to prevent external instantiation
    private DriverImpl() {
    }

    /**
     * Gets the singleton instance of Driver.
     *
     * @return The singleton instance of Driver.
     */
     public static Driver getInstance() {

        if (driver == null) {
            driver = new DriverImpl();
        }

        return driver;
    }

    /**
     * {@inheritDoc}
     *
     * @return A WebAutomationDriver instance.
     */
    @Override
    public WebAutomationDriver getWebAutomationDriver() {
        // Read the browser type from the configuration property file
        final BrowserType browserType = Objects.requireNonNull(BrowserType.valueOf(
                Objects.requireNonNull(PROPERTY_FILE_READER.properties()).getProperty("Browser").toUpperCase()));

        // Build and return a WebAutomationDriver instance based on the specified browser type
        return DRIVER_FACTORY.build(browserType);
    }
}
