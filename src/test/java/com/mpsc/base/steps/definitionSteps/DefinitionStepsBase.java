package com.mpsc.base.steps.definitionSteps;

import com.mpsc.base.context.DataBase;
import com.mpsc.base.context.util.MapToHashMap;
import com.mpsc.base.steps.serenity.RequisitionApi;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import org.junit.Assert;

import java.util.Map;

public class DefinitionStepsBase {

    private int statusCode;



    @Dado("que envio uma requisição {string} para o endpoint {string}")
    public void requisicaoSemParametro(String requisicao, String endPoint) {
        DataBase.setResponse(RequisitionApi.requisicaoSemParametro(requisicao, endPoint));
    }

    @Dado("que envio uma requisição {string} para o endpoint {string} com o body:")
    public void enviaMetodoComBody(String requisicao, String endPoint, Map<String, String> data) {
        DataBase.setResponse(RequisitionApi.enviaMetodoComBody(requisicao, endPoint, MapToHashMap.mapToHashMap(data)));
    }


    @Entao("devera retornar o status {int}")
    public void devera_retornar_o_status(int statusResposta) {
        System.out.println("Response: " + DataBase.getResponse().asString());
        Assert.assertEquals(statusResposta, DataBase.getResponse().getStatusCode());
    }

}
