package org.example.pages.models;

import org.example.pages.PageUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasketPage extends PageUtils{

    public BasketPage(WebDriver driver) {
        super(driver);
    }

    //elements
    By cartList = By.className("cart_list");
    By checkoutBtn = By.id("checkout");


    //actions
    public void proceedToCheckout(){
        driver.findElement(checkoutBtn).click();
    }

    //asserts
    public boolean assertUserIsOnBasketPage(){
        return waitForElementToBeVisible(cartList);
    }

}
