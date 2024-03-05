package test;


import base.BaseSteps;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import page.FormularioPage;
import page.MenuPage;



public class Formulario extends BaseSteps {


    private MenuPage menu = new MenuPage();
    private FormularioPage form = new FormularioPage();

    @Before
    public void inicializarDriver(){
      menu.acessarFormulario();

    }



    @Test
    public  void devePrencherTexto(){
        form.escreverNome("Neto");

        Assert.assertEquals("Neto", form.retornarNome());
    }



    @Test
    public  void deveInteragirCombo() {

        form.selecionarCombo("Nintendo Switch");

        Assert.assertEquals("Nintendo Switch", form.retornarValorCombo());
    }

    @Test
    public  void deveInteragirSwitchCheckbox()  {

        form.clicarCheckbox();
        form.clicarSwitch();

        Assert.assertTrue(form.retornarOValorClicado("check", "true"));
        Assert.assertTrue(form.retornarOValorClicado("switch", "false"));
    }

    @Test
    public void desafioCadastrarFormulario()  {

        form.escreverNome("Neto");
        form.selecionarCombo("Nintendo Switch");
        form.clicarCheckbox();
        form.clicarSwitch();
        form.botaoSalvar();

        System.out.println(form.obterNomeCadastrado());

        Assert.assertEquals("Nome: Neto", form.obterNomeCadastrado());
        Assert.assertEquals("Console: switch", form.obterConsoleCadastrado());
        Assert.assertEquals("Switch: Off", form.obterSwitchCadastrado());
        Assert.assertEquals("Checkbox: Marcado", form.obterCheckboxCadastrado());
    }

    @Test
    public void formSalvarDemorado(){
        form.escreverNome("Neto");
        form.selecionarCombo("Nintendo Switch");
        form.clicarCheckbox();
        form.clicarSwitch();
        form.botaoSalvarDemorado();

        Assert.assertEquals("Nome: Neto", form.obterNomeCadastrado());
    }

    @Test
    public void deveAlterarData(){
        form.clicarPorTexto("01/01/2000");
        form.clicarPorTexto("20");
        form.clicarPorTexto("OK");
        Assert.assertTrue(form.existeElementoPorTexto("20/01/2000"));
    }

    @Test
    public void deveAlterarHora(){
        form.clicarPorTexto("09:00");

        form.escolherHora("11", "40");
        Assert.assertTrue(form.existeElementoPorTexto("11:40"));
    }

    @Test
    public void deveInteragirComSeekbar(){
        form.clicarSeekBar(0.65);
    }
}
