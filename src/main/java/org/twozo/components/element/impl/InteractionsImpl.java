package org.twozo.components.element.impl;

import org.openqa.selenium.WebElement;

import org.twozo.components.element.service.Interactions;

/**
 * Implementation of the {@link Interactions} interface for a web page element.
 */
final class InteractionsImpl implements Interactions {
    private final WebElement element;

    public InteractionsImpl(final WebElement element) {
        this.element = element;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void click() {
        element.click();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void submit() {
        element.submit();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void sendKeys(final CharSequence... keysToSend) {
        element.sendKeys(keysToSend);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void clear() {
        element.clear();
    }
}
