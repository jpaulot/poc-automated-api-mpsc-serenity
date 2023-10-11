package com.mpsc.base.context.controll;

import com.mpsc.base.context.Context;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import java.util.Map;

public class GetApi extends Endpoints {
    RequestSpecification request;


    public Response queAcessoOEndpointComOsParametros(String endPoint, Map<String, String> data) {
        RestAssured.baseURI = uri;
        request = RestAssured.given().log().all();
        request.header("Content-Type", "application/json");
        if (Context.getCodeAuthorization() != null){
            request.header("Authorization", Context.getCodeAuthorization());
        }
        request.params(data);
        return request.get(uri + endPoint);
    }

    public Response requisicaoGetSemParametro(String endPoint) {
        RestAssured.baseURI = uri;
        request = RestAssured.given().log().all();
        request.header("Content-Type", "application/json");
        return request.get(endPoint);
    }
}

