package org.twozo.components.driver.impl;

import org.openqa.selenium.WebDriver.Navigation;

import org.twozo.components.driver.service.interactions.WebNavigation;

/**
 * Implementation of the WebNavigation interface using Selenium WebDriver Navigation.
 *
 * @author petchimuthu1520
 * @version 1.0
 */
public final class WebNavigationImpl implements WebNavigation {

    private static WebNavigationImpl webNavigation;
    private final Navigation navigation;

    private WebNavigationImpl(final Navigation navigation) {
        this.navigation = navigation;
    }

    public static WebNavigationImpl getInstance(final Navigation navigation) {
        if (webNavigation == null) {
            webNavigation = new WebNavigationImpl(navigation);
        }

        return webNavigation;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void back() {
        navigation.back();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void forward() {
        navigation.forward();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void to(final String url) {
        navigation.to(url);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void refresh() {
        navigation.refresh();
    }
}
