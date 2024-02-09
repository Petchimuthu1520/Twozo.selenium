package org.twozo.components.driver;

import org.twozo.components.utilities.PropertyFileReader;
import org.twozo.components.driver.service.WebAutomationDriver;

import java.util.Objects;

/**
 * Singleton implementation of the Driver interface providing a method to get a WebAutomationDriver instance.
 */
public final class DriverImpl implements Driver {

    private final PropertyFileReader propertyFileReader;
    private final DriverFactory driverFactory;

    private static Driver driver;

    private DriverImpl() {
        this.propertyFileReader = PropertyFileReader.getInstance();
        this.driverFactory = DriverFactory.getInstance();
    }

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
        final BrowserType browserType = Objects.requireNonNull(BrowserType.valueOf(
                Objects.requireNonNull(propertyFileReader.properties()).getProperty("Browser").toUpperCase()));

        return driverFactory.build(browserType);
    }

}
