package com.parasoft.parabank;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.TestApp;

public class OpenNewSavingAccountTest {
    WelcomePage welcomePage;
    AccountsOverviewPage accountsOverviewPage;
    OpenNewAccountPage openNewAccountPage;
    @BeforeMethod
    public void setUp() {
        TestApp.getInstance().openBrowser();
        TestApp.getInstance().navigateToUrl();
        welcomePage=new WelcomePage();
        accountsOverviewPage=welcomePage.enterUserName("DasunJayashan").enterPassword("Test@1234").clickOnLogin();
    }

    @Test
    public void testOpenNewSavingAccount() throws InterruptedException {
        openNewAccountPage=accountsOverviewPage.clickOnOpenNewAccount();
        openNewAccountPage.selectAccountType(1).selectAccountNumber(0).clickOnOpenNewAccount();
    }

    @AfterMethod
    public void tearDown() {
        TestApp.getInstance().closeBrowser();
    }
}
