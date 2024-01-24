package org.twozo.components.web.driver.service.web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;

import org.twozo.components.web.driver.impl.web.AutomationDriverImpl;
import org.twozo.components.web.element.impl.WebPageElementServiceImpl;
import org.twozo.components.web.element.service.WebPageElementService;

import java.net.URL;
import java.util.List;
import java.util.Set;

public interface WebAutomationDriver {

    static WebAutomationDriver getInstance(final WebDriver driver) {
        return new AutomationDriverImpl(driver);
    }

    void get(final String url);

    String getCurrentUrl();

    String getTitle();

    List<WebPageElementServiceImpl> findElements(final By by);

    WebPageElementService findElement(final By by);

    String getPageSource();

    void close();

    void quit();

    Set<String> getWindowHandles();

    String getWindowHandle();

    WebTargetLocator switchTo();

    WebNavigation navigate();

    public interface Window {


        void maximize();

        void minimize();

        void fullscreen();
    }

    public interface WebNavigation {
        void back();

        void forward();

        void to(final String url);

        void to(final URL url);

        void refresh();
    }

    public interface WebTargetLocator {

        WebAutomationDriver window(final String nameOrHandle);

        WebAutomationDriver newWindow(final WindowType typeHint);

        WebAlert alert();
    }

}

