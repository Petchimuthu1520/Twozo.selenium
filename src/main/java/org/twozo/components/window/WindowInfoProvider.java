package org.twozo.components.window;

import org.openqa.selenium.WebDriver;

import org.twozo.components.driver.impl.WindowInfoProviderImpl;

import java.util.Set;


/**
 * <p>
 * A contract defining methods to interact with browser windows.
 * </p>
 *
 * @author petchimuthu1520
 * @version 1.0
 */
public interface WindowInfoProvider {

    static WindowInfoProvider getInstance(final WebDriver driver) {
        return WindowInfoProviderImpl.getInstance(driver);
    }

    /**
     * <p>
     * Retrieves handles of all currently open windows.
     * </p>
     *
     * @return A set of strings representing window handles.
     */
    Set<String> getMultipleWindowHandle();

    /**
     * <p>
     * Retrieves the handle of the currently focused window.
     * </p>
     *
     * @return A string representing the window handle.
     */
    String getWindowHandle();
}
