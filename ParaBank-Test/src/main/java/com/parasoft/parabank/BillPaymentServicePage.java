package com.parasoft.parabank;

import org.openqa.selenium.By;
import utils.PropertyFileReader;
import utils.TestApp;

public class BillPaymentServicePage {
    PropertyFileReader propertyFileReader=new PropertyFileReader();
    String payeeNameElement= propertyFileReader.getProperty("BillPaymentServicePage","payee.name.element");
    String addressElement= propertyFileReader.getProperty("BillPaymentServicePage","address.element");
    String cityElement= propertyFileReader.getProperty("BillPaymentServicePage","city.element");
    String stateElement= propertyFileReader.getProperty("BillPaymentServicePage","state.element");
    String zipCodeElement= propertyFileReader.getProperty("BillPaymentServicePage","zip.code.element");
    String phoneElement= propertyFileReader.getProperty("BillPaymentServicePage","phone.element");
    String accountElement= propertyFileReader.getProperty("BillPaymentServicePage","account.element");
    String verifyAccountElement= propertyFileReader.getProperty("BillPaymentServicePage","verify.account.element");
    String amountElement= propertyFileReader.getProperty("BillPaymentServicePage","amount.element");
    String sendPaymentElement= propertyFileReader.getProperty("BillPaymentServicePage","send.payment.element");
    public BillPaymentServicePage enterPayeeName(String payeeName){
        TestApp.getInstance().waitUntilNextElementAppears(By.name(payeeNameElement),30);
        TestApp.getInstance().setText(By.name(payeeNameElement),payeeName);
        return this;
    }
    public BillPaymentServicePage enterAdders(String address){
        TestApp.getInstance().waitUntilNextElementAppears(By.name(addressElement),30);
        TestApp.getInstance().setText(By.name(addressElement),address);
        return this;
    }
    public BillPaymentServicePage enterCity(String city){
        TestApp.getInstance().waitUntilNextElementAppears(By.name(cityElement),30);
        TestApp.getInstance().setText(By.name(cityElement),city);
        return this;
    }
    public BillPaymentServicePage enterState(String state){
        TestApp.getInstance().waitUntilNextElementAppears(By.name(stateElement),30);
        TestApp.getInstance().setText(By.name(stateElement),state);
        return this;
    }
    public BillPaymentServicePage enterZipCode(String zipCode){
        TestApp.getInstance().waitUntilNextElementAppears(By.name(zipCodeElement),30);
        TestApp.getInstance().setText(By.name(zipCodeElement),zipCode);
        return this;
    }
    public BillPaymentServicePage enterPhoneNumber(String phoneNumber){
        TestApp.getInstance().waitUntilNextElementAppears(By.name(phoneElement),30);
        TestApp.getInstance().setText(By.name(phoneElement),phoneNumber);
        return this;
    }
    public BillPaymentServicePage enterAccountNumber(String accountNumber){
        TestApp.getInstance().waitUntilNextElementAppears(By.name(accountElement),30);
        TestApp.getInstance().setText(By.name(accountElement),accountNumber);
        return this;
    }
    public BillPaymentServicePage enterVerifyAccountNumber(String verifyAccount){
        TestApp.getInstance().waitUntilNextElementAppears(By.name(verifyAccountElement),30);
        TestApp.getInstance().setText(By.name(verifyAccountElement),verifyAccount);
        return this;
    }
    public BillPaymentServicePage enterAmount(String amount){
        TestApp.getInstance().waitUntilNextElementAppears(By.name(amountElement),30);
        TestApp.getInstance().setText(By.name(amountElement),amount);
        return this;
    }
    public BillPaymentServicePage clickOnSendPayment(){
        TestApp.getInstance().waitUntilNextElementAppears(By.xpath(sendPaymentElement),30);
        TestApp.getInstance().clickOnElement(By.xpath(sendPaymentElement));
        return this;
    }
}
