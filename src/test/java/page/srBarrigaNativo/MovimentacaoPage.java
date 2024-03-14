package page.srBarrigaNativo;

import base.BasePage;
import org.openqa.selenium.By;

public class MovimentacaoPage extends BasePage {
    private final By salvar = By.xpath("//android.widget.TextView[@text=\"SALVAR\"]");
    private final By msgErro = By.xpath("//android.widget.TextView[ends-with(@text, 'obrigatório')]");
    private final By desc = By.xpath("//android.widget.EditText[@text=\"Descrição\"]");
    private final By inte = By.xpath("//android.widget.EditText[@text=\"Interessado\"]");
    private final By valor = By.xpath("//android.widget.EditText[@text=\"Valor\"]");
    private  final By campo = By.xpath("//android.widget.TextView[@resource-id=\"android:id/text1\" and @text=\"Selecione uma conta...\"]");
    private final By conta = By.xpath("//android.widget.CheckedTextView[@text=\"Conta para alterar\"]");
    private final By msgSucesso = By.xpath("//android.widget.TextView[ends-with(@text, 'sucesso')]");

    //Movimentação cadastrada com sucesso

    public void botaoSalvar(){
        clicar(salvar);
    }

    public String mensagemDeErro(){
        return obterValorPorTexto(msgErro);
    }
    public void inserirDescricao(String descricao){
        escrever(desc, descricao);
    }
    public void inserirInteressado(String interessado){
        escrever(inte, interessado);
    }

    public void inserirValor(String val){
        escrever(valor, val);
    }

    public void selecionarConta(){
        clicar(campo);
        clicar(conta);
    }
    public String retornarMsgComSucesso(){
        return obterValorPorTexto(msgSucesso);
    }


}
