package org.example.rest;

import io.cucumber.core.internal.com.fasterxml.jackson.databind.JsonNode;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import static io.restassured.RestAssured.given;

public class RestClient {
    public static JsonNode getRequest(RequestSpecification requestSpec, ResponseSpecification responseSpec) {
        return given()
                .spec(requestSpec)
                .when()
                .get()
                .then()
                .spec(responseSpec)
                .extract()
                .as(JsonNode.class);
    }

    public static JsonNode postRequest(RequestSpecification requestSpec, ResponseSpecification responseSpec) {

        return given()
                .spec(requestSpec)
                .when()
                .post()
                .then()
                .spec(responseSpec)
                .extract()
                .as(JsonNode.class);
    }

    public static JsonNode putRequest(RequestSpecification requestSpec, ResponseSpecification responseSpec) {

        return given()
                .spec(requestSpec)
                .when()
                .put()
                .then()
                .spec(responseSpec)
                .extract()
                .as(JsonNode.class);
    }

    public static JsonNode deleteRequest(RequestSpecification requestSpec, ResponseSpecification responseSpec) {
        return given()
                .spec(requestSpec)
                .when()
                .delete()
                .then()
                .spec(responseSpec)
                .extract()
                .as(JsonNode.class);
    }

}
