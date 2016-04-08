package rel;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class ListagemProdutoMovto {
  public ListagemProdutoMovto() throws Exception {
    new SwingEngine(this).render("rel/ListagemProdutoMovto.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new ListagemProdutoMovto();
  }
}
