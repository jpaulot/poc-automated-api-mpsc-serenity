package com.mpsc.base.steps.definitionSteps;

import com.mpsc.base.steps.serenity.RequisitionApi;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.restassured.response.Response;
import org.junit.Assert;

import java.util.Map;

public class DefinitionStepBase {

    private int statusCode;

    Response response;


    @Dado("que envio uma requisição {string} para o endpoint {string}")
    public void requisicaoSemParametro(String requisicao, String endPoint) {
        response = RequisitionApi.requisicaoSemParametro(requisicao, endPoint);
    }

    @Dado("que envio uma requisição {string} para o endpoint {string} com o body:")
    public void enviaMetodoComBody(String requisicao, String endPoint, Map<String, String> data) {
        response = RequisitionApi.enviaMetodoComBody(requisicao, endPoint, data);
    }


    @Entao("devera retornar o status {int}")
    public void devera_retornar_o_status(int statusResposta) {
        System.out.println(response.asString());
        Assert.assertEquals(statusResposta, response.getStatusCode());
    }

}
