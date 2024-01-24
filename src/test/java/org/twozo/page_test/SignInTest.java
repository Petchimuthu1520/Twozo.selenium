package org.twozo.page_test;

import org.testng.annotations.Test;
import org.twozo.components.driver.Controller;
import org.twozo.page.SignIn.SignIn;
import org.twozo.web_driver_test.DriverControllerForTesting;

public class SignInTest extends DriverControllerForTesting {

    @Test
    public void signInAsValidUser() {
        new SignIn(Controller.getInstance().getWebAutomationDriver()).signIn("a@gmail.com", "Ravi$123");
    }
}



