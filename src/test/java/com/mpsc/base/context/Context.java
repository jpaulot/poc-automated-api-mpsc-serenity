package com.mpsc.base.context;

import io.restassured.response.Response;

public class Context {

    private static Response response;
    private static int statusCode;
    private static String codeAuthorization;

    public static Response getResponse() {
        return response;
    }

    public static void setResponse(Response response) {
        Context.response = response;
    }

    public static int getStatusCode() {
        return statusCode;
    }

    public static void setStatusCode(int statusCode) {
        Context.statusCode = statusCode;
    }

    public static String getCodeAuthorization() {
        return codeAuthorization;
    }

    public static void setCodeAuthorization(String codeAuthorization) {
        Context.codeAuthorization = codeAuthorization;
    }
}
