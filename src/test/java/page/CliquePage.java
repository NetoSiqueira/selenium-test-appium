package page;

import base.BasePage;
import com.google.common.collect.ImmutableMap;
import io.appium.java_client.TouchAction;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.remote.RemoteWebElement;


public class CliquePage extends BasePage {

    private final By cliqueLongo = By.xpath("//android.widget.TextView[@text=\"Clique Longo\"]");
    private final By retornarMsg = By.xpath("(//android.widget.TextView)[3]");
    private final By cliqueDuplo = By.xpath("//android.widget.TextView[@text=\"Clique duplo\"]");

    public void cliqueLongo(){
       clicarLongo(cliqueLongo);
    }

    public String retornarValorDoClique(){
        return obterValorPorTexto(retornarMsg);
    }

}
