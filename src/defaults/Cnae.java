package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class Cnae {
  public Cnae() throws Exception {
    new SwingEngine(this).render("swix/Cnae.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new Cnae();
  }
}
