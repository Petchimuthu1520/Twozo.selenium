package org.twozo.components.driver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

import org.twozo.components.web.driver.impl.web.AutomationDriverImpl;
import org.twozo.components.web.driver.service.web.WebAutomationDriver;

public class Factory {

    WebAutomationDriver build(final Type browserType) {

        switch (browserType) {
            case CHROME:
                return new AutomationDriverImpl(new ChromeDriver());

            case EDGE:
                return new AutomationDriverImpl(new EdgeDriver());

            case FIREFOX:
                return new AutomationDriverImpl(new FirefoxDriver());

            case SAFARI:
                return new AutomationDriverImpl(new SafariDriver());

            case INTERNET_EXPLORER:
                return new AutomationDriverImpl(new InternetExplorerDriver());

        }

        return null;
    }
}
