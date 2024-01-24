package org.twozo.web_driver_test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.twozo.components.Utilities.PropertyFileReader;
import org.twozo.components.driver.Driver;
import org.twozo.components.web.driver.service.web.WebAutomationDriver;

public class DriverControllerForTesting {
    PropertyFileReader propertyFileReader = PropertyFileReader.getInstance();
    private final WebAutomationDriver driver = Driver.getInstance().getWebAutomationDriver();

    protected DriverControllerForTesting() {
    }

    @BeforeTest
    public void launch() {
        driver.get(propertyFileReader.readUrl());
    }


    @AfterTest
    public void quit() {
        driver.quit();

    }
}
