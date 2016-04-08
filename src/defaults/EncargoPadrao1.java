package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class EncargoPadrao1 {
  public EncargoPadrao1() throws Exception {
    new SwingEngine(this).render("swix/EncargoPadrao1.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new EncargoPadrao1();
  }
}
