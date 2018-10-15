package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class LctoPanelTranspCTe {
  public LctoPanelTranspCTe() throws Exception {
    new SwingEngine(this).render("defaults/LctoPanelTranspCTe.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new LctoPanelTranspCTe();
  }
}
