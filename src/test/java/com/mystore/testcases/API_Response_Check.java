package com.mystore.testcases;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class API_Response_Check {


    @Test
    public void test06() {

        RestAssured.baseURI="https://httpbin.org/get";
        RestAssured.given().when().get().then().statusCode(200).statusLine("HTTP/1.1 200 OK").log().all();
    }



}
