package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class Agencia {
  public Agencia() throws Exception {
    new SwingEngine(this).render("swix/Agencia.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new Agencia();
  }
}
