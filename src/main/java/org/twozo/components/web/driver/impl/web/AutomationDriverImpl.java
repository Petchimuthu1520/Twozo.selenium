package org.twozo.components.web.driver.impl.web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.twozo.components.web.driver.service.web.WebAutomationDriver;
import org.twozo.components.web.element.impl.WebPageElementServiceImpl;
import org.twozo.components.web.element.service.WebPageElementService;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class AutomationDriverImpl implements WebAutomationDriver {

    private final WebDriver driver;

    public AutomationDriverImpl(final WebDriver driver) {
        this.driver = driver;
    }

    public WebNavigation navigate() {
        return new NavigationImpl(driver.navigate());
    }

    @Override
    public void get(final String url) {
        driver.get(url);
    }

    @Override
    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }

    @Override
    public String getTitle() {
        return driver.getTitle();
    }

    @Override
    public List<WebPageElementServiceImpl> findElements(final By by) {
        final List<WebElement> webElements = driver.findElements(by);
        final List<WebPageElementServiceImpl> list = new ArrayList<>();

        for (WebElement element : webElements) {
            list.add(new WebPageElementServiceImpl(element));
        }

        return list;
    }


    @Override
    public WebPageElementService findElement(final By by) {
        return new WebPageElementServiceImpl(driver.findElement(by));
    }

    @Override
    public String getPageSource() {
        return driver.getPageSource();
    }

    @Override
    public void close() {
        driver.close();
    }

    @Override
    public void quit() {
        driver.quit();
    }

    @Override
    public Set<String> getWindowHandles() {
        return driver.getWindowHandles();
    }

    @Override
    public String getWindowHandle() {
        return driver.getWindowHandle();
    }

    @Override
    public WebTargetLocator switchTo() {
        return new TargetLocatorImpl(driver);
    }

}
