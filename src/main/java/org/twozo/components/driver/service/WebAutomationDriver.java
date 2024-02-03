package org.twozo.components.driver.service;

import org.twozo.components.driver.service.interactions.*;
import org.twozo.components.element.finders.ElementFinder;

/**
 * <p>
 * A comprehensive interface representing a web automation driver with various interactions.
 * Extends ElementFinder for element finding capabilities.
 * </p>
 *
 * @version 1.0
 * @author petchimuthu1520
 */
public interface WebAutomationDriver extends ElementFinder {

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
    Handler handler();

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
     * @return An Information instance for retrieving browser information.
     */
    Information inform();
}
