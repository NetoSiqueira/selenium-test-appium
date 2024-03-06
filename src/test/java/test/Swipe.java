package test;

import base.BaseSteps;
import org.junit.Assert;
import org.junit.Test;
import page.MenuPage;
import page.SwipePage;

public class Swipe extends BaseSteps {
    private MenuPage nav = new MenuPage();
    private SwipePage page = new SwipePage();

    @Test
    public void deveRealizarSwipe(){
        nav.acessarSwipe();
        Assert.assertTrue(nav.existeElementoPorTexto("Mova a tela para"));

        nav.swipeDireita();
        Assert.assertTrue(nav.existeElementoPorTexto("E veja se"));

        page.irParaDireita();
        Assert.assertTrue(nav.existeElementoPorTexto("Chegar até o fim!"));

        nav.swipeEsquerda();
        page.irParaEsquerda();
        Assert.assertTrue(nav.existeElementoPorTexto("Mova a tela para"));
    }

    @Test
    public void deveRealizarSwipeList(){
        nav.acessarSwipeList();

        page.swipeListDireita("Opção 1");
        page.clicarBotaoMais();

        Assert.assertTrue(nav.existeElementoPorTexto("Opção 1 (+)"));

        page.swipeListDireita("Opção 4");
        page.clicarPorTexto("(-)");

        Assert.assertTrue(nav.existeElementoPorTexto("Opção 4 (-)"));

        page.swipeListEsquerda("Opção 5 (-)");
        Assert.assertTrue(nav.existeElementoPorTexto("Opção 5"));
    }
}
