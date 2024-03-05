package page;

import base.BasePage;
import org.openqa.selenium.By;

public class AlertPage extends BasePage {
    private final By alertConfirm = By.xpath("//*[@text='ALERTA CONFIRM']");

    private final By alertSimples = By.xpath("//*[@text='ALERTA SIMPLES']");
    private final By alertText = By.id("android:id/alertTitle");
    private final By bntConfirm = By.id("android:id/button2");
    private final By alertMsg = By.id("android:id/message");

    private final By bntSair = By.id("android:id/button1");

    public void clicarAlertaConfirm(){
        clicar(alertConfirm);
    }
    public void clicarAlertaSimples(){
        clicar(alertSimples);
    }

    public String retornarTextoAlerta(){
        return obterValorPorTexto(alertText);
    }

    public void clicarBotaoConfirm(){
        clicar(bntConfirm);
    }

    public String retornarMsgAlerta(){
        return obterValorPorTexto(alertMsg);
    }

    public void clicarBotaoSair(){
        clicar(bntSair);
    }

    public void clicarForaCaixa(){
        waitElementVisible(alertMsg,3);
        tap(125,327);
    }

}
