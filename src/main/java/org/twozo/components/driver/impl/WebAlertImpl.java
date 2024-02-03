package org.twozo.components.driver.impl;

import org.openqa.selenium.Alert;

import org.twozo.components.driver.service.interactions.WebAlert;

/**
 * Implementation of the WebAlert interface using Selenium Alert.
 *
 * @version 1.0
 * @author petchimuthu1520
 *
 */
final class WebAlertImpl implements WebAlert {

    private final Alert alert;

    /**
     * Constructs a WebAlertImpl instance with the specified Selenium Alert.
     *
     * @param alert The Selenium Alert instance.
     */
    public WebAlertImpl(final Alert alert) {
        this.alert = alert;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void dismiss() {
        alert.dismiss();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void accept() {
        alert.accept();
    }

    /**
     * {@inheritDoc}
     *
     * @return The text of the alert.
     */
    @Override
    public String getText() {
        return alert.getText();
    }

    /**
     * {@inheritDoc}
     *
     * @param keysToSend The text to be sent to the alert.
     */
    @Override
    public void sendKeys(final String keysToSend) {
        alert.sendKeys(keysToSend);
    }
}
