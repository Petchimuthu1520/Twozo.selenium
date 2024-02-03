package org.twozo.components.driver.impl;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;

import org.twozo.components.driver.service.WebAutomationDriver;
import org.twozo.components.driver.service.interactions.WebAlert;
import org.twozo.components.driver.service.interactions.WebTargetLocator;

/**
 * Implementation of the WebTargetLocator interface using Selenium WebDriver TargetLocator.
 *
 * @version 1.0
 * @author petchimuthu1520
 *
 */
final class WebTargetLocatorImpl implements WebTargetLocator {
    private final WebDriver.TargetLocator targetLocator;
    private final WebDriver driver;

    /**
     * Constructs a WebTargetLocatorImpl instance with the specified WebDriver and TargetLocator.
     *
     * @param driver The WebDriver instance to be used.
     * @param targetLocator The WebDriver TargetLocator instance to be used.
     */
    public WebTargetLocatorImpl(final WebDriver driver, final WebDriver.TargetLocator targetLocator) {
        this.driver = driver;
        this.targetLocator = targetLocator;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WebAutomationDriver window(final String name) {
        return new WebAutomationDriverImpl(targetLocator.window(name));
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WebAutomationDriver newWindow(final WindowType windowType) {
        return new WebAutomationDriverImpl(targetLocator.newWindow(windowType));
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WebAlert alert() {
        return new WebAlertImpl(driver.switchTo().alert());
    }
}
