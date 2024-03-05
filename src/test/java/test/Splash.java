package test;

import base.BaseSteps;
import org.junit.Assert;
import org.junit.Test;
import page.MenuPage;
import page.SplashPage;

public class Splash  extends BaseSteps {

    MenuPage nav = new MenuPage();
    SplashPage page = new SplashPage();

    @Test
    public void deveAguardarSplashSumir(){
        nav.acessarSplash();

        Assert.assertTrue(page.retornarValorExistente("Splash!"));

        page.aguardarMenu();

        Assert.assertTrue(page.esperandoRetornoMenu("Formulário"));
    }
}
