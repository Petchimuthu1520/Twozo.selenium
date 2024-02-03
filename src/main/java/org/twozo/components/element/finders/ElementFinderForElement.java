package org.twozo.components.element.finders;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.twozo.components.element.impl.WebPageElementImpl;
import org.twozo.components.element.service.WebPageElement;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Implementation of the {@link ElementFinder} interface specific to a WebElement instance.
 * It provides methods to find multiple web page elements and a single web page element within the given WebElement.
 */
public final class ElementFinderForElement implements ElementFinder {

    private final WebElement element;

    /**
     * Constructs an ElementFinderForElement with the specified WebElement.
     *
     * @param element The WebElement instance used for finding elements.
     */
    public ElementFinderForElement(WebElement element) {
        this.element = element;
    }

    /**
     * Finds multiple web page elements based on the specified {@code By} locator within the WebElement.
     *
     * @param by The {@code By} locator used to find elements.
     * @return A collection of {@link WebPageElement} representing the found elements within the WebElement.
     */
    public Collection<WebPageElement> findElements(final By by) {
        final Collection<WebElement> webElements = element.findElements(by);
        final Collection<WebPageElement> list = new ArrayList<>();

        for (final WebElement element : webElements) {
            list.add(new WebPageElementImpl(element));
        }

        return list;
    }

    /**
     * Finds a single web page element based on the specified {@code By} locator within the WebElement.
     *
     * @param by The {@code By} locator used to find the element.
     * @return The {@link WebPageElement} representing the found element within the WebElement.
     */
    @Override
    public WebPageElement findElement(final By by) {
        return new WebPageElementImpl(element.findElement(by));
    }
}
