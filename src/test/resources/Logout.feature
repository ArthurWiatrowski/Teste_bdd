#language: pt
#econding: UTF-8F

    Funcionalidade: Fazer logout
        Cenario: logout
            Dado que o usuario tenha feito login
            Quando ele realiza o processo de logout
            Então o sistema efetua o logout e encerra o processo