package org.twozo.components.driver.service.interactions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;

import org.twozo.components.driver.impl.WebTargetLocatorImpl;
import org.twozo.components.driver.service.AlertHandler;
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

    static WebTargetLocator getInstance(final WebDriver driver, final WebDriver.TargetLocator targetLocator) {
        return WebTargetLocatorImpl.getInstance(driver, targetLocator);
    }

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
     * @return A {@link AlertHandler} representing the browser alert.
     */
    AlertHandler alert();
}
