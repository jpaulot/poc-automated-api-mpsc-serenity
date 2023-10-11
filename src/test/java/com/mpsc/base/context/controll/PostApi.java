package com.mpsc.base.context.controll;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import java.util.Map;

public class PostApi extends Endpoints {
    static RequestSpecification request;

    public static Response enviaMetodoPostComOsDados(String endPoint, Map<String, String> data) {
        RestAssured.baseURI = uri;
        RequestSpecification request = RestAssured.given().log().all();
        request.header("Content-Type", "application/json");
        return request
                .body(data)
                .post(endPoint);
    }

}
