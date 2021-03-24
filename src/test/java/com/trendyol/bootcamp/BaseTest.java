package com.trendyol.bootcamp;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class BaseTest {

    WebDriver webDriver;

    @BeforeMethod
    public void startUp(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        options.addArguments("--start-maximized");
        WebDriverManager.chromedriver().setup();
        webDriver = new ChromeDriver(options);
        webDriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        webDriver.get("https://www.trendyol.com/");
    }
    @AfterMethod
    public void tearDown() {
        webDriver.quit();
    }
}
