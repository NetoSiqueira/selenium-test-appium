package page;

import base.BasePage;

public class AccordionPage extends BasePage {

    public void selecionarOpc(String texto){
        clicarPorTexto(texto);
    }

    public String retornarTextoAccordion(String texto){
        return retornarTexto(texto);
    }
}
