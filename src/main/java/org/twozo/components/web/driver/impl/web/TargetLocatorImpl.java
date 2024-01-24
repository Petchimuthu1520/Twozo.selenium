package org.twozo.components.web.driver.impl.web;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.twozo.components.web.driver.service.web.WebAlert;
import org.twozo.components.web.driver.service.web.WebAutomationDriver;

public class TargetLocatorImpl implements WebAutomationDriver.WebTargetLocator {
    private final WebDriver driver;
    private WebDriver.TargetLocator targetLocator;

    public TargetLocatorImpl(final WebDriver driver) {
        this.driver = driver;
    }

    @Override
    public WebAutomationDriver window(final String nameOrHandle) {
        return new AutomationDriverImpl(targetLocator.window(nameOrHandle));
    }

    @Override
    public WebAutomationDriver newWindow(final WindowType typeHint) {
        return new AutomationDriverImpl(targetLocator.newWindow(typeHint));
    }

    @Override
    public WebAlert alert() {
        return new WebAlertImpl(driver.switchTo().alert());
    }
}
