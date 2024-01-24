package org.twozo.page.SignIn;

import org.openqa.selenium.By;
import org.twozo.components.web.driver.service.web.WebAutomationDriver;

public class SignIn {
    private final By fieldEmail;
    private final By fieldPassword;
    private final By checkBoxRememberMe;
    private final By buttonSignIn;
    private final By buttonForgotPassword;
    private final By fieldForgottenPassword;
    private final By buttonResetPassword;
    private final By buttonSignUp;
    private final WebAutomationDriver driver;


    public SignIn(WebAutomationDriver webAutomationDriver) {
        this.fieldEmail = By.name("email");
        this.fieldPassword = By.name("password");
        this.checkBoxRememberMe = By.xpath("//*[@type='checkbox']");
        this.buttonSignIn = By.xpath("//*[text()='Sign In']");
        this.buttonForgotPassword = By.xpath("//*[text()='Forgot Password?']");
        this.fieldForgottenPassword = By.id(":r2:");
        this.buttonResetPassword = By.xpath("//*[text()='Reset Password']");
        this.buttonSignUp = By.xpath("//*[text()='Sign Up']");
        this.driver = webAutomationDriver;

    }

    public SignIn signIn(final String emailId, final String password) {
        driver.findElement(fieldEmail).sendKeys(emailId);
        driver.findElement(fieldPassword).sendKeys(password);
        driver.findElement(checkBoxRememberMe).click();
        driver.findElement(buttonSignIn).click();
        return this;
    }
}
