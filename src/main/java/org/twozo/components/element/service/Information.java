package org.twozo.components.element.service;

public interface Information {
    /**
     * Gets the tag name of the WebElement.
     *
     * @return The tag name as a String.
     */
    String getTagName();

    /**
     * Gets the value of the specified attribute of the WebElement.
     *
     * @param name The name of the attribute.
     * @return The attribute value as a String.
     */
    String getAttribute(final String name);

    /**
     * Checks if the WebElement is selected.
     *
     * @return true if the element is selected, false otherwise.
     */
    boolean isSelected();

    /**
     * Checks if the WebElement is enabled.
     *
     * @return true if the element is enabled, false otherwise.
     */
    boolean isEnabled();

    /**
     * Gets the visible text of the WebElement.
     *
     * @return The text as a String.
     */
    String getText();

    /**
     * Checks if the WebElement is displayed.
     *
     * @return true if the element is displayed, false otherwise.
     */
    boolean isDisplayed();
}
