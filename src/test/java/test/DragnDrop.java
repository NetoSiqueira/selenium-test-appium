package test;

import base.BaseSteps;
import org.junit.Assert;
import org.junit.Test;
import page.DragDropPage;
import page.MenuPage;

public class DragnDrop  extends BaseSteps {

    MenuPage nav = new MenuPage();
    DragDropPage page = new DragDropPage();

    private String[] estadoInicial = new String[]{"Esta", "é uma lista", "Drag em Drop!", "Faça um clique longo,", "e arraste para", "qualquer local desejado."};
    private String[] estadoIntermediario = new String[]{"é uma lista", "Drag em Drop!", "Faça um clique longo,", "e arraste para", "Esta", "qualquer local desejado."};
    private String[] estadoFinal = new String[]{"Faça um clique longo,", "é uma lista", "Drag em Drop!", "e arraste para", "Esta", "qualquer local desejado."};


    @Test
    public void deveEfetuarDragnDrop(){
        nav.acessarDragDrop();

        page.esperarLista();
//        Assert.assertEquals(estadoInicial, page.obterListaDragDrop());

        page.arrastar("Esta", "e arraste para");
        Assert.assertEquals(estadoIntermediario, page.obterListaDragDrop());

        page.arrastar("Faça um clique longo,", "é uma lista");
        Assert.assertEquals(estadoFinal,page.obterListaDragDrop());

    }
}
