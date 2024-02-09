package org.twozo.components.driver.impl;

import org.openqa.selenium.WebDriver;

import org.twozo.components.window.WindowInfoProvider;

import java.util.Set;

/**
 * Implementation of the WindowInfoProvider interface providing methods to handle browser window interactions.
 *
 * @version 1.0
 * @author petchimuthu1520
 */
public class WindowInfoProviderImpl implements WindowInfoProvider {

    private static WindowInfoProviderImpl windowInfoProvider;
    private final WebDriver driver;


    private WindowInfoProviderImpl(final WebDriver driver){
        this.driver = driver;
    }

    public static WindowInfoProviderImpl getInstance(final WebDriver driver){
        if(windowInfoProvider == null){
            windowInfoProvider =  new WindowInfoProviderImpl(driver);
        }

        return windowInfoProvider;
    }

    /**
     * {@inheritDoc}
     *
     * @return A set of window handles for multiple browser windows.
     */
    @Override
    public Set<String> getMultipleWindowHandle() {
        return driver.getWindowHandles();
    }

    /**
     * {@inheritDoc}
     *
     * @return The handle of the current browser window.
     */
    @Override
    public String getWindowHandle() {
        return driver.getWindowHandle();
    }
}
