package org.twozo.components.driver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;

import org.twozo.components.driver.service.WebAutomationDriver;

/**
 * Factory class for creating instances of WebAutomationDriver based on BrowserType.
 */
final class DriverFactory {

    private static DriverFactory driverFactory;

    private DriverFactory() {
    }

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
        return WebAutomationDriver.getInstance(getDriver(browserType));
    }

    /**
     * Creates and returns a RemoteWebDriver instance based on the provided BrowserType.
     *
     * @param browserType The type of browser for which the driver is to be created.
     * @return A RemoteWebDriver instance for the specified browser type.
     */
    private RemoteWebDriver getDriver(final BrowserType browserType) {
        return switch (browserType) {
            case CHROME -> new ChromeDriver();
            case EDGE -> new EdgeDriver();
            case FIREFOX -> new FirefoxDriver();
            case SAFARI -> new SafariDriver();
            case INTERNET_EXPLORER -> new InternetExplorerDriver();
        };
    }

}
