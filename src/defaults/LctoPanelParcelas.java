package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class LctoPanelParcelas {
  public LctoPanelParcelas() throws Exception {
    new SwingEngine(this).render("defaults/LctoPanelParcelas.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new LctoPanelParcelas();
  }
}
