package org.twozo.components.driver.impl;

import org.openqa.selenium.WebDriver;

import org.twozo.components.driver.service.WebAutomationDriver;
import org.twozo.components.driver.service.interactions.WebNavigation;
import org.twozo.components.driver.service.interactions.WebTargetLocator;
import org.twozo.components.element.finders.ElementFinder;
import org.twozo.components.page.PageInformationProvider;
import org.twozo.components.window.WebWindow;
import org.twozo.components.window.WindowInfoProvider;

/**
 * Implementation of the WebAutomationDriver interface using Selenium WebDriver.
 *
 * @author petchimuthu1520
 * @version 1.0
 */
public final class WebAutomationDriverImpl implements WebAutomationDriver {

    private static WebAutomationDriverImpl webAutomationDriver;
    private final WebDriver driver;

    private WebAutomationDriverImpl(final WebDriver driver) {
        this.driver = driver;
    }

    public static WebAutomationDriverImpl getInstance(final WebDriver driver) {
        if (webAutomationDriver == null) {
            webAutomationDriver = new WebAutomationDriverImpl(driver);
        }

        return webAutomationDriver;
    }

    /**
     * {@inheritDoc}
     *
     * @return A WebNavigation instance for browser navigation.
     */
    @Override
    public WebNavigation navigate() {
        return WebNavigation.getInstance(driver.navigate());
    }

    /**
     * {@inheritDoc}
     *
     * @return An PageInformationProvider instance for retrieving browser information.
     */
    @Override
    public PageInformationProvider inform() {
        return PageInformationProvider.getInstance(driver);
    }

    /**
     * {@inheritDoc}
     *
     * @return An ElementFinder instance for locating web elements.
     */
    @Override
    public ElementFinder find() {
        return ElementFinder.getInstance(driver);
    }

    /**
     * {@inheritDoc}
     *
     * @return A WebTargetLocator for navigating to different contexts.
     */
    @Override
    public WebTargetLocator switchTo() {
        return WebTargetLocator.getInstance(driver, driver.switchTo());
    }

    /**
     * {@inheritDoc}
     *
     * @return A WebWindow instance for managing browser windows.
     */
    @Override
    public WebWindow window() {
        return WebWindow.getInstance(driver.manage().window());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void close() {
        driver.close();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void quit() {
        driver.quit();
    }

    /**
     * {@inheritDoc}
     *
     * @return A handler for managing browser window handles.
     */
    @Override
    public WindowInfoProvider handler() {
        return WindowInfoProvider.getInstance(driver);
    }


}
