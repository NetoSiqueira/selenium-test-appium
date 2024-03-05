package test;

import base.BaseSteps;
import org.junit.Assert;
import org.junit.Test;
import page.AbasPage;
import page.MenuPage;

public class Abas extends BaseSteps {
    private MenuPage nav = new MenuPage();
    private AbasPage page = new AbasPage();

    @Test
    public void interagirSobreAbas(){
        nav.acessarAbas();

        Assert.assertEquals("Este é o conteúdo da Aba 1", page.retornarTextoDaPrimeiraAba());

        page.clicarSegundaAba();
        Assert.assertEquals("Este é o conteúdo da Aba 2", page.retornarTextoDaSegundaAba());
    }

}
