package org.twozo.components.driver;

import org.twozo.components.web.driver.service.web.WebAutomationDriver;

public class Controller {

    private static Controller controller;
    private static final ThreadLocal<WebAutomationDriver> DRIVER = new ThreadLocal<>();

    private Controller() {
    }

    public static Controller getInstance() {
        if (controller == null) {
            controller = new Controller();
        }

        return controller;
    }

    public void setWebAutomationDriver(final WebAutomationDriver webAutomationDriver) {
        DRIVER.set(webAutomationDriver);
    }

    public WebAutomationDriver getWebAutomationDriver() {
        return DRIVER.get();
    }

    public void unload() {
        DRIVER.remove();
    }
}