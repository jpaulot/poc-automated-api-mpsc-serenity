package com.mpsc.base.context.controll;

public class Endpoints {

    protected static String uri = "http://localhost:80";
    //protected static String endPointAuthenticate = "/Account/Authenticate"; -- Antiga autenticação antes do SSO
    protected static String endPointAuthenticate = "/AutenticacaoCliente/AutenticarClientePorSenha";
    protected static String endPointGetRestricaoQtdeExamePorEspecialidadeDia = "/Exame/GetRestricaoQtdeExamePorEspecialidadeDia";
    protected static String endPointGetSugestaoAgendamento = "/Unidade/GetSugestaoAgendamento";
    protected static String endPointEfetivarReservaAgendamento = "/Unidade/EfetivarReservaAgendamento";

    protected static String endPointProdutos = "/api/Products";



    }
