package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class EncargoPadrao {
  public EncargoPadrao() throws Exception {
    new SwingEngine(this).render("swix/EncargoPadrao.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new EncargoPadrao();
  }
}
