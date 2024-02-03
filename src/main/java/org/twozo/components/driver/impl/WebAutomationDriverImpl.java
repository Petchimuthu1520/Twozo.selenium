package org.twozo.components.driver.impl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.twozo.components.driver.service.WebAutomationDriver;
import org.twozo.components.driver.service.interactions.Handler;
import org.twozo.components.driver.service.interactions.Information;
import org.twozo.components.driver.service.interactions.WebNavigation;
import org.twozo.components.driver.service.interactions.WebTargetLocator;
import org.twozo.components.driver.service.interactions.WebWindow;

import org.twozo.components.element.finders.ElementFinder;
import org.twozo.components.element.finders.ElementFinderForDriver;
import org.twozo.components.element.impl.WebPageElementImpl;
import org.twozo.components.element.service.WebPageElement;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Implementation of the WebAutomationDriver interface using Selenium WebDriver.
 *
 * @version 1.0
 * @author petchimuthu1520
 *
 */
public final class WebAutomationDriverImpl implements WebAutomationDriver {

    private final WebDriver driver;

    /**
     * Constructs a WebAutomationDriverImpl instance with the specified WebDriver.
     *
     * @param driver The WebDriver instance to be used.
     */
    public WebAutomationDriverImpl(final WebDriver driver) {
        this.driver = driver;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WebNavigation navigate() {
        return new WebNavigationImpl(driver.navigate());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Information inform() {
        return new DriverInformationImpl(driver);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ElementFinder find() {
        return new ElementFinderForDriver(driver);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WebTargetLocator switchTo() {
        return new WebTargetLocatorImpl(driver, driver.switchTo());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WebWindow window() {
        return new WebWindowImpl(driver.manage().window());
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
     */
    @Override
    public Handler handler() {
        return new DriverHandlerImpl(driver);
    }

    /**
     * {@inheritDoc}
     *
     * @param by The locating mechanism for finding multiple elements.
     * @return A collection of WebPageElement matching the specified By.
     */
    @Override
    public Collection<WebPageElement> findElements(final By by) {
        final Collection<WebElement> webElements = driver.findElements(by);
        final Collection<WebPageElement> list = new ArrayList<>();

        for (final WebElement element : webElements) {
            list.add(new WebPageElementImpl(element));
        }

        return list;
    }

    /**
     * {@inheritDoc}
     *
     * @param by The locating mechanism for finding the element.
     * @return The first matching WebPageElement.
     */
    @Override
    public WebPageElement findElement(final By by) {
        return new WebPageElementImpl(driver.findElement(by));
    }
}
