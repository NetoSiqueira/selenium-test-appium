package test.srBarrigaNativo;

import base.BaseSteps;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import page.MenuPage;
import page.srBarrigaNativo.ContaPage;
import page.srBarrigaNativo.LoginPage;
import page.srBarrigaNativo.NavegadorPage;

public class Contas extends BaseSteps {
    private MenuPage nav = new MenuPage();
    private LoginPage page = new LoginPage();
    private NavegadorPage menu = new NavegadorPage();
    private ContaPage conta = new ContaPage();

    @Before
    public void login(){
        nav.acessarSrBarrigaNat();

        page.inserirEmail("neto@neto.com");
        page.inserirSenha("1234");
        page.entrar();
        menu.resetar();
    }

    @Test
    public void criarConta(){
        menu.acessarContas();
        conta.inserirConta("teste");
        conta.botaoSalvar();

        Assert.assertEquals("Conta adicionada com sucesso", conta.retornarContaComSucesso());
    }

    @Test
    public void excluirConta(){
        menu.acessarContas();
        conta.escolherContaExcluir();
        conta.botaoExcluir();

        Assert.assertEquals("Conta excluída com sucesso", conta.retornarContaExcluida());
    }
}
