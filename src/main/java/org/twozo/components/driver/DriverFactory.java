package org.twozo.components.driver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

import org.twozo.components.driver.impl.WebAutomationDriverImpl;
import org.twozo.components.driver.service.WebAutomationDriver;

/**
 * Factory class for creating instances of WebAutomationDriver based on BrowserType.
 */
final class DriverFactory {

    private static DriverFactory driverFactory;

    /**
     * Gets the singleton instance of DriverFactory.
     *
     * @return The singleton instance of DriverFactory.
     */
    public static DriverFactory getInstance() {
        if (driverFactory == null)
            driverFactory = new DriverFactory();

        return driverFactory;
    }

    /**
     * Builds and returns an instance of WebAutomationDriver based on the provided BrowserType.
     *
     * @param browserType The type of browser for which the driver is to be created.
     * @return An instance of WebAutomationDriver.
     */
    public WebAutomationDriver build(final BrowserType browserType) {

        return switch (browserType) {
            case CHROME -> new WebAutomationDriverImpl(new ChromeDriver());
            case EDGE -> new WebAutomationDriverImpl(new EdgeDriver());
            case FIREFOX -> new WebAutomationDriverImpl(new FirefoxDriver());
            case SAFARI -> new WebAutomationDriverImpl(new SafariDriver());
            case INTERNET_EXPLORER -> new WebAutomationDriverImpl(new InternetExplorerDriver());
        };
    }
}
