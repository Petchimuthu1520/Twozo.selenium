package org.twozo.page.SignIn;

import org.twozo.components.driver.service.WebAutomationDriver;
import org.twozo.components.element.locator.ElementLocator;
import org.twozo.components.element.service.WebPageElement;
import org.twozo.components.element.locator.LocatorType;

import org.twozo.page.HomePage;

/**
 * Page class representing the Sign In functionality.
 */
public class SignIn {

    private final WebPageElement fieldEmail;
    private final WebPageElement fieldPassword;
    private final WebPageElement buttonSignIn;
    private final ElementLocator elementLocator;

    public SignIn(final WebAutomationDriver webAutomationDriver) {
        elementLocator = ElementLocator.getInstance(webAutomationDriver);
        fieldEmail = elementLocator.getWebPageElement(LocatorType.NAME, "email");
        fieldPassword = elementLocator.getWebPageElement(LocatorType.NAME, "password");
        buttonSignIn = elementLocator.getWebPageElement(LocatorType.XPATH, "//*[text()='Sign In']");
    }

    /**
     * Sign in with the provided email and password.
     *
     * @param emailId  The email address used for signing in.
     * @param password The password used for signing in.
     * @return HomePage instance representing the landing page after signing in.
     */
    public HomePage signIn(final String emailId, final String password) {
        fieldEmail.interact().sendKeys(emailId);
        fieldPassword.interact().sendKeys(password);
        buttonSignIn.interact().click();

        return new HomePage(elementLocator);
    }
}
