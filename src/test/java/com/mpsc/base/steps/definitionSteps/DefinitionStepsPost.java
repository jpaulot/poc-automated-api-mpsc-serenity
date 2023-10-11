package com.mpsc.base.steps.definitionSteps;

import com.mpsc.base.context.controll.PostApi;
import com.mpsc.base.context.controll.PutApi;
import com.mpsc.base.steps.ProdutoSteps;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.restassured.response.Response;
import org.junit.Assert;

import java.util.Map;

public class DefinitionStepsPost {

    private int statusCode;

    Response response;

    ProdutoSteps produtoSteps;

    @Dado("que envio uma requisição POST para o endpoint {string} com os dados")
    public void enviaMetodoPostComOsDados(String endPoint, Map<String, String> data) {
//        produtoSteps.enviaMetodoPostComOsDados(endPoint, data);
        response = PostApi.enviaMetodoPostComOsDados(endPoint, data);
    }

    @Dado("que envio uma requisição PUT para o endpoint {string} com os dados")
    public void enviaMetodoPutComOsDados(String endPoint, Map<String, String> data) {
//        produtoSteps.enviaMetodoPostComOsDados(endPoint, data);
        response = PutApi.enviaMetodoPutComOsDados(endPoint, data);
    }

    @Entao("devera retornar o status {int}")
    public void devera_retornar_o_status(int statusResposta) {
//        produtoSteps.devera_retornar_o_status(statusResposta);
        System.out.println(response.asString());
        Assert.assertEquals(statusResposta, response.getStatusCode());
    }

}
