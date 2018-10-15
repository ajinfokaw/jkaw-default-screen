package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class LctoPanelOpcoesItemMLB {
  public LctoPanelOpcoesItemMLB() throws Exception {
    new SwingEngine(this).render("defaults/LctoPanelOpcoesItemMLB.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new LctoPanelOpcoesItemMLB();
  }
}
