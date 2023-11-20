package com.mpsc.base.steps.serenity;

import com.mpsc.base.context.Context;
import com.mpsc.base.context.controll.Endpoints;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import java.util.Map;

public class RequisitionApi extends Endpoints {
    static RequestSpecification request;



    public static Response requisicaoSemParametro(String requisicao, String endPoint) {
        RestAssured.baseURI = uri;
        request = RestAssured.given().log().all();
        request.header("Content-Type", "application/json");

        switch (requisicao) {
            case "GET":
                return request.get(endPoint);

            case "DELETE":
                return request.delete(endPoint);

            default:
                System.out.println("****** REQUISIÇÃO INVÁLIDA! ******");
        }

        return null;
    }

    public static Response enviaMetodoComBody(String requisicao, String endPoint, Map<String, String> data) {
        RestAssured.baseURI = uri;
        RequestSpecification request = RestAssured.given().log().all();
        request.header("Content-Type", "application/json");
        request.body(data);

        switch (requisicao) {
            case "POST":
                return request.post(endPoint);

            case "PUT":
                return request.put(endPoint);

            default:
                System.out.println("****** REQUISIÇÃO INVÁLIDA! ******");
        }

        return null;
    }








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

}
