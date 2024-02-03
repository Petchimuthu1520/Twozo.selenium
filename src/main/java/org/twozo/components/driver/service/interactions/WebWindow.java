package org.twozo.components.driver.service.interactions;

/**
 * <p>
 * A contract defining methods for interacting with the browser window.
 * </p>
 *
 * @author petchimuthu1520
 * @version 1.0
 */
public interface WebWindow {

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
