package org.twozo.components.element.locator;

import org.openqa.selenium.By;

import org.twozo.components.driver.service.WebAutomationDriver;
import org.twozo.components.element.service.WebPageElement;

import java.lang.invoke.SwitchPoint;
import java.util.Collection;

/**
 * Singleton class responsible for locating web page elements based on different locator types.
 */
public final class ElementLocator {

    private static ElementLocator elementLocator;
    private final WebAutomationDriver webAutomationDriver;

    /**
     * Private constructor to enforce singleton pattern.
     *
     * @param webAutomationDriver The WebAutomationDriver instance to be used for element location.
     */
    private ElementLocator(final WebAutomationDriver webAutomationDriver) {
        this.webAutomationDriver = webAutomationDriver;
    }

    /**
     * Gets the singleton instance of ElementLocator.
     *
     * @param webAutomationDriver The WebAutomationDriver instance to be used for element location.
     * @return The ElementLocator instance.
     */
    public static ElementLocator getInstance(final WebAutomationDriver webAutomationDriver) {
        if (elementLocator == null)
            elementLocator = new ElementLocator(webAutomationDriver);

        return elementLocator;
    }

    /**
     * Gets a WebPageElement based on the specified locator type and value.
     *
     * @param locatorType The type of locator (e.g., ID, NAME, XPATH).
     * @param value       The value associated with the locator.
     * @return The WebPageElement located using the specified locator.
     */
    public WebPageElement getWebPageElement(final LocatorType locatorType, final String value) {

        return webAutomationDriver.find().findElement(getByValue(locatorType,value));
    }

    /**
     * Gets a collection of WebPageElements based on the specified locator type and value.
     *
     * @param locatorType The type of locator (e.g., ID, NAME, XPATH).
     * @param value       The value associated with the locator.
     * @return A collection of WebPageElements located using the specified locator.
     */
    public Collection<WebPageElement> getWebPageElements(final LocatorType locatorType, final String value) {

        return webAutomationDriver.find().findElements(getByValue(locatorType,value));
    }

    private By getByValue(final LocatorType locatorType, final String value){

        return switch (locatorType){
            case ID -> By.id(value);
            case NAME -> By.name(value);
            case CLASS_NAME -> By.className(value);
            case XPATH -> By.xpath(value);
            case CSS_SELECTOR -> By.cssSelector(value);
            case LINKED_TEXT -> By.linkText(value);
            case PARTIALLY_LINKED_TEXT -> By.partialLinkText(value);
            case TAG_NAME -> By.tagName(value);
        };
    }
}
