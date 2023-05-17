package org.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
    protected static WebDriver driver;
    protected void setUpDriver() {
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    protected void quitDriver() {
        if (driver != null) {
            driver.quit();
        }
    }
    public WebDriver getDriver(){
        return driver;
    }

}
