package org.twozo.components.driver.impl;

import org.openqa.selenium.WebDriver;

import org.twozo.components.driver.service.interactions.WebWindow;

/**
 * Implementation of the WebWindow interface using Selenium WebDriver.
 */
final class WebWindowImpl implements WebWindow {

    private final WebDriver.Window window;

    /**
     * Constructs a WebWindowImpl instance with the specified WebDriver.Window.
     *
     * @param window The WebDriver.Window instance to be used.
     */
    public WebWindowImpl(final WebDriver.Window window) {
        this.window = window;
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
