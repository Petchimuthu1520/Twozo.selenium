package org.twozo.components.web.driver.impl.web;

import org.openqa.selenium.WebDriver;
import org.twozo.components.web.driver.service.web.WebAutomationDriver;

import java.net.URL;

public class NavigationImpl implements WebAutomationDriver.WebNavigation {

    private final WebDriver.Navigation navigation;

    public NavigationImpl(final WebDriver.Navigation navigation) {
        this.navigation = navigation;
    }

    @Override
    public void back() {
        navigation.back();
    }

    @Override
    public void forward() {
        navigation.forward();
    }

    @Override
    public void to(final String url) {
        navigation.to(url);
    }

    @Override
    public void to(final URL url) {
        navigation.to(url);
    }

    @Override
    public void refresh() {
        navigation.refresh();
    }
}
