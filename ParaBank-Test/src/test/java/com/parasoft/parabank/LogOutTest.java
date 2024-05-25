package com.parasoft.parabank;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.TestApp;

public class LogOutTest {
    WelcomePage welcomePage;
    AccountsOverviewPage accountsOverviewPage;
    @BeforeMethod
    public void setUp() {
        TestApp.getInstance().openBrowser();
        TestApp.getInstance().navigateToUrl();
        welcomePage=new WelcomePage();
        accountsOverviewPage=welcomePage.enterUserName("DasunJayashan").enterPassword("Test@1234").clickOnLogin();
    }

    @Test
    public void testLogOut() {
        accountsOverviewPage.clickOnLogout();
    }

    @AfterMethod
    public void tearDown() {
        TestApp.getInstance().closeBrowser();
    }
}
