package com.mpsc.base;

import io.restassured.RestAssured;
import io.cucumber.java.Before;


import static io.restassured.specification.ProxySpecification.host;

public class Hooks {


    /** Esse hook só deve ser executado para exportar os testes para o Jmeter **/

    /**
    @Before
    public void before() {
        RestAssured.proxy = host("127.0.0.1").withPort(8888);
    }
    **/
}
