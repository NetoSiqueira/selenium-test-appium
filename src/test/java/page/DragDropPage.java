package page;

import base.BasePage;
import org.openqa.selenium.By;

public class DragDropPage extends BasePage {

    private final By listaDragDrop = By.className("android.widget.TextView");

    public void arrastar(String origem, String destino){
        dragDrop(origem,destino);
    }
    public void esperarLista(){
        waitElementVisible(listaDragDrop,5);
    }

    public String[] obterListaDragDrop() {
      return   obterLista(listaDragDrop);
    }


}
