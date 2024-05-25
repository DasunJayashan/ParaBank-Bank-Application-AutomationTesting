package com.parasoft.parabank;

import org.openqa.selenium.By;
import utils.PropertyFileReader;
import utils.TestApp;

public class AccountsOverviewPage {
    PropertyFileReader propertyFileReader=new PropertyFileReader();
    String logoutElement= propertyFileReader.getProperty("AccountsOverviewPage","logout.element");
    String openNewAccountElement= propertyFileReader.getProperty("AccountsOverviewPage","open.new.account.element");
    String transferFundsElement= propertyFileReader.getProperty("AccountsOverviewPage","transfer.funds.element");
    String billPayElement= propertyFileReader.getProperty("AccountsOverviewPage","bill.pay.element");
    public AccountsOverviewPage clickOnLogout(){
        TestApp.getInstance().waitUntilNextElementAppears(By.linkText(logoutElement),10);
        TestApp.getInstance().clickOnElement(By.linkText(logoutElement));
        return this;
    }
    public OpenNewAccountPage clickOnOpenNewAccount(){
        TestApp.getInstance().waitUntilNextElementAppears(By.linkText(openNewAccountElement),10);
        TestApp.getInstance().clickOnElement(By.linkText(openNewAccountElement));
        return new OpenNewAccountPage();
    }
    public TransferFundsPage clickOnTransferFunds(){
        TestApp.getInstance().waitUntilNextElementAppears(By.linkText(transferFundsElement),10);
        TestApp.getInstance().clickOnElement(By.linkText(transferFundsElement));
        return new TransferFundsPage();
    }
    public BillPaymentServicePage clickOnBillPay(){
        TestApp.getInstance().waitUntilNextElementAppears(By.linkText(billPayElement),10);
        TestApp.getInstance().clickOnElement(By.linkText(billPayElement));
        return new BillPaymentServicePage();
    }

}
