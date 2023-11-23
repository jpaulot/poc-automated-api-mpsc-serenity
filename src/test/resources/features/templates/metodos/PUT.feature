# language: pt
# enconding: utf-8
@mpsc
Funcionalidade: Manter Produtos

  Cenario: Alterar Produto
    Dado que envio uma requisição "PUT" para o endpoint "/api/Products/1" com o body:
      | id          | 1                     |
      | name        | Teste - Alteração     |
      | description | Desc Test - Alteração |
      | price       | 123456                |
    Entao devera retornar o status 200