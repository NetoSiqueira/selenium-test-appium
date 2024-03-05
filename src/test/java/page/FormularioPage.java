package page;

import base.BasePage;

import io.appium.java_client.MobileBy;
import org.apache.tools.ant.taskdefs.Sleep;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FormularioPage extends BasePage {
    private final  By nomeFormulario =  By.xpath("//android.widget.EditText[@content-desc=\"nome\"]");
    private final By clicarCombo = By.xpath("//android.widget.Spinner[@content-desc=\"console\"]");
    private final By valorCombo = By.xpath("//*[@content-desc=\"console\"]//*[@resource-id=\"android:id/text1\"]");
    private final By checkbox = By.xpath("//*[@content-desc=\"check\"]");
    private final By swit = By.xpath("//*[@content-desc=\"switch\"]");
    private final By bnt = By.xpath("//*[@text=\"SALVAR\"]");
    private final By bntDemorado = By.xpath("//android.widget.TextView[@text=\"SALVAR DEMORADO\"]");
    private final By console =   By.xpath("//*[contains(@text, 'Console:')]");
    private final By switCadastrado = By.xpath("//*[contains(@text, 'Switch:')]");
    private final By checkCadastrado = By.xpath("//*[contains(@text, 'Checkbox:')]");

    private final By nomeCadastrado = By.xpath("//android.widget.TextView[contains(@text, 'Nome:')]");

    private final By seekbar = By.xpath("//android.view.ViewGroup[@content-desc=\"slid\"]");
    public void escreverNome(String nome) {
        escrever(nomeFormulario, nome);
    }

    public String retornarNome(){
        return obterValorPorTexto(nomeFormulario);
    }

    public void selecionarCombo(String combo){
        clicar(clicarCombo);
        clicar(By.xpath("//*[@text='"+combo+"']"));
    }

    public String retornarValorCombo(){
        return obterValorPorTexto(valorCombo);
    }

    public void clicarCheckbox(){
        clicar(checkbox);
    }

    public void clicarSwitch(){
        clicar(swit);
    }

    public boolean retornarOValorClicado(String valor, String condicao){
        return retornarValorClicado(valor, condicao);
    }

    public void botaoSalvar(){
        clicar(bnt);
    }
    public void botaoSalvarDemorado(){
        clicar(bntDemorado);
        waitElementVisible(nomeCadastrado, 5);
    }
    public String obterNomeCadastrado(){

        return obterValorPorTexto(nomeCadastrado);
    }
    public String obterConsoleCadastrado(){
        return obterValorPorTexto(console);
    }

    public String obterSwitchCadastrado(){
        return obterValorPorTexto(switCadastrado);
    }
    public String obterCheckboxCadastrado(){
        return obterValorPorTexto(checkCadastrado);
    }

    public void escolherHora(String horas, String minutos){
        clicar(MobileBy.AccessibilityId(horas));
        clicar(MobileBy.AccessibilityId(minutos));
        clicarPorTexto("OK");
    }

    public void clicarSeekBar(double posicao){
        WebElement seek = getDriver().findElement(seekbar);
        int y =  seek.getLocation().y + (seek.getSize().height/2);
        System.out.println(y);

        int x = (int) (seek.getLocation().x + (seek.getSize().width * posicao));
        System.out.println(x);
        tap(x, y);

    }
}
