package org.twozo.components.element.impl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.twozo.components.element.finders.ElementFinder;
import org.twozo.components.element.finders.ElementFinderForElement;
import org.twozo.components.element.service.Information;
import org.twozo.components.element.service.Interactions;
import org.twozo.components.element.service.WebPageElement;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Implementation of the {@link WebPageElement} interface for a web page element.
 */
public final class WebPageElementImpl implements WebPageElement {

    private final WebElement element;

    /**
     * Constructs a WebPageElementImpl instance with the specified WebElement.
     *
     * @param element The WebElement representing the web page element.
     */
    public WebPageElementImpl(final WebElement element) {
        this.element = element;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ElementFinder find() {
        return new ElementFinderForElement(element);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Interactions interact() {
        return new InteractionsImpl(element);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Information inform() {
        return new InformationImpl(element);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Collection<WebPageElement> findElements(final By by) {
        final Collection<WebElement> webElements = element.findElements(by);
        final Collection<WebPageElement> list = new ArrayList<>();

        for (final WebElement element : webElements) {
            list.add(new WebPageElementImpl(element));
        }

        return list;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WebPageElement findElement(final By by) {
        return new WebPageElementImpl(element.findElement(by));
    }
}
