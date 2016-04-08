package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class LctoPanelListaNFe {
  public LctoPanelListaNFe() throws Exception {
    new SwingEngine(this).render("defaults/LctoPanelListaNFe.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new LctoPanelListaNFe();
  }
}
