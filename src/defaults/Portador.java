package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class Portador {
  public Portador() throws Exception {
    new SwingEngine(this).render("swix/Portador.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new Portador();
  }
}
