package org.twozo.components.driver.impl;

import org.openqa.selenium.WebDriver;

import org.twozo.components.driver.service.interactions.Information;

/**
 * Implementation of the Information interface using Selenium WebDriver.
 *
 * @version 1.0
 * @author petchimuthu1520
 *
 */
final class DriverInformationImpl implements Information {

    private final WebDriver driver;

    /**
     * Constructs a DriverInformationImpl instance with the specified WebDriver.
     *
     * @param driver The WebDriver instance to be used.
     */
    public DriverInformationImpl(final WebDriver driver) {
        this.driver = driver;
    }

    /**
     * {@inheritDoc}
     *
     * @param url The URL to navigate to.
     */
    @Override
    public void get(final String url) {
        driver.get(url);
    }

    /**
     * {@inheritDoc}
     *
     * @return The current URL of the browser.
     */
    @Override
    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }

    /**
     * {@inheritDoc}
     *
     * @return The title of the current page.
     */
    @Override
    public String getTitle() {
        return driver.getTitle();
    }

    /**
     * {@inheritDoc}
     *
     * @return The source code of the current page.
     */
    @Override
    public String getPageSource() {
        return driver.getPageSource();
    }
}
