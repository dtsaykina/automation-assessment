package org.example.pages.models;

import org.example.pages.PageUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends PageUtils{

    public LoginPage(WebDriver driver){
        super(driver);
    }

    //elements
    By usernameField = By.id("user-name");
    By passwordField = By.id("password");
    By singInBtn = By.id("login-button");

    //actions
    public void signIn(String username, String password){
        driver.findElement(usernameField).sendKeys(username);
        driver.findElement(passwordField).sendKeys(password);
        driver.findElement(singInBtn).click();
    }

    //asserts
    public boolean assertUserIsOnLoginPage(){
        return waitForElementToBeVisible(usernameField);
    }
}
