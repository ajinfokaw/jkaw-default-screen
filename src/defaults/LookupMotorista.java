package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class LookupMotorista {
  public LookupMotorista() throws Exception {
    new SwingEngine(this).render("swix/LookupMotorista.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new LookupMotorista();
  }
}
