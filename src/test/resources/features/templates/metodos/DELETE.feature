# language: pt
# enconding: utf-8
@mpsc
Funcionalidade: Manter Produtos

  Cenario: Excluir produto por ID (Cenário com falha)
    Dado que envio uma requisição "DELETE" para o endpoint "/api/Products/9"
    Entao devera retornar o status 200