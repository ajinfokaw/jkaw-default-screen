package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class LctoPanelItens {
  public LctoPanelItens() throws Exception {
    new SwingEngine(this).render("defaults/LctoPanelItens.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new LctoPanelItens();
  }
}
