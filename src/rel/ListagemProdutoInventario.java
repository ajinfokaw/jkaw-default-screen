package rel;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class ListagemProdutoInventario {
  public ListagemProdutoInventario() throws Exception {
    new SwingEngine(this).render("rel/ListagemProdutoInventario.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new ListagemProdutoInventario();
  }
}
