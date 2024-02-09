package org.twozo.components.driver;

import org.twozo.components.driver.service.WebAutomationDriver;

/**
 * Interface representing a driver, which provides a WebAutomationDriver.
 */
public interface Driver {

    static Driver getInstance() {
        return DriverImpl.getInstance();
    }

    /**
     * Gets an instance of WebAutomationDriver.
     *
     * @return WebAutomationDriver instance.
     */
    WebAutomationDriver getWebAutomationDriver();
}
