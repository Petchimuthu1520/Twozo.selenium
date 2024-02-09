package org.twozo.components.driver.impl;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;

import org.twozo.components.driver.service.AlertHandler;
import org.twozo.components.driver.service.WebAutomationDriver;
import org.twozo.components.driver.service.interactions.WebTargetLocator;

/**
 * Implementation of the WebTargetLocator interface using Selenium WebDriver TargetLocator.
 *
 * @author petchimuthu1520
 * @version 1.0
 */
public class WebTargetLocatorImpl implements WebTargetLocator {

    private static WebTargetLocatorImpl webTargetLocator;
    private final WebDriver.TargetLocator targetLocator;
    private final WebDriver driver;


    private WebTargetLocatorImpl(final WebDriver driver, final WebDriver.TargetLocator targetLocator) {
        this.driver = driver;
        this.targetLocator = targetLocator;
    }

    public static WebTargetLocatorImpl getInstance(final WebDriver driver, final WebDriver.TargetLocator targetLocator) {
        if (webTargetLocator == null) {
            webTargetLocator = new WebTargetLocatorImpl(driver, targetLocator);
        }

        return webTargetLocator;
    }

    /**
     * {@inheritDoc}
     *
     * @return A {@link WebAutomationDriver} representing the target window.
     */
    @Override
    public WebAutomationDriver window(final String name) {
        return WebAutomationDriver.getInstance(targetLocator.window(name));
    }

    /**
     * {@inheritDoc}
     *
     * @return A {@link WebAutomationDriver} representing the new window.
     */
    @Override
    public WebAutomationDriver newWindow(final WindowType windowType) {
        return WebAutomationDriver.getInstance(targetLocator.newWindow(windowType));
    }

    /**
     * {@inheritDoc}
     *
     * @return A {@link AlertHandler} representing the browser alert.
     */
    @Override
    public AlertHandler alert() {
        return AlertHandler.getInstance(driver.switchTo().alert());
    }
}
