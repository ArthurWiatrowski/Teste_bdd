package org.example;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginSteps {

   private WebDriver driver;

    @Dado("que o usuario esteja na tela de login")
    public void usuarioNaTela() {
    driver = new ChromeDriver();
    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    @Quando("enviar dados de login validos")
    public void EnviarDadosLogin() {

    }

    @Então("o sistema efetua o login")
    public void oSistemaEfetuaOLogin() {
    }

}
