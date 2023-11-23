package com.mpsc.base.steps.serenity;

import com.mpsc.base.context.DataBase;
import com.mpsc.base.context.controll.Endpoints;
import com.mpsc.base.context.util.MapToHashMap;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import java.util.HashMap;
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

    public static Response enviaMetodoComBody(String requisicao, String endPoint, HashMap<String, String> body) {
        RestAssured.baseURI = uri;
        RequestSpecification request = RestAssured.given().log().all();
        Response response = null;

        request.header("Content-Type", "application/json");
        request.body(MapToHashMap.mapToHashMap(body));

        switch (requisicao) {
            case "POST":
                return request.post(endPoint);

            case "PUT":
                return request.put(endPoint);

            case "GET":
                return request.get(endPoint);

            default:
                System.out.println("****** REQUISIÇÃO INVÁLIDA: " + requisicao + " ******");
        }

        return response;
    }


    public Response queAcessoOEndpointComOsParametros(String endPoint, Map<String, String> data) {
        RestAssured.baseURI = uri;
        request = RestAssured.given().log().all();
        request.header("Content-Type", "application/json");
        if (DataBase.getCodeAuthorization() != null) {
            request.header("Authorization", DataBase.getCodeAuthorization());
        }
        request.params(data);
        return request.get(uri + endPoint);
    }

}
