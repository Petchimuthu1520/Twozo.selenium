package org.twozo.components.element.impl;

import org.openqa.selenium.WebElement;

import org.twozo.components.element.finders.ElementFinder;
import org.twozo.components.element.finders.ElementFinderForElement;
import org.twozo.components.element.service.Information;
import org.twozo.components.element.service.Interactions;
import org.twozo.components.element.service.WebPageElement;

/**
 * Implementation of the {@link WebPageElement} interface for a web page element.
 */
public final class WebPageElementImpl implements WebPageElement {

    private final WebElement element;

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
}
