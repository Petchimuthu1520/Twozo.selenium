package org.twozo.web_driver_test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import org.twozo.components.driver.DriverImpl;
import org.twozo.components.utilities.PropertyFileReader;
import org.twozo.components.driver.service.WebAutomationDriver;

import java.util.Objects;

public class DriverControllerForTesting {
    private final PropertyFileReader propertyFileReader = PropertyFileReader.getInstance();
    protected final WebAutomationDriver driver = DriverImpl.getInstance().getWebAutomationDriver();

    protected DriverControllerForTesting() {
    }

    @BeforeTest
    public void launch() {
        driver.inform().get(Objects.requireNonNull(propertyFileReader.properties()).getProperty("Url"));
    }

    @AfterTest
    public void quit() {
        driver.quit();

    }
}
