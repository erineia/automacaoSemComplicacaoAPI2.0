#language:pt

Funcionalidade: Realizar Login
  Testes da API de Login

  Cenario: Realizar Login com sucesso
    Dado que tenha um payload valido da API de Login
    Quando envio uma requisicao do tipo POST de Login
    Entao valido que recebo o status 200 no response
    E armazeno o loken que recebo do response do login

  Cenario: Realizar Login com usuario invalido
    Dado que tenha um payload da API Login com as seguintes situacoes
      | email | invalido@gmail.com |
      | senha | 123456             |
    Quando envio uma requisicao do tipo POST de Login
    Entao valido que recebo o status 400 no response

