package test.srBarrigaHib;

import base.BaseSteps;
import org.junit.Test;
import page.MenuPage;
import page.srBarrigaHib.WebViewPage;

public class WebView extends BaseSteps {

    MenuPage nav =  new MenuPage();
    WebViewPage page = new WebViewPage();

    @Test
    public void deveFazerLogin(){
        nav.acessarSrBarrigaHib();
        esperar(3000);
        page.entrarContextoWeb();
        page.fazerLogin("neto@neto.com", "1234");

    }

}
