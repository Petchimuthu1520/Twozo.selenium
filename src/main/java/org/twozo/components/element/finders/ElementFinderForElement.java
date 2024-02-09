package org.twozo.components.element.finders;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.twozo.components.element.impl.WebPageElementImpl;
import org.twozo.components.element.service.WebPageElement;

import java.util.Collection;

/**
 * A concrete implementation of ElementFinder specifically for a WebElement.
 */
public final class ElementFinderForElement extends AbstractElementFinder {

    private final WebElement element;

    public ElementFinderForElement(final WebElement element) {
        this.element = element;
    }

    /**
     * Finds multiple web page elements based on the specified By locator within the WebElement.
     *
     * @param by The By locator used to find elements within the WebElement.
     * @return A collection of WebPageElement representing the found elements.
     */
    @Override
    public Collection<WebPageElement> findElements(final By by) {
        return commonFindElements(element.findElements(by));
    }

    /**
     * Finds a single web page element based on the specified By locator within the WebElement.
     *
     * @param by The By locator used to find the element within the WebElement.
     * @return The WebPageElement representing the found element.
     */
    @Override
    public WebPageElement findElement(final By by) {
        return new WebPageElementImpl(element.findElement(by));
    }
}
