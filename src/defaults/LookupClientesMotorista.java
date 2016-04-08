package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class LookupClientesMotorista {
  public LookupClientesMotorista() throws Exception {
    new SwingEngine(this).render("defaults/LookupClientesMotorista.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new LookupClientesMotorista();
  }
}
