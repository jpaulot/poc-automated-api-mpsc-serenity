# language: pt
# enconding: utf-8

@mpsc
Funcionalidade: Manter Produtos

  Cenario: Cadastrar novo Produto
    Dado que envio uma requisição "POST" para o endpoint "/api/Products" com o body:
      | name        | Teste     |
      | description | Desc Test |
      | price       | 999       |
    Entao devera retornar o status 200