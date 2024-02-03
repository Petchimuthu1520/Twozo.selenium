package org.twozo.components.element.impl;

import org.openqa.selenium.WebElement;
import org.twozo.components.element.service.Interactions;

/**
 * Implementation of the {@link Interactions} interface for a web page element.
 */
final class InteractionsImpl implements Interactions {
    private final WebElement element;

    /**
     * Constructs an InteractionsImpl instance with the specified WebElement.
     *
     * @param element The WebElement for which interactions are to be performed.
     */
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
    public void sendKeys(CharSequence... keysToSend) {
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
