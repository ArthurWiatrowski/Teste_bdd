package org.example.Steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.example.page_objects.Login_Page;


public class LoginSteps {

   private WebDriver driver;
   private Login_Page page;

    @Dado("que o usuario esteja na tela de login")
    public void usuarioNaTela() throws InterruptedException {
        driver = new ChromeDriver();
        page = new Login_Page(driver);
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(2000);
    }

    @Quando("enviar dados de login validos")
    public void EnviarDadosLogin() {
        page.campoUsuario.sendKeys("Admin");
        page.campoSenha.sendKeys("admin123");
        page.botaoLogin.click();
    }

    @Então("o sistema efetua o login e encerra o processo")
    public void encerraProcesso() {
        driver.quit();
    }
}
