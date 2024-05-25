package com.parasoft.parabank;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.PropertyFileReader;
import utils.TestApp;

public class AccountRegisterSuccessPage {
    PropertyFileReader propertyFileReader=new PropertyFileReader();
    WebDriver driver= TestApp.getInstance().getDriver();
    String registerSuccessNoteElement= propertyFileReader.getProperty("register.success.note.element","register.success.note.element");
    public String getRegisterSuccessNote(){
        TestApp.getInstance().waitUntilNextElementAppears(By.xpath(registerSuccessNoteElement),10);
        return driver.findElement(By.xpath(registerSuccessNoteElement)).getText();
    }
}
