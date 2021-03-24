package com.trendyol.bootcamp;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class TrendyolTest extends BaseTest {

    @Test
    public void trendyolTest(){
        String password = "123456Aa";
        HomePage homePage = new HomePage(webDriver);
        homePage.closePopup();

        LoginPage loginPage = homePage.clickAccountUser();
        loginPage.clickSignUp();
        loginPage.sendEmail("uxb75754@zwoho.com");

        loginPage.sendPassword(password);
        homePage = loginPage.clickSubmit();
        homePage.closeNotification();
        homePage.clickMenu();




    }

}
