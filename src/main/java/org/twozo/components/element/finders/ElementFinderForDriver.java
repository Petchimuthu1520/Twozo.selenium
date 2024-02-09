package org.twozo.components.element.finders;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.twozo.components.element.impl.WebPageElementImpl;
import org.twozo.components.element.service.WebPageElement;

import java.util.Collection;

/**
 * A concrete implementation of ElementFinder specifically for WebDriver.
 */
public final class ElementFinderForDriver extends AbstractElementFinder {

    private final WebDriver driver;

    public ElementFinderForDriver(final WebDriver driver) {
        this.driver = driver;
    }

    /**
     * Finds multiple web page elements based on the specified By locator using the WebDriver instance.
     *
     * @param by The By locator used to find elements.
     * @return A collection of WebPageElement representing the found elements.
     */
    @Override
    public Collection<WebPageElement> findElements(final By by) {
        return commonFindElements(driver.findElements(by));
    }

    /**
     * Finds a single web page element based on the specified By locator using the WebDriver instance.
     *
     * @param by The By locator used to find the element.
     * @return The WebPageElement representing the found element.
     */
    @Override
    public WebPageElement findElement(final By by) {
        return new WebPageElementImpl(driver.findElement(by));
    }
}
