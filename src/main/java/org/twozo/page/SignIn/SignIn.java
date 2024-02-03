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

    // WebPageElements representing the email field, password field, and sign-in button
    private final WebPageElement fieldEmail;
    private final WebPageElement fieldPassword;
    private final WebPageElement buttonSignIn;

    // ElementLocator for locating elements on the page
    private final ElementLocator elementLocator;

    /**
     * Constructor for the SignIn class.
     *
     * @param webAutomationDriver The WebAutomationDriver instance used for interaction.
     */
    public SignIn(final WebAutomationDriver webAutomationDriver) {
        // Initialize the ElementLocator with the WebAutomationDriver
        elementLocator = ElementLocator.getInstance(webAutomationDriver);

        // Locate email, password, and sign-in button elements
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
        // Enter email and password, then click on the sign-in button
        fieldEmail.interact().sendKeys(emailId);
        fieldPassword.interact().sendKeys(password);
        buttonSignIn.interact().click();

        // Return a new instance of the HomePage
        return new HomePage(elementLocator);
    }
}
