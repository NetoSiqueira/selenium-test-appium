package page.srBarrigaNativo;

import base.BasePage;
import org.openqa.selenium.By;

public class NavegadorPage extends BasePage {

    private final By contas = By.xpath("//android.widget.TextView[@text=\"Contas\"]");
    private final By mov = By.xpath("//android.widget.TextView[@text=\"Mov...\"]");
    private final By reset = By.xpath("//android.widget.TextView[@text=\"RESET\"]");
    private final By resumo = By.xpath("//android.widget.TextView[@text=\"Resumo\"]");
    private final By home = By.xpath("//android.widget.TextView[@text=\"Home\"]");
    public void acessarContas(){
        clicar(contas);
    }

    public void acessarMov(){
        clicar(mov);
    }
    public void resetar(){
        clicar(reset);
    }
    public void acessarResumo(){
        clicar(resumo);
    }
    public void acessarHome(){
        clicar(home);
    }

}
