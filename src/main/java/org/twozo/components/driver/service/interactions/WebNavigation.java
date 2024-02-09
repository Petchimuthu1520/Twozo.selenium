package org.twozo.components.driver.service.interactions;

import org.openqa.selenium.WebDriver;

import org.twozo.components.driver.impl.WebNavigationImpl;

/**
 * <p>
 * A contract defining methods for browser navigation.
 * </p>
 *
 * @author petchimuthu1520
 * @version 1.0
 */
public interface WebNavigation {

    static WebNavigation getInstance(final WebDriver.Navigation navigation) {
        return WebNavigationImpl.getInstance(navigation);
    }

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