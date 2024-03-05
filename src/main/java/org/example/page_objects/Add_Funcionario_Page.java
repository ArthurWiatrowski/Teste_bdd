package org.example.page_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Add_Funcionario_Page {
    @FindBy(how = How.NAME, using = "username")
    public WebElement campoUsuario;

    @FindBy(how = How.NAME, using = "password")
    public WebElement campoSenha;

    @FindBy(how = How.XPATH, using ="//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")
    public WebElement botaoLogin;

    @FindBy(how = How.XPATH, using = "//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/span/img")
    public WebElement menuLateral;

    @FindBy(how =How.XPATH, using =  "//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/ul/li[4]/a")
    public WebElement botaLogOut;

    @FindBy(how = How.XPATH, using = "//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[2]/a")
    public WebElement botaoPim;

    @FindBy(how = How.XPATH, using = "//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[2]")
    public WebElement botaoAddEmploye;

    public Add_Funcionario_Page(WebDriver driver) {PageFactory.initElements(driver,this);}
}

