package org.twozo.components.driver;

import org.twozo.components.driver.service.WebAutomationDriver;

/**
 * Interface representing a driver, which provides a WebAutomationDriver.
 */
public interface Driver {

    /**
     * Gets an instance of WebAutomationDriver.
     *
     * @return WebAutomationDriver instance.
     */
    WebAutomationDriver getWebAutomationDriver();
}
