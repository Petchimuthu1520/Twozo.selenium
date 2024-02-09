package org.twozo.components.window;

import org.openqa.selenium.WebDriver;

import org.twozo.components.driver.impl.WebWindowImpl;

/**
 * <p>
 * A contract defining methods for interacting with the browser window.
 * </p>
 *
 * @author petchimuthu1520
 * @version 1.0
 */
public interface WebWindow {

    static WebWindow getInstance(final WebDriver.Window window) {
        return WebWindowImpl.getInstance(window);
    }

    /**
     * <p>
     * Maximizes the browser window.
     * </p>
     */
    void maximize();

    /**
     * <p>
     * Minimizes the browser window.
     * </p>
     */
    void minimize();

    /**
     * <p>
     * Switches the browser window to fullscreen mode.
     * </p>
     */
    void fullscreen();
}
