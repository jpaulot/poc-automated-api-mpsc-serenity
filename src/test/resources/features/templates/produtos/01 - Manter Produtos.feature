# language: pt
# enconding: utf-8
@template
Funcionalidade: Manter Produtos

  Cenario: Cadastrar novo Produto
    Dado que envio uma requisição "POST" para o endpoint "/api/Products" com o body:
      | name        | Teste     |
      | description | Desc Test |
      | price       | 999       |
    Entao devera retornar o status 200

  Cenario: Alterar Produto
    Dado que envio uma requisição "PUT" para o endpoint "/api/Products/1" com o body:
      | id          | 1                     |
      | name        | Teste - Alteração     |
      | description | Desc Test - Alteração |
      | price       | 123456                |
    Entao devera retornar o status 200

  Cenario: Pesquisar produto por ID
    Dado que envio uma requisição "GET" para o endpoint "/api/Products/1"
    Entao devera retornar o status 200

  Cenario: Excluir produto por ID (Cenário com falha)
    Dado que envio uma requisição "DELETE" para o endpoint "/api/Products/2"
    Entao devera retornar o status 400

  Cenario: Listar Todos os Produtos
    Dado que envio uma requisição "GET" para o endpoint "/api/Products"
    Entao devera retornar o status 200

