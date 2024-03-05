package test;

import base.BaseSteps;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import page.CliquePage;
import page.MenuPage;

public class Clique extends BaseSteps {
    MenuPage nav = new MenuPage();
    CliquePage page = new CliquePage();

    @Before
    public void setup(){
        nav.acessarCliques();
    }

    @Test
    public void deveRealizarCliqueLongo(){
        page.cliqueLongo();
        Assert.assertEquals("Clique Longo", page.retornarValorDoClique());
    }
    @Test
    public void deveRealizarCliqueDuplo(){
        page.clicarPorTexto("Clique duplo");
        page.clicarPorTexto("Clique duplo");
        Assert.assertEquals("Duplo Clique", page.retornarValorDoClique());
    }
}
