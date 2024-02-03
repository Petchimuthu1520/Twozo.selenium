package org.twozo.components.element.impl;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.twozo.components.element.service.Information;

/**
 * Implementation of the {@link Information} interface for a web page element.
 */
class InformationImpl implements Information {

    private final WebElement element;

    /**
     * Constructs a WebPageElementInformation instance with the specified WebElement.
     *
     * @param element The WebElement for which information is to be retrieved.
     */
    public InformationImpl(WebElement element) {
        this.element = element;
    }

    /**
     * {@inheritDoc}
     *
     * @return The tag name as a String.
     */
    @Override
    public String getTagName() {
        return element.getTagName();
    }

    /**
     * {@inheritDoc}
     *
     * @return The attribute value as a String.
     */
    @Override
    public String getAttribute(String name) {
        return element.getAttribute(name);
    }

    /**
     * {@inheritDoc}
     *
     * @return true if the element is selected, false otherwise.
     */
    @Override
    public boolean isSelected() {
        return element.isSelected();
    }

    /**
     * {@inheritDoc}
     *
     * @return true if the element is enabled, false otherwise.
     */
    @Override
    public boolean isEnabled() {
        return element.isEnabled();
    }

    /**
     * {@inheritDoc}
     *
     * @return The text as a String.
     */
    @Override
    public String getText() {
        return element.getText();
    }

    /**
     * {@inheritDoc}
     *
     * @return true if the element is displayed, false otherwise.
     */
    @Override
    public boolean isDisplayed() {
        return element.isDisplayed();
    }
}
