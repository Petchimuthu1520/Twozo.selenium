package org.twozo.components.driver.impl;

import org.openqa.selenium.WebDriver;

import org.twozo.components.window.WebWindow;

/**
 * Implementation of the WebWindow interface using Selenium WebDriver.
 */
public class WebWindowImpl implements WebWindow {

    private static WebWindowImpl webWindow;
    private final WebDriver.Window window;

    private WebWindowImpl(final WebDriver.Window window) {
        this.window = window;
    }

    public static WebWindowImpl getInstance(final WebDriver.Window window) {
        if (webWindow == null) {
            webWindow = new WebWindowImpl(window);
        }

        return webWindow;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void maximize() {
        window.maximize();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void minimize() {
        window.minimize();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void fullscreen() {
        window.fullscreen();
    }
}
