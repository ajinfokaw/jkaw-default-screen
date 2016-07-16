package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class LctoPanelItensII {
  public LctoPanelItensII() throws Exception {
    new SwingEngine(this).render("defaults/LctoPanelItensII.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new LctoPanelItensII();
  }
}
