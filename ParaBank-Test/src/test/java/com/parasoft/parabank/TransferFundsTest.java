package com.parasoft.parabank;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.TestApp;

public class TransferFundsTest {
    WelcomePage welcomePage;
    AccountsOverviewPage accountsOverviewPage;
    TransferFundsPage transferFundsPage;

    @BeforeMethod
    public void setUp() {
        TestApp.getInstance().openBrowser();
        TestApp.getInstance().navigateToUrl();
        welcomePage=new WelcomePage();
        accountsOverviewPage=welcomePage.enterUserName("DasunJayashan").enterPassword("Test@1234").clickOnLogin();
    }

    @Test
    public void testTransferFunds() throws InterruptedException {
        transferFundsPage=accountsOverviewPage.clickOnTransferFunds();
        transferFundsPage.enterAmount("50").selectToAccount().clickOnSubmit();
    }

    @AfterMethod
    public void tearDown() {
        TestApp.getInstance().closeBrowser();
    }
}
