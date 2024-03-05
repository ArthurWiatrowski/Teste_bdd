package org.example.Steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Quando;
import org.example.page_objects.Login_Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_Usario_IncorretoSteps {
    WebDriver driver = new ChromeDriver();
    Login_Page page = new Login_Page(driver);
    @Dado("que o usuario esteja na aba de login")
    public void telaLogin() throws InterruptedException {
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(3000);
    }

    @E("que ele preencha o campo de usuario com um usuario inexistente")
    public void preencherUsuario(){
        page.campoUsuario.sendKeys("teste");
    }
    @E("que ele preencha o campo de senha com uma senha valida")
    public void preencherSenha(){
        page.campoSenha.sendKeys("admin123");
    }

    @Quando("ele apertar no botao de login")
    public void botaoLogin(){
        page.botaoLogin.click();
    }
}
