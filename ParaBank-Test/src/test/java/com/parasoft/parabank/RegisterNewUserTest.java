package com.parasoft.parabank;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.TestApp;

public class RegisterNewUserTest {
    WelcomePage welcomePage;
    RegisterPage registerPage;
    AccountRegisterSuccessPage accountRegisterSuccessPage;
    @BeforeMethod
    public void setUp() {
        TestApp.getInstance().openBrowser();
        TestApp.getInstance().navigateToUrl();
        welcomePage=new WelcomePage();
    }

    @Test
    public void testRegisterNewUser() {
        registerPage= welcomePage.clickOnRegister();
        registerPage.enterFirstName("Dasun").enterLastName("Jayashan").enterAddress("Makubura,Kottawa").enterCity("Kottawa").enterState("Makubura").enterZipCode("12345").enterPhoneNumber("0123456789").enterSsnNumber("123").enterUserName("DasunJayashan").enterPassword("Test@1234").enterConfirmPassword("Test@1234").clickOnRegister();
        Assert.assertEquals(accountRegisterSuccessPage.getRegisterSuccessNote(),"Your account was created successfully. You are now logged in.","Failed To Create New User");
    }

    @AfterMethod
    public void tearDown() {
        TestApp.getInstance().closeBrowser();
    }
}
