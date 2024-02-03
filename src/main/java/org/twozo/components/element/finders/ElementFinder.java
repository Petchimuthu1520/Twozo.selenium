package org.twozo.components.element.finders;

import org.openqa.selenium.By;
import org.twozo.components.element.service.WebPageElement;

import java.util.Collection;

/**
 * Interface representing an element finder, providing methods to locate multiple elements and a single element
 * based on a given {@link By} locator.
 */
public interface ElementFinder {

        /**
         * Finds multiple web page elements based on the specified {@code By} locator.
         *
         * @param by The {@code By} locator used to find elements.
         * @return A collection of {@link WebPageElement} representing the found elements.
         */
        Collection<WebPageElement> findElements(final By by);

        /**
         * Finds a single web page element based on the specified {@code By} locator.
         *
         * @param by The {@code By} locator used to find the element.
         * @return The {@link WebPageElement} representing the found element.
         */
        WebPageElement findElement(final By by);
}
