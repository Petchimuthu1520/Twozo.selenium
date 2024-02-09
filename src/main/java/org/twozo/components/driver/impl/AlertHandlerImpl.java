package org.twozo.components.driver.impl;

import org.openqa.selenium.Alert;

import org.twozo.components.driver.service.AlertHandler;

/**
 * Implementation of the WebAlert interface using Selenium Alert.
 *
 * @author petchimuthu1520
 * @version 1.0
 */
public final class AlertHandlerImpl implements AlertHandler {

    private static AlertHandlerImpl alertHandler;
    private final Alert alert;

    private AlertHandlerImpl(final Alert alert) {
        this.alert = alert;
    }

    public static AlertHandlerImpl getInstance(final Alert alert) {
        if (alertHandler == null) {
            alertHandler = new AlertHandlerImpl(alert);
        }

        return alertHandler;
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
