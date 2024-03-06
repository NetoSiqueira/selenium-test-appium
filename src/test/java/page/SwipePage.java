package page;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SwipePage extends BasePage {
    private final By botaoParaDireita = By.xpath("//android.widget.TextView[@text=\"›\"]");
    private final By botaoParaEsquerda = By.xpath("//android.widget.TextView[@text=\"‹\"]");

    public void irParaDireita(){
        clicar(botaoParaDireita);
    }
    public void irParaEsquerda(){
        clicar(botaoParaEsquerda);
    }

    public void swipeListEsquerda(String opcao){
        swipeElement(opcao,0.1,0.9);
    }

    public void swipeListDireita(String opcao){
        swipeElement(opcao,0.9,0.1);
    }
    public void clicarBotaoMais(){
        WebElement botao = getDriver().findElement(By.xpath("//android.widget.TextView[@text='(+)']/.."));
        tap(botao.getLocation().getX() + 10, botao.getLocation().getY());
    }
}
