# language: pt
# enconding: utf-8
@template
Funcionalidade: Manter Produtos

  Cenario: Utilização de GET simples
    Dado que envio uma requisição "GET" para o endpoint "/api/Products/1"
    Entao devera retornar o status 200


  Cenario: Utilização de GET com Body
    Dado que envio uma requisição "GET" para o endpoint "/api/Products/" com o body:
      | id          | 2                     |
      | name        | Teste - Alteração     |
    Entao devera retornar o status 200