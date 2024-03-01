#language: pt
#econding: UTF-8F

Funcionalidade: Login

  Cenario:Login com sucesso
    Dado que o usuario esteja na tela de login
    Quando enviar dados de login validos
    Então o sistema efetua o login