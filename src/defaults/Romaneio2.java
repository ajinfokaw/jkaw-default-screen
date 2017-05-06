package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class Romaneio2 {
  public Romaneio2() throws Exception {
    new SwingEngine(this).render("defaults/Romaneio2.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new Romaneio2();
  }
}
