package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class LookupVendedores {
  public LookupVendedores() throws Exception {
    new SwingEngine(this).render("swix/LookupVendedores.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new LookupVendedores();
  }
}
