package org.example.rest.models.basket;

import org.apache.http.HttpStatus;
import org.example.rest.RestClient;
import io.cucumber.core.internal.com.fasterxml.jackson.databind.JsonNode;

public class BasketAPITestBase {

    public JsonNode getBasket(){
        return RestClient.getRequest(
                BasketRequestSpec.getBasketRequestSpecs(),
                BasketResponseSpec.getBasketResponseSpecs(HttpStatus.SC_OK));
    }

    public void addItemsToBasket(){
        RestClient.postRequest(
                BasketRequestSpec.addItemsToBasketRequestSpecs(),
                BasketResponseSpec.addItemsToBasketResponseSpecs(HttpStatus.SC_CREATED));
    }
}
