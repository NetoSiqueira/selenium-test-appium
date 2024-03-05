package page;

import base.BasePage;
import org.openqa.selenium.By;

public class SplashPage extends BasePage {

    private final By form = By.xpath("//*[@text='Formulário']");

    public boolean retornarValorExistente(String valor){
        return existeElementoPorTexto(valor);
    }

    public void aguardarMenu(){
        waitElementVisible(form,5);
    }
    public boolean esperandoRetornoMenu(String valor){
        return existeElementoPorTexto(valor);
    }


}
