package org.twozo.components.driver.service;

import org.openqa.selenium.WebDriver;

import org.twozo.components.driver.impl.WebAutomationDriverImpl;
import org.twozo.components.driver.service.interactions.WebNavigation;
import org.twozo.components.driver.service.interactions.WebTargetLocator;
import org.twozo.components.element.finders.ElementFinder;
import org.twozo.components.page.PageInformationProvider;
import org.twozo.components.window.WebWindow;
import org.twozo.components.window.WindowInfoProvider;

/**
 * <p>
 * A comprehensive interface representing a web automation driver with various interactions.
 * Extends ElementFinder for element finding capabilities.
 * </p>
 *
 * @author petchimuthu1520
 * @version 1.0
 */
public interface WebAutomationDriver {

    static WebAutomationDriver getInstance(final WebDriver driver) {
        return WebAutomationDriverImpl.getInstance(driver);
    }

    /**
     * <p>
     * Closes the current browser window.
     * </p>
     */
    void close();

    /**
     * <p>
     * Quits the driver, closing all associated browser windows.
     * </p>
     */
    void quit();

    /**
     * <p>
     * Retrieves a handler for managing browser window handles.
     * </p>
     *
     * @return A handler for managing browser window handles.
     */
    WindowInfoProvider handler();

    /**
     * <p>
     * Switches the driver to a different context, such as a window or frame.
     * </p>
     *
     * @return A WebTargetLocator for navigating to different contexts.
     */
    WebTargetLocator switchTo();

    /**
     * <p>
     * Retrieves a navigator for various browser navigation actions.
     * </p>
     *
     * @return A WebNavigation instance for browser navigation.
     */
    WebNavigation navigate();

    /**
     * <p>
     * Retrieves a window manager for controlling browser window actions.
     * </p>
     *
     * @return A WebWindow instance for managing browser windows.
     */
    WebWindow window();

    /**
     * <p>
     * Provides methods for finding web elements.
     * </p>
     *
     * @return An ElementFinder instance for locating web elements.
     */
    ElementFinder find();

    /**
     * <p>
     * Provides information about the current state of the browser.
     * </p>
     *
     * @return An PageInformationProvider instance for retrieving browser information.
     */
    PageInformationProvider inform();
}
