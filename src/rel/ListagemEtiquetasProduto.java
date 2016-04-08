package rel;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class ListagemEtiquetasProduto {
  public ListagemEtiquetasProduto() throws Exception {
    new SwingEngine(this).render("rel/ListagemEtiquetasProduto.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new ListagemEtiquetasProduto();
  }
}
