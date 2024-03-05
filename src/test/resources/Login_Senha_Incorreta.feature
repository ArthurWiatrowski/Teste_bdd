#language: pt
#econding: UTF-8F
    Funcionalidade: Login
        Contexto: que o usuario esteja na janela de login
            Cenario: Tentativa de login com a senha errada
                Dado
                E que ele preencha o campo de usuario com um usuario existente
                E que ele preencha o campo de senha com uma senha errada
                Quando ele clicar no botao de login
                Então o sistema retorna uma mensagem de erro e não deixa ele fazer login