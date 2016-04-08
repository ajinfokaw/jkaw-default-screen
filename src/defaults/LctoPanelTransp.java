package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class LctoPanelTransp {
  public LctoPanelTransp() throws Exception {
    new SwingEngine(this).render("defaults/LctoPanelTransp.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new LctoPanelTransp();
  }
}
