package page.srBarrigaNativo;

import base.BasePage;
import org.openqa.selenium.By;

public class NavegadorPage extends BasePage {

    private final By contas = By.xpath("//android.widget.TextView[@text=\"Contas\"]");
    private final By mov = By.xpath("//android.widget.TextView[@text=\"Mov...\"]");
    private final By reset = By.xpath("//android.widget.TextView[@text=\"RESET\"]");

    public void acessarContas(){
        clicar(contas);
    }

    public void acessarMov(){
        clicar(mov);
    }
    public void resetar(){
        clicar(reset);
    }

}
