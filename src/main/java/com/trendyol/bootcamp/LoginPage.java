package com.trendyol.bootcamp;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver webDriver;
    By btnsignUp = By.cssSelector(".q-button.tab.button.right");
    By txtemailBy = By.id("register-email");
    By txtPasswordBy = By.id("register-password-input");
    By btnSubmitBy = By.cssSelector(".q-button-medium.q-button.submit");

    public LoginPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void clickSignUp(){
        webDriver.findElement(btnsignUp).click();
    }

    public void sendEmail(String email){
        webDriver.findElement(txtemailBy).sendKeys(email);
    }



    public void sendPassword(String s){
        webDriver.findElement(txtPasswordBy).sendKeys(s);
    }

    public HomePage clickSubmit(){
        webDriver.findElement(btnSubmitBy).click();
        HomePage homePage = new HomePage(webDriver);
        return homePage;
    }

}
