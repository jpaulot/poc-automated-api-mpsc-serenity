package com.mpsc.base.steps;

import com.mpsc.base.context.controll.GetApi;
import com.mpsc.base.context.controll.PostApi;
import io.restassured.response.Response;
import org.junit.Assert;

import java.util.Map;

public class ProdutoSteps {


    GetApi getApi;

    Response response;

    public Response enviaMetodoPostComOsDados(String endPoint, Map<String, String> data) {
//        response = PostApi.enviaMetodoPostComOsDados(endPoint, data);
        response = PostApi.enviaMetodoPostComOsDados(endPoint, data);
        System.out.println("Chegou aqui2 +" + response.asString());
        return response;

    }

    public void devera_retornar_o_status(int statusResposta) {
        System.out.println(response.asString());
        Assert.assertEquals(statusResposta, response.getStatusCode());
    }

    public void requisicaoGetSemParametro(String endPoint) {
        response = getApi.requisicaoGetSemParametro(endPoint);

    }
}
