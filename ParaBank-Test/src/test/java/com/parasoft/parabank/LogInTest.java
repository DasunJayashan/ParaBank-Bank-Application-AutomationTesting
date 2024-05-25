package com.parasoft.parabank;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.TestApp;

public class LogInTest {
    WelcomePage welcomePage;
    @BeforeMethod
    public void setUp() {
        TestApp.getInstance().openBrowser();
        TestApp.getInstance().navigateToUrl();
        welcomePage=new WelcomePage();
    }

    @Test
    public void testLogIn() {
        welcomePage.enterUserName("DasunJayashan").enterPassword("Test@1234").clickOnLogin();
    }

    @AfterMethod
    public void tearDown() {
        TestApp.getInstance().closeBrowser();
    }
}
