package com.mpsc.base.context.controll;

import com.mpsc.base.context.Context;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import java.util.Map;

public class DeleteApi extends Endpoints {
    RequestSpecification request;


    public Response requisicaoDeleteSemParametro(String endPoint) {
        RestAssured.baseURI = uri;
        request = RestAssured.given().log().all();
        request.header("Content-Type", "application/json");
        return request.delete(endPoint);
    }


}
