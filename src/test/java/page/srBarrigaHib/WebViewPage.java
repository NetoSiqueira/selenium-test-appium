package page.srBarrigaHib;

import base.BasePage;
import org.openqa.selenium.By;

import java.util.Set;

public class WebViewPage extends BasePage {
    private final By emailLogin = By.id("email");
    private final By senhaLogin = By.id("senha");
    private final By bnt_entrar = By.cssSelector(" form > button");

    public void esperar(){
        waitElementVisible(emailLogin,5);
    }
    public void entrarContextoWeb(){
        Set<String> contextHandles = getDriver().getContextHandles();
        for(String valor: contextHandles) {
            System.out.println(valor);
        }
        getDriver().context((String)contextHandles.toArray()[0]);
    }

    public void fazerLogin(String email, String senha){
        escrever(emailLogin, email);
        escrever(senhaLogin, senha);
        clicar(bnt_entrar);
    }

}
