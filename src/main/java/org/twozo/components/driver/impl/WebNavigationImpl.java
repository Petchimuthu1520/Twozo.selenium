package org.twozo.components.driver.impl;

import org.openqa.selenium.WebDriver.Navigation;

import org.twozo.components.driver.service.interactions.WebNavigation;

/**
 * Implementation of the WebNavigation interface using Selenium WebDriver Navigation.
 *
 * @version 1.0
 * @author petchimuthu1520
 *
 */
final class WebNavigationImpl implements WebNavigation {

    private final Navigation navigation;

    /**
     * Constructs a WebNavigationImpl instance with the specified WebDriver Navigation.
     *
     * @param navigation The WebDriver Navigation instance to be used.
     */
    public WebNavigationImpl(final Navigation navigation) {
        this.navigation = navigation;
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
