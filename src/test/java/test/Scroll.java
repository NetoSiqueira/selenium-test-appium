package test;

import base.BaseSteps;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import page.AlertPage;
import page.MenuPage;

import java.time.Duration;

import static core.DriverFactory.getDriver;

public class Scroll extends BaseSteps {
    AlertPage page = new AlertPage();

    @Test
    public void deveEncontrarOpcaoEscondida(){
        MenuPage nav = new MenuPage();

        nav.scrollParaBaixo("Formulário");

        nav.clicarPorTexto("Opção bem escondida");

        Assert.assertEquals("Você achou essa opção", page.retornarMsgAlerta());
        page.clicarBotaoSair();

    }
}
