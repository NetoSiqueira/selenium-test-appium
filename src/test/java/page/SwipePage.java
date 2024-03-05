package page;

import base.BasePage;
import org.openqa.selenium.By;

public class SwipePage extends BasePage {
    private final By botaoParaDireita = By.xpath("//android.widget.TextView[@text=\"›\"]");
    private final By botaoParaEsquerda = By.xpath("//android.widget.TextView[@text=\"‹\"]");

    public void irParaDireita(){
        clicar(botaoParaDireita);
    }
    public void irParaEsquerda(){
        clicar(botaoParaEsquerda);
    }
}
