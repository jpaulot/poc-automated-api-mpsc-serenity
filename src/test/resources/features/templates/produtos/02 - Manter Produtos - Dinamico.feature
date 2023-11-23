# language: pt
# enconding: utf-8
@mpsc
Funcionalidade: Manter Produtos - Dinamico

  Cenario: Cadastrar novo Produto
    Dado que envio uma requisição "POST" para o endpoint "/api/Products" com o body:
      | name        | Teste 02     |
      | description | Desc Test 02 |
      | price       | 002          |
    Entao devera retornar o status 200

  Cenario: Alterar Último Produto Cadastrado
    Dado que envio uma alteração de produto com método "PUT" para o endpoint "/api/Products/"IdUltimoProduto com o body:
      | id          | IdUltimoProduto        |
      | name        | Teste - Alteraçã994    |
      | description | Desc Test - Alteração3 |
      | price       | 123456                 |
    Entao devera retornar o status 200

  Cenario: Excluir Último Produto Cadastrado
    Dado que envio uma exclusão de produto com método "DELETE" para o endpoint "/api/Products/"IdUltimoProduto
    Entao devera retornar o status 200