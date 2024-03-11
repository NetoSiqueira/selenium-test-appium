package page.srBarrigaNativo;

import base.BasePage;
import org.openqa.selenium.By;

public class LoginPage extends BasePage {

    private final By nomeLogin = By.xpath("//android.widget.EditText[@text=\"Nome\"]");
    private final By senhaLogin = By.xpath("//android.widget.EditText[@text=\"Senha\"]");
    private final By bntEntrar = By.xpath("//android.widget.TextView[@text=\"ENTRAR\"]");


    public void inserirEmail(String email){
        waitElementVisible(nomeLogin,5);
        escrever(nomeLogin, email);
    }
    public void inserirSenha(String senha){
        escrever(senhaLogin, senha);
    }

    public void entrar(){
        clicar(bntEntrar);
    }
}
