package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class LctoPanelListaOS {
  public LctoPanelListaOS() throws Exception {
    new SwingEngine(this).render("defaults/LctoPanelListaOS.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new LctoPanelListaOS();
  }
}
