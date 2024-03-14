package page.srBarrigaNativo;

import base.BasePage;
import org.openqa.selenium.By;

public class ContaPage extends BasePage {
    private final By conta = By.xpath("//android.widget.EditText[@text=\"Conta\"]");
    private final By salvar = By.xpath("//android.widget.TextView[@text=\"SALVAR\"]");
    private final By excluir = By.xpath("//android.widget.TextView[@text=\"EXCLUIR\"]");
    private final By msgContaCriaSucesso = By.xpath("//android.widget.TextView[@text=\"Conta adicionada com sucesso\"]");
    private final By contaExcluir = By.xpath("//android.widget.TextView[@text=\"Conta mesmo nome\"]");
    private final By msgContaExluidaSucesso = By.xpath("//android.widget.TextView[@text=\"Conta excluída com sucesso\"]");


    public void inserirConta(String nome){
        escrever(conta, nome);
    }
    public void botaoSalvar(){
        clicar(salvar);
    }

    public String retornarContaComSucesso (){
        return obterValorPorTexto(msgContaCriaSucesso);
    }

    public void escolherContaExcluir(){
        clicarLongo(contaExcluir);
    }

    public void botaoExcluir(){
        clicar(excluir);
    }
    public String retornarContaExcluida(){
        return obterValorPorTexto(msgContaExluidaSucesso);
    }

}
