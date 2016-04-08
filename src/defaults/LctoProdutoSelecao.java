package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class LctoProdutoSelecao {
  public LctoProdutoSelecao() throws Exception {
    new SwingEngine(this).render("defaults/LctoProdutoSelecao.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new LctoProdutoSelecao();
  }
}
