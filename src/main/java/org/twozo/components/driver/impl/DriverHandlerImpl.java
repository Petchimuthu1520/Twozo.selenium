package org.twozo.components.driver.impl;

import org.openqa.selenium.WebDriver;

import org.twozo.components.driver.service.interactions.Handler;

import java.util.Set;

/**
 * Implementation of the Handler interface providing methods to handle browser window interactions.
 *
 * @version 1.0
 * @author petchimuthu1520
 */
class DriverHandlerImpl implements Handler {

    private final WebDriver driver;

    /**
     * Constructs a {@link DriverHandlerImpl} with the specified WebDriver.
     *
     * @param driver The WebDriver instance to be used for window handling.
     */
    public DriverHandlerImpl(final WebDriver driver){
        this.driver = driver;
    }

    /**
     * {@inheritDoc}
     *
     * @return A set of window handles for multiple browser windows.
     */
    @Override
    public Set<String> getMultipleWindowHandle() {
        return driver.getWindowHandles();
    }

    /**
     * {@inheritDoc}
     *
     * @return The handle of the current browser window.
     */
    @Override
    public String getWindowHandle() {
        return driver.getWindowHandle();
    }
}
