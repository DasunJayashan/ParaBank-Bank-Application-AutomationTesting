package com.parasoft.parabank;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import utils.PropertyFileReader;
import utils.TestApp;

public class TransferFundsPage {
    PropertyFileReader propertyFileReader=new PropertyFileReader();
    WebDriver driver=TestApp.getInstance().getDriver();
    String amountElement= propertyFileReader.getProperty("TransferFundsPage","amount.element");
    String toAccountElement= propertyFileReader.getProperty("TransferFundsPage","to.account.element");
    String submitElement= propertyFileReader.getProperty("TransferFundsPage","submit.element");
    public TransferFundsPage enterAmount(String amount) throws InterruptedException {
        TestApp.getInstance().waitUntilNextElementAppears(By.id(amountElement),30);
        Thread.sleep(3000);
        TestApp.getInstance().setText(By.id(amountElement),amount);
        return this;
    }
    public TransferFundsPage selectToAccount(){
        TestApp.getInstance().waitUntilNextElementAppears(By.id(toAccountElement),30);
        Select dropDownAccountNumbers=new Select(driver.findElement(By.id(toAccountElement)));
        dropDownAccountNumbers.selectByIndex(1);
        return this;
    }
    public TransferFundsPage clickOnSubmit(){
        TestApp.getInstance().waitUntilNextElementAppears(By.xpath(submitElement),30);
        TestApp.getInstance().clickOnElement(By.xpath(submitElement));
        return this;
    }
}
