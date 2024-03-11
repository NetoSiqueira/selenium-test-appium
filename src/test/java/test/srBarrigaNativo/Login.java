package test.srBarrigaNativo;

import base.BaseSteps;
import org.junit.Test;
import page.MenuPage;
import page.srBarrigaNativo.LoginPage;

public class Login extends BaseSteps {

    private MenuPage nav = new MenuPage();
    private LoginPage page = new LoginPage();

    @Test
    public void realizarLogin(){
        nav.acessarSrBarrigaNat();

        page.inserirEmail("neto@neto.com");
        page.inserirSenha("1234");
        page.entrar();

    }
}
