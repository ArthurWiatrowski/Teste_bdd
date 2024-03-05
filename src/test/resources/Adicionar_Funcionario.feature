#language: pt
#encoding: UFT-8

    Funcionalidade: Adicionar Funcionario
        Cenario: Tentativa de adicionar funcionario
            Dado que o usuario esteja logado como admin
            E que ele clique na aba PIM
            E que ele clique em Add Employe
            E que ele preencha todos os campos
            Quando ele clicar em Save
            Então o sistema cadastra um novo funcionario