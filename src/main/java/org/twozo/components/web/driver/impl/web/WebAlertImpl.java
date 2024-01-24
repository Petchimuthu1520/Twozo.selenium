package org.twozo.components.web.driver.impl.web;

import org.openqa.selenium.Alert;

import org.twozo.components.web.driver.service.web.WebAlert;

public class WebAlertImpl implements WebAlert {
    private final Alert alert;

    public WebAlertImpl(final Alert alert) {
        this.alert = alert;
    }

    @Override
    public void dismiss() {
        alert.dismiss();
    }

    @Override
    public void accept() {
        alert.accept();
    }

    @Override
    public String getText() {
        return alert.getText();
    }

    @Override
    public void sendKeys(final String keysToSend) {
        alert.sendKeys(keysToSend);
    }
}
