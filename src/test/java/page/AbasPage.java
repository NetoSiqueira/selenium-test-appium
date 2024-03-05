package page;

import base.BasePage;
import org.openqa.selenium.By;


public class AbasPage extends BasePage {
    private final By primeiraAba = By.xpath("//android.widget.TextView[@text=\"Este é o conteúdo da Aba 1\"]");
    private final By segundaAba = By.xpath("//android.widget.TextView[@text=\"Este é o conteúdo da Aba 2\"]");
    private final By bntSegundaAba = By.xpath("//android.widget.TextView[@text=\"Aba 2\"]");

    public String retornarTextoDaPrimeiraAba(){
        return obterValorPorTexto(primeiraAba);
    }

    public void clicarSegundaAba(){
        clicar(bntSegundaAba);
    }

    public String retornarTextoDaSegundaAba(){
        return obterValorPorTexto(segundaAba);
    }

}
