package org.twozo.components.driver;

import org.twozo.components.Utilities.PropertyFileReader;
import org.twozo.components.web.driver.service.web.WebAutomationDriver;

public class Driver {

    private static final Controller CONTROLLER = Controller.getInstance();
    private static final Factory FACTORY = new Factory();
    private static final PropertyFileReader PROPERTY_FILE_READER = PropertyFileReader.getInstance();
    private final WebAutomationDriver webAutomationDriver;

    private static Driver driver;

    public static void setWebAutomationDriver() {
        CONTROLLER.setWebAutomationDriver(FACTORY.build(PROPERTY_FILE_READER.readBrowser()));
    }

    public static Driver getInstance() {
        if (driver == null) {
            setWebAutomationDriver();

            driver = new Driver(CONTROLLER.getWebAutomationDriver());
        }
        return driver;
    }

    public Driver(final WebAutomationDriver webAutomationDriver) {
        this.webAutomationDriver = webAutomationDriver;
    }

    public WebAutomationDriver getWebAutomationDriver() {
        return webAutomationDriver;
    }
}
