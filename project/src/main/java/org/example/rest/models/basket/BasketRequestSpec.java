package org.example.rest.models.basket;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import org.example.config.Config;
import org.example.rest.Endpoint;

public class BasketRequestSpec {

    private static final String REQUEST_BODY_ADD_ITEMS_FILE_PATH = "src/main/resources/requestBodies/basket/addItemsToBasket.json";

    public static RequestSpecification getBasketRequestSpecs() {
        return new RequestSpecBuilder()
                .setContentType(ContentType.JSON)
                .setBaseUri(Config.getBaseUrl())
                .setBasePath(Endpoint.BASKET.getValue())
                .build();
    }

    public static RequestSpecification addItemsToBasketRequestSpecs() {
        return new RequestSpecBuilder()
                .setAccept("application.json")
                .setBaseUri(Config.getBaseUrl())
                .setBasePath(Endpoint.BASKET.getValue())
                .setBody(REQUEST_BODY_ADD_ITEMS_FILE_PATH)
                .build();
    }

}
