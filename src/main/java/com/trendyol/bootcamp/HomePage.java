package com.trendyol.bootcamp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HomePage {
    WebDriver webDriver;
    By btnClosePopUpBy = By.cssSelector(".fancybox-item.fancybox-close");
    By btnAccountUserBy = By.className("account-user");
    By btnNotificationCloseBy = By.className("modal-close");
   // By btnMyAccountBy = By.className("user-login-container");
    By btnElektronik = By.xpath("//*[@id=\"navigation-wrapper\"]/nav/ul/li[9]");
    By btnTv = By.xpath("//*[@id=\"sub-nav-5\"]/div/div/div[3]/div[1]/a");


    public HomePage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }


    public void closePopup(){
        webDriver.findElement(btnClosePopUpBy).click();
    }

    public LoginPage clickAccountUser(){
        webDriver.findElement(btnAccountUserBy).click();
        LoginPage loginPage =new LoginPage(webDriver);
        return loginPage;
    }

    public void closeNotification(){
        webDriver.findElement(btnNotificationCloseBy).click();
    }

    public void clickMenu(){
        Actions action = new Actions(webDriver);
        WebElement we = webDriver.findElement(btnElektronik);
        action.moveToElement(we).moveToElement(webDriver.findElement(btnTv)).click().build().perform();
    }
}
