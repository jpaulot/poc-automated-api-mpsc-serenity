package com.mpsc.base.steps.definitionSteps;

import com.mpsc.base.context.controll.GetApi;
import com.mpsc.base.steps.ProdutoSteps;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.restassured.response.Response;
import org.junit.Assert;

public class DefinitionStepsGet {

//    protected static Response response;
//    @Steps
    Response response;

    GetApi getApi = new GetApi();

    ProdutoSteps produtoSteps;


    @Entao("o GET devera retornar o status {int}")
    public void devera_retornar_o_status(int statusResposta) {
        System.out.println(response.asString());
        Assert.assertEquals(statusResposta, response.getStatusCode());
    }

//
//    @Quando("que envio uma requisição GET para o endpoint {string} com os parametros")
//    public void queAcessoOEndpointComOsParametros(String endPoint,Map<String, String> data) {
//        response = getApi.queAcessoOEndpointComOsParametros(endPoint, data);
//    }


    @Dado("que envio uma requisição GET para o endpoint {string}")
    public void requisicaoGetSemParametro(String endPoint) {
//        produtoSteps.requisicaoGetSemParametro(endPoint);
        response = getApi.requisicaoGetSemParametro(endPoint);
    }
}

