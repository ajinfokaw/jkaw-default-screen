package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class LctoPanelSelecao {
  public LctoPanelSelecao() throws Exception {
    new SwingEngine(this).render("defaults/LctoPanelSelecao.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new LctoPanelSelecao();
  }
}
