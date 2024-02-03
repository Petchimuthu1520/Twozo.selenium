package org.twozo.components.driver.service.interactions;

/**
 * <p>
 * A contract defining methods to interact with browser alerts.
 * </p>
 *
 * @author petchimuthu1520
 * @version 1.0
 */
public interface WebAlert {

    /**
     * <p>
     * Dismisses the alert.
     * </p>
     */
    void dismiss();

    /**
     * <p>
     * Accepts the alert.
     * </p>
     */
    void accept();

    /**
     * <p>
     * Retrieves the text from the alert.
     * </p>
     *
     * @return A string representing the alert text.
     */
    String getText();

    /**
     * <p>
     * Sends keys to the alert.
     * </p>
     *
     * @param keysToSend The keys to send to the alert.
     */
    void sendKeys(final String keysToSend);
}
