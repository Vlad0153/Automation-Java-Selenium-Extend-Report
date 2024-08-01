package com.automation.framework.api;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class ApiTests {
    @Test
    public void testGetNavigationUrl() {
        RestAssured.baseURI = "http://example.com/api";
        Response response = given()
                .header("Content-Type", "application/json")
                .body("{ \"request\": \"your request body\" }")
                .when()
                .put("/endpoint")
                .then()
                .statusCode(200)
                .extract()
                .response();

        String navigationUrl = response.jsonPath().getString("navigationUrl");
        // Pass this URL to UI tests or store it for further use
    }
}