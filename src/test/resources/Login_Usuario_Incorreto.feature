#language: pt
#econding: UTF-8F

Funcionalidade: Login
        Cenario: Tentativa de login com usuario incorreto
            Dado que o usuario esteja na aba de login
            E que ele preencha o campo de usuario com um usuario inexistente
            E que ele preencha o campo de senha com uma senha valida
            Quando ele apertar no botao de login
            Então o sistema retorna uma mensagem de erro e não efetua o login
