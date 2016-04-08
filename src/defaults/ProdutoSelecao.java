package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class ProdutoSelecao {
  public ProdutoSelecao() throws Exception {
    new SwingEngine(this).render("defaults/ProdutoSelecao.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new ProdutoSelecao();
  }
}
