package test.srBarrigaNativo;

import base.BaseSteps;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import page.MenuPage;
import page.srBarrigaNativo.ContaPage;
import page.srBarrigaNativo.LoginPage;
import page.srBarrigaNativo.MovimentacaoPage;
import page.srBarrigaNativo.NavegadorPage;

public class Movimentacao extends BaseSteps {
    private MenuPage nav = new MenuPage();
    private LoginPage page = new LoginPage();
    private NavegadorPage menu = new NavegadorPage();
    private MovimentacaoPage mov = new MovimentacaoPage();

    @Before
    public void login(){
        nav.acessarSrBarrigaNat();

        page.inserirEmail("neto@neto.com");
        page.inserirSenha("1234");
        page.entrar();
        menu.resetar();
    }

    @Test
    public void inserirMovimentacao(){
        menu.acessarMov();

        mov.botaoSalvar();
        Assert.assertEquals("Descrição é um campo obrigatório", mov.mensagemDeErro());

        mov.inserirDescricao("teste");
        mov.botaoSalvar();
        Assert.assertEquals("Interessado é um campo obrigatório", mov.mensagemDeErro());

        mov.inserirInteressado("teste");
        mov.botaoSalvar();
        Assert.assertEquals("Valor é um campo obrigatório", mov.mensagemDeErro());

        mov.inserirValor("123");
        mov.botaoSalvar();
        Assert.assertEquals("Conta é um campo obrigatório", mov.mensagemDeErro());

        mov.selecionarConta();
        mov.botaoSalvar();
        Assert.assertEquals("Movimentação cadastrada com sucesso", mov.retornarMsgComSucesso());
    }

    @Test
    public void excluirMovimentacao(){
        menu.acessarResumo();
        mov.selecionarParaExclusao();
        mov.botaoDeletarMov();

        Assert.assertEquals("Movimentação removida com sucesso!", mov.retornarMsgMovExcluida());

        menu.acessarHome();
        mov.scrollParaCima("Conta com movimentacao");

        Assert.assertFalse(mov.obterValorExistente("Conta para movimentacoes"));

    }
}
