package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class Empresa {
  public Empresa() throws Exception {
    new SwingEngine(this).render("swix/Empresa.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new Empresa();
  }
}
