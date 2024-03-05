package org.example.Steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import org.example.page_objects.Add_Funcionario_Page;
import org.example.page_objects.Login_Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Adicionar_FuncionarioSteps {
    WebDriver driver = new ChromeDriver();
    Login_Page pageloing = new Login_Page(driver);
    Add_Funcionario_Page pageAdd = new Add_Funcionario_Page(driver);

    @Dado("que o usuario esteja logado como admin")
    public void logar(){
        pageloing.campoUsuario.sendKeys("Admin");
        pageloing.campoSenha.sendKeys("admin123");
        pageloing.botaoLogin.click();
    }

    @E("que ele clique na aba PIM")
    public void abaPim(){
        pageAdd.botaoPim.click();
    }

    @E("que ele clique em Add Employe")
    public void addEmploye(){
        pageAdd.botaoAddEmploye.click();
    }

    @E("que ")
}
