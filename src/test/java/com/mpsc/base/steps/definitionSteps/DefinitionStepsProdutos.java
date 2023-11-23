package com.mpsc.base.steps.definitionSteps;

import com.mpsc.base.context.DataBase;
import com.mpsc.base.context.util.MapToHashMap;
import com.mpsc.base.steps.serenity.RequisitionApi;
import io.cucumber.java.pt.Dado;
import io.restassured.response.Response;

import java.util.HashMap;
import java.util.Map;

public class DefinitionStepsProdutos {


    @Dado("que envio uma alteração de produto com método {string} para o endpoint {string}IdUltimoProduto com o body:")
    public void alteracaoProdutoComBody(String requisicao, String endPoint, Map<String, String> data) {
        HashMap body = new HashMap<>(data);
        body.put("id", DataBase.getResponse().path("id"));
        endPoint = endPoint+DataBase.getResponse().path("id");
        DataBase.setResponse(RequisitionApi.enviaMetodoComBody(requisicao, endPoint, MapToHashMap.mapToHashMap(body)));
    }

    @Dado("que envio uma exclusão de produto com método {string} para o endpoint {string}IdUltimoProduto")
    public void excusaoProduto(String requisicao, String endPoint) {
        endPoint = endPoint+DataBase.getResponse().path("id");
        DataBase.setResponse(RequisitionApi.requisicaoSemParametro(requisicao, endPoint));
    }
}
