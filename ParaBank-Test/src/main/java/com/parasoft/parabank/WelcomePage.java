package com.parasoft.parabank;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.PropertyFileReader;
import utils.TestApp;

public class WelcomePage {
    PropertyFileReader propertyFileReader=new PropertyFileReader();
    String registerElement= propertyFileReader.getProperty("WelcomePage","register.element");
    String userNameElement= propertyFileReader.getProperty("WelcomePage","user.name.element");
    String passwordElement= propertyFileReader.getProperty("WelcomePage","password.element");
    String loginElement= propertyFileReader.getProperty("WelcomePage","login.element");
    public RegisterPage clickOnRegister(){
        TestApp.getInstance().waitUntilNextElementAppears(By.linkText(registerElement),10);
        TestApp.getInstance().clickOnElement(By.linkText(registerElement));
        return new RegisterPage();
    }
    public WelcomePage enterUserName(String userName){
        TestApp.getInstance().waitUntilNextElementAppears(By.name(userNameElement),10);
        TestApp.getInstance().setText(By.name(userNameElement),userName);
        return this;
    }
    public WelcomePage enterPassword(String password){
        TestApp.getInstance().waitUntilNextElementAppears(By.name(passwordElement),10);
        TestApp.getInstance().setText(By.name(passwordElement),password);
        return this;
    }
    public AccountsOverviewPage clickOnLogin(){
        TestApp.getInstance().waitUntilNextElementAppears(By.xpath(loginElement),10);
        TestApp.getInstance().clickOnElement(By.xpath(loginElement));
        return new AccountsOverviewPage();
    }
}
