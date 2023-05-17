package org.example.pages.models;

import org.example.pages.PageUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends PageUtils{
    public HomePage( WebDriver driver) {
        super(driver);
    }

    //elements
    By inventoryContainer = By.id("inventory_container");
    By addToCartButton = By.xpath("//button[contains(text(),'Add to cart')]");
    By basketBtn = By.className("shopping_cart_link");

    //actions
    public void addItemsToBasket(){
        driver.findElement(addToCartButton).click();
    }

    public void goToBasket(){
        driver.findElement(basketBtn).click();
    }

    //asserts
    public boolean assertUserIsOnHomePage(){
        return waitForElementToBeVisible(inventoryContainer);
    }

}
