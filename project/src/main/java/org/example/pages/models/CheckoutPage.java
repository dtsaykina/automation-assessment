package org.example.pages.models;

import org.example.pages.PageUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage extends PageUtils {

    public CheckoutPage(WebDriver driver) {
        super(driver);
    }

    //elements
    By informationInputForm = By.className("checkout_info");
    By firstNameField = By.id("first-name");
    By lastNameField = By.id("last-name");
    By postalCodeField = By.id("postal-code");
    By continueBtn = By.id("continue");
    By summaryInfo = By.id("summary_info");
    By finishBtn = By.id("finish");

    //actions
    public void fillInformationFormAndClickContinue(String firstName, String lastName, String postalCode) {
        driver.findElement(firstNameField).sendKeys(firstName);
        driver.findElement(lastNameField).sendKeys(lastName);
        driver.findElement(postalCodeField).sendKeys(postalCode);
        driver.findElement(continueBtn).click();
    }

    public void completeOrder() {
        driver.findElement(finishBtn).click();
    }

    //asserts
    public boolean assertUserIsOnCheckoutPage() {
        return waitForElementToBeVisible(informationInputForm);
    }

    public boolean assertUserIsOnSummaryPage() {
        return waitForElementToBeVisible(summaryInfo);
    }
}


