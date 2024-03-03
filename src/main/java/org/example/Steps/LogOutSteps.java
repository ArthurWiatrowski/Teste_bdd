package org.example.Steps;

import org.openqa.selenium.WebDriver;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import org.openqa.selenium.chrome.ChromeDriver;
import org.example.page_objects.Login_Page;


public class LogOutSteps {
    WebDriver driver = new ChromeDriver();
     Login_Page loginPage = new Login_Page(driver);

    @Dado("que o usuario tenha feito login")
    public void logIn() throws InterruptedException {
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(5000);
        loginPage.campoUsuario.sendKeys("Admin");
        loginPage.campoSenha.sendKeys("admin123");
        loginPage.botaoLogin.click();
        Thread.sleep(3000);
    }

   @Quando("ele realiza o processo de logout")
    public void logOut(){
        loginPage.menuLateral.click();
        loginPage.botaLogOut.click();

   }

   @Então("o sistema efetua o logout e encerra o processo")
    public void fehcaProcesso(){
        driver.quit();
   }


}
