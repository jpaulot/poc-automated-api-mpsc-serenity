package com.mpsc.base.steps.definitionSteps;

import com.mpsc.base.context.Context;
import com.mpsc.base.context.controll.DeleteApi;
import com.mpsc.base.context.controll.Endpoints;
import com.mpsc.base.context.controll.GetApi;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;

import java.util.Map;

public class DefinitionStepsDelete  extends Endpoints {

    RequestSpecification request;

    Response response;

    DeleteApi deleteApi = new DeleteApi();



    @Dado("que envio uma requisição DELETE para o endpoint {string}")
    public void requisicaoDeleteSemParametro(String endPoint) {
//        produtoSteps.requisicaoGetSemParametro(endPoint);
        response = deleteApi.requisicaoDeleteSemParametro(endPoint);
    }

    @Entao("o DELETE devera retornar o status {int}")
    public void o_delete_devera_retornar_o_status(int statusResposta) {
        System.out.println(response.asString());
        Assert.assertEquals(statusResposta, response.getStatusCode());
    }
}
