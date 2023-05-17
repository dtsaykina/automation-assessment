package org.example.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.config.Config;
import org.example.pages.PageUtils;
import org.example.pages.TestBase;
import org.example.pages.models.BasketPage;
import org.example.pages.models.CheckoutPage;
import org.example.pages.models.HomePage;
import org.example.pages.models.LoginPage;
import org.openqa.selenium.WebDriver;

public class BuyItemsSteps {
    private WebDriver driver;
    private PageUtils pageUtils;
    private LoginPage loginPage;
    private HomePage homePage;
    private BasketPage basketPage;
    private CheckoutPage checkoutPage;
    private Config config;

    public BuyItemsSteps(){
        this.driver = new TestBase().getDriver();
        this.pageUtils = new PageUtils(driver);
        this.loginPage = new LoginPage(driver);
        this.homePage = new HomePage(driver);
        this.basketPage = new BasketPage(driver);
        this.checkoutPage = new CheckoutPage(driver);
    }


    @Given("User is on login page")
    public void userIsOnLoginPage() {
        pageUtils.navigateTo(config.getBaseUrl());
        loginPage.assertUserIsOnLoginPage();
    }

    @When("User enters {string} and {string}")
    public void userEntersUsernameAndPassword(String username, String password) {
        loginPage.signIn(username, password);
    }

    @Then("User is redirected to Home Page")
    public void userIsRedirectedToHomePage() {
        homePage.assertUserIsOnHomePage();
    }

    @And("User adds items to basket")
    public void userAddsItemsToBasket(){
        homePage.addItemsToBasket();
        homePage.goToBasket();
    }

    @And("User proceeds to Checkout")
    public void userProceedsToCheckout(){
        basketPage.assertUserIsOnBasketPage();
        basketPage.proceedToCheckout();
    }

    @And("User fills in {string}, {string} and {string}")
    public void userFillsInShippingInfo(String firstname, String lastname, String postalCode){
        checkoutPage.assertUserIsOnCheckoutPage();
        checkoutPage.fillInformationFormAndClickContinue(firstname, lastname, postalCode);
    }

    @Then("User finishes transaction")
    public void userFinishesTransaction(){
        checkoutPage.assertUserIsOnSummaryPage();
        checkoutPage.completeOrder();
    }
}
