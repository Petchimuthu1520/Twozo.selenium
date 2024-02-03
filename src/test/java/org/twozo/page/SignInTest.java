package org.twozo.page;

import org.testng.annotations.Test;

import org.twozo.page.SignIn.SignIn;
import org.twozo.web_driver_test.DriverControllerForTesting;

public class SignInTest extends DriverControllerForTesting {

    @Test
    public void signInAsValidUser() {
        new SignIn(driver).signIn("a@gmail.com", "Ravi$123");
        //Assert.assertEquals();
    }
}




