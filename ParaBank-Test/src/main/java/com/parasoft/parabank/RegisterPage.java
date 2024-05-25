package com.parasoft.parabank;

import org.openqa.selenium.By;
import utils.PropertyFileReader;
import utils.TestApp;

public class RegisterPage {
    PropertyFileReader propertyFileReader=new PropertyFileReader();
    String firstNameElement= propertyFileReader.getProperty("RegisterPage","first.name.element");
    String lastNameElement= propertyFileReader.getProperty("RegisterPage","last.name.element");
    String addressElement= propertyFileReader.getProperty("RegisterPage","address.element");
    String cityElement= propertyFileReader.getProperty("RegisterPage","city.element");
    String stateElement= propertyFileReader.getProperty("RegisterPage","state.element");
    String zipCodeElement= propertyFileReader.getProperty("RegisterPage","zip.code.element");
    String phoneNumberElement= propertyFileReader.getProperty("RegisterPage","phone.number.element");
    String ssnNumberElement= propertyFileReader.getProperty("RegisterPage","ssn.number.element");
    String userNameElement= propertyFileReader.getProperty("RegisterPage","user.name.element");
    String passwordElement= propertyFileReader.getProperty("RegisterPage","password.element");
    String confirmPasswordElement= propertyFileReader.getProperty("RegisterPage","confirm.password.element");
    String registerElement= propertyFileReader.getProperty("RegisterPage","register.element");
    public RegisterPage enterFirstName(String firstName){
        TestApp.getInstance().waitUntilNextElementAppears(By.id(firstNameElement),10);
        TestApp.getInstance().setText(By.id(firstNameElement),firstName);
        return this;
    }
    public RegisterPage enterLastName(String lastName){
        TestApp.getInstance().waitUntilNextElementAppears(By.id(lastNameElement),10);
        TestApp.getInstance().setText(By.id(lastNameElement),lastName);
        return this;
    }
    public RegisterPage enterAddress(String address){
        TestApp.getInstance().waitUntilNextElementAppears(By.id(addressElement),10);
        TestApp.getInstance().setText(By.id(addressElement),address);
        return this;
    }
    public RegisterPage enterCity(String city){
        TestApp.getInstance().waitUntilNextElementAppears(By.id(cityElement),10);
        TestApp.getInstance().setText(By.id(cityElement),city);
        return this;
    }
    public RegisterPage enterState(String state){
        TestApp.getInstance().waitUntilNextElementAppears(By.id(stateElement),10);
        TestApp.getInstance().setText(By.id(stateElement),state);
        return this;
    }
    public RegisterPage enterZipCode(String zipCode){
        TestApp.getInstance().waitUntilNextElementAppears(By.id(zipCodeElement),10);
        TestApp.getInstance().setText(By.id(zipCodeElement),zipCode);
        return this;
    }
    public RegisterPage enterPhoneNumber(String phoneNumber){
        TestApp.getInstance().waitUntilNextElementAppears(By.id(phoneNumberElement),10);
        TestApp.getInstance().setText(By.id(phoneNumberElement),phoneNumber);
        return this;
    }
    public RegisterPage enterSsnNumber(String ssnNumber){
        TestApp.getInstance().waitUntilNextElementAppears(By.id(ssnNumberElement),10);
        TestApp.getInstance().setText(By.id(ssnNumberElement),ssnNumber);
        return this;
    }
    public RegisterPage enterUserName(String userName){
        TestApp.getInstance().waitUntilNextElementAppears(By.id(userNameElement),10);
        TestApp.getInstance().setText(By.id(userNameElement),userName);
        return this;
    }
    public RegisterPage enterPassword(String password){
        TestApp.getInstance().waitUntilNextElementAppears(By.id(passwordElement),10);
        TestApp.getInstance().setText(By.id(passwordElement),password);
        return this;
    }
    public RegisterPage enterConfirmPassword(String confirmPassword){
        TestApp.getInstance().waitUntilNextElementAppears(By.id(confirmPasswordElement),10);
        TestApp.getInstance().setText(By.id(confirmPasswordElement),confirmPassword);
        return this;
    }
    public AccountRegisterSuccessPage clickOnRegister(){
        TestApp.getInstance().waitUntilNextElementAppears(By.xpath(registerElement),10);
        TestApp.getInstance().clickOnElement(By.xpath(registerElement));
        return new AccountRegisterSuccessPage();
    }
}
