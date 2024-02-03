package org.twozo.components.driver.service.interactions;

import org.openqa.selenium.WindowType;

import org.twozo.components.driver.service.WebAutomationDriver;

/**
 * <p>
 * A contract defining methods for targeting different elements in the browser window.
 * </p>
 *
 * @author petchimuthu1520
 * @version 1.0
 */
public interface WebTargetLocator {

    /**
     * <p>
     * Switches to the specified browser window by its name.
     * </p>
     *
     * @param name The name of the target window.
     * @return A {@link WebAutomationDriver} representing the target window.
     */
    WebAutomationDriver window(final String name);

    /**
     * <p>
     * Opens a new browser window of the specified type.
     * </p>
     *
     * @param windowType The type of the new window to be opened.
     * @return A {@link WebAutomationDriver} representing the new window.
     */
    WebAutomationDriver newWindow(final WindowType windowType);

    /**
     * <p>
     * Switches to the browser alert.
     * </p>
     *
     * @return A {@link WebAlert} representing the browser alert.
     */
    WebAlert alert();
}
