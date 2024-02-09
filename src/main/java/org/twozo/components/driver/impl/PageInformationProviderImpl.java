package org.twozo.components.driver.impl;

import org.openqa.selenium.WebDriver;

import org.twozo.components.page.PageInformationProvider;

/**
 * Implementation of the PageInformationProvider interface using Selenium WebDriver.
 *
 * @author petchimuthu1520
 * @version 1.0
 */
public final class PageInformationProviderImpl implements PageInformationProvider {

    private static PageInformationProviderImpl pageInformationProvider;
    private final WebDriver driver;

    private PageInformationProviderImpl(final WebDriver driver) {
        this.driver = driver;
    }

    public static PageInformationProviderImpl getInstance(final WebDriver driver) {
        if (pageInformationProvider == null) {
            pageInformationProvider = new PageInformationProviderImpl(driver);
        }

        return pageInformationProvider;
    }

    /**
     * {@inheritDoc}
     *
     * @param url The URL to navigate to.
     */
    @Override
    public void get(final String url) {
        driver.get(url);
    }

    /**
     * {@inheritDoc}
     *
     * @return The current URL of the browser.
     */
    @Override
    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }

    /**
     * {@inheritDoc}
     *
     * @return The title of the current page.
     */
    @Override
    public String getTitle() {
        return driver.getTitle();
    }

    /**
     * {@inheritDoc}
     *
     * @return The source code of the current page.
     */
    @Override
    public String getPageSource() {
        return driver.getPageSource();
    }
}
