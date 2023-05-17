package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class PageUtils {
    protected WebDriver driver;
    protected WebDriverWait wait;

    public PageUtils(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver,Duration.ofSeconds(10));
    }

    public boolean waitForElementToBeClickable(By locator) {
        try {
            WebElement element = driver.findElement(locator);
            wait.until(ExpectedConditions.elementToBeClickable(element));
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public boolean waitForElementToBeVisible(By locator) {
        try {
            WebElement element = driver.findElement(locator);
            wait.until(ExpectedConditions.visibilityOf(element));
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public void navigateTo(String url){
        driver.get(url);
    }
}

