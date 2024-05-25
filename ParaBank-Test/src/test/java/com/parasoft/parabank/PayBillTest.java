package com.parasoft.parabank;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.TestApp;

public class PayBillTest {
    WelcomePage welcomePage;
    AccountsOverviewPage accountsOverviewPage;
    BillPaymentServicePage billPaymentServicePage;

    @BeforeMethod
    public void setUp() {
        TestApp.getInstance().openBrowser();
        TestApp.getInstance().navigateToUrl();
        welcomePage=new WelcomePage();
        accountsOverviewPage=welcomePage.enterUserName("DasunJayashan").enterPassword("Test@1234").clickOnLogin();
    }

    @Test
    public void testPayBill() {
        billPaymentServicePage=accountsOverviewPage.clickOnBillPay();
        billPaymentServicePage.enterPayeeName("Test Payee").enterAdders("Test,Address").enterCity("Test City").enterState("Test State").enterZipCode("123").enterPhoneNumber("0123456789").enterAccountNumber("12345").enterVerifyAccountNumber("12345").enterAmount("100").clickOnSendPayment();
    }

    @AfterMethod
    public void tearDown() {
        TestApp.getInstance().closeBrowser();
    }
}
