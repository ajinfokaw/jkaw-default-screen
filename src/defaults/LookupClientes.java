package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class LookupClientes {
  public LookupClientes() throws Exception {
    new SwingEngine(this).render("swix/LookupClientes.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new LookupClientes();
  }
}
