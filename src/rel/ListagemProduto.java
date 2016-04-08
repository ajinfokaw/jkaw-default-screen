package rel;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class ListagemProduto {
  public ListagemProduto() throws Exception {
    new SwingEngine(this).render("rel/ListagemProduto.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new ListagemProduto();
  }
}
