package org.example.Steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Quando;
import org.example.page_objects.Login_Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_Senha_IncorretaSteps {
    WebDriver driver = new ChromeDriver();
    Login_Page page = new Login_Page(driver);

    @Dado("que o usuario esteja na janela de login")
    public void usuarioNaTela() throws InterruptedException {
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(3000);
    }

    @E("que ele preencha o campo de usuario com um usuario existente")
    public void preencherUsuario(){
        page.campoUsuario.sendKeys("Admin");
    }

    @E("que ele preencha o campo de senha com uma senha errada")
    public void preencherSenha(){
        page.campoSenha.sendKeys("teste");
    }

    @Quando("ele clicar no botao de login")
    public void clicarBotaoLogin() {
        page.botaoLogin.click();
    }
}
