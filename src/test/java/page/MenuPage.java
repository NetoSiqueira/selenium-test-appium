package page;

import base.BasePage;
import org.openqa.selenium.By;

public class MenuPage  extends BasePage {

    private final By form = By.xpath("//*[@text='Formulário']");
    private final By alert = By.xpath("//*[@text='Alertas']");
    private final By splash = By.xpath("//*[@text='Splash']");
    private final By abas = By.xpath("//*[@text='Abas']");
    private final By accordion = By.xpath("//*[@text='Accordion']");

    private final By clique = By.xpath("//*[@text='Cliques']");
    private final By swipe = By.xpath("//*[@text='Swipe']");
    private final By swipeList = By.xpath("//*[@text='Swipe List']");
    private final By drop = By.xpath("//*[@text='Drag and drop']");
    public void acessarFormulario(){
        clicar(form);
    }

    public void acessarSplash(){
        clicar(splash);
    }
    public void acessarAlerta(){
        clicar(alert);
    }
    public void acessarAbas(){
        clicar(abas);
    }

    public void acessarAccordion(){
        clicar(accordion);
    }
    public void acessarCliques(){
        clicar(clique);
    }
    public void acessarSwipe(){
        clicar(swipe);
    }
    public void acessarSwipeList(){
        clicar(swipeList);
    }

    public void acessarDragDrop(){
        scrollParaBaixo("Alertas");
        clicar(drop);
    }

}
