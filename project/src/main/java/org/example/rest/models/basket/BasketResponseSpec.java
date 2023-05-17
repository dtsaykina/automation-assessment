package org.example.rest.models.basket;

import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.specification.ResponseSpecification;

public class BasketResponseSpec {
    public static ResponseSpecification getBasketResponseSpecs(int status) {
        return new ResponseSpecBuilder()
                .expectStatusCode(status)
                .build();
    }

    public static ResponseSpecification addItemsToBasketResponseSpecs(int status) {
        return new ResponseSpecBuilder()
                .expectStatusCode(status)
                .build();
    }
}
