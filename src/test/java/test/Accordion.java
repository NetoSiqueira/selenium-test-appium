package test;

import base.BaseSteps;
import org.junit.Assert;
import org.junit.Test;
import page.AccordionPage;
import page.MenuPage;

public class Accordion extends BaseSteps {

    private MenuPage nav = new MenuPage();
    private AccordionPage page = new AccordionPage();

    @Test
    public void interagirComAccordion(){
        nav.acessarAccordion();
        page.selecionarOpc("Opção 3");

        Assert.assertEquals("Esta é a descrição da opção 3." +
                " Que pode, inclusive ter mais que uma linha", page.retornarTextoAccordion("Esta é a descrição"));

    }
}
