package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class LctoPanelItensCarrinho {
  public LctoPanelItensCarrinho() throws Exception {
    new SwingEngine(this).render("defaults/LctoPanelItensCarrinho.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new LctoPanelItensCarrinho();
  }
}
