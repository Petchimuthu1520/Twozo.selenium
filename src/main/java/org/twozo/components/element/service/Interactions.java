package org.twozo.components.element.service;

public interface Interactions {
    /**
     * Simulates a mouse click on the WebElement.
     */
    void click();

    /**
     * Submits a form if the WebElement represents a form element.
     */
    void submit();

    /**
     * Sends the given keys to the WebElement, usually a form input element.
     *
     * @param keysToSend The character sequences to be sent.
     */
    void sendKeys(final CharSequence... keysToSend);

    /**
     * Clears the content of the WebElement, usually a form input element.
     */
    void clear();
}
