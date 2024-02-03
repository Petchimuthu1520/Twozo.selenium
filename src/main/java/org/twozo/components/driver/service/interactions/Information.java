package org.twozo.components.driver.service.interactions;

/**
 * <p>
 * A contract defining methods to retrieve information about the browser.
 * </p>
 *
 * @author petchimuthu1520
 * @version 1.0
 */
public interface Information {

    /**
     * <p>
     * Navigates the browser to the specified URL.
     * </p>
     *
     * @param url The URL to navigate to.
     */
    void get(final String url);

    /**
     * <p>
     * Retrieves the current URL of the browser.
     * </p>
     *
     * @return A string representing the current URL.
     */
    String getCurrentUrl();

    /**
     * <p>
     * Retrieves the title of the current browser window.
     * </p>
     *
     * @return A string representing the window title.
     */
    String getTitle();

    /**
     * <p>
     * Retrieves the page source of the current browser window.
     * </p>
     *
     * @return A string representing the page source.
     */
    String getPageSource();
}
