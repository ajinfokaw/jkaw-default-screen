package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class ProdutoPanelSelecao {
  public ProdutoPanelSelecao() throws Exception {
    new SwingEngine(this).render("defaults/ProdutoPanelSelecao.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new ProdutoPanelSelecao();
  }
}
