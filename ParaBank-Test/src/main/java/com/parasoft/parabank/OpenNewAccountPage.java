package com.parasoft.parabank;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import utils.PropertyFileReader;
import utils.TestApp;

public class OpenNewAccountPage {
    PropertyFileReader propertyFileReader=new PropertyFileReader();
    WebDriver driver=TestApp.getInstance().getDriver();
    String accountTypeElement= propertyFileReader.getProperty("OpenNewAccountPage","account.type.element");
    String accountNumberElement= propertyFileReader.getProperty("OpenNewAccountPage","account.number.element");
    String openNewAccountElement= propertyFileReader.getProperty("OpenNewAccountPage","open.new.account.element");
    public OpenNewAccountPage selectAccountType(int index){
        TestApp.getInstance().waitUntilNextElementAppears(By.id(accountTypeElement),10);
        Select dropDownAccountType=new Select(driver.findElement(By.id(accountTypeElement)));
        dropDownAccountType.selectByIndex(index);
        return this;
    }
    public OpenNewAccountPage selectAccountNumber(int index) throws InterruptedException {
        Thread.sleep(1000);
        TestApp.getInstance().waitUntilNextElementAppears(By.id(accountNumberElement),10);
        Select dropDownAccountNumber=new Select(driver.findElement(By.id(accountNumberElement)));
        dropDownAccountNumber.selectByIndex(index);
        return this;
    }
    public OpenNewAccountPage clickOnOpenNewAccount(){
        TestApp.getInstance().waitUntilNextElementAppears(By.xpath(openNewAccountElement),10);
        TestApp.getInstance().clickOnElement(By.xpath(openNewAccountElement));
        return this;
    }
}
