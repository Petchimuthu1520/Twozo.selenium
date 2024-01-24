package org.twozo.components.web.driver.service.web;

public interface WebAlert {
    void dismiss();

    void accept();

    String getText();

    void sendKeys(final String keysToSend);
}
