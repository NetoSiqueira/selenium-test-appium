package test;

import base.BaseSteps;
import org.apache.tools.ant.taskdefs.Sleep;
import org.junit.Assert;
import org.junit.Test;
import page.AlertPage;
import page.MenuPage;

public class Alert extends BaseSteps {
    private MenuPage nav = new MenuPage();
    private AlertPage page = new AlertPage();


    @Test
    public void deveConfirmarAlerta(){
        nav.acessarAlerta();

        page.clicarAlertaConfirm();

        Assert.assertEquals("Info", page.retornarTextoAlerta());
        page.clicarBotaoConfirm();

        Assert.assertEquals("Confirmado", page.retornarMsgAlerta());
        page.clicarBotaoSair();
    }

    @Test
    public void deveClicarForaAlerta(){
        nav.acessarAlerta();

        page.clicarAlertaSimples();
        page.clicarForaCaixa();
        Assert.assertFalse(page.existeElementoPorTexto("Pode clicar no OK ou fora da caixa para sair"));
    }
}
