package org.twozo.components.driver.service.interactions;

import java.net.URL;

/**
 * <p>
 * A contract defining methods for browser navigation.
 * <p><strong style="color: #0066cc;">Note:</strong> This method performs...</p>
 * </p>
 *
 * @author petchimuthu1520
 * @version 1.0
 */
public interface WebNavigation {

    /**
     * <p>
     * Navigates the browser back.
     * </p>
     */
    void back();

    /**
     * <p>
     * Navigates the browser forward.
     * </p>
     */
    void forward();

    /**
     * <p>
     * Navigates the browser to the specified URL.
     * </p>
     *
     * @param url The URL to navigate to.
     */
    void to(final String url);

    void refresh();
}