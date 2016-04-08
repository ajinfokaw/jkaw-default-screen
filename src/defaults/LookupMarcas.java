package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class LookupMarcas {
  public LookupMarcas() throws Exception {
    new SwingEngine(this).render("swix/LookupMarcas.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new LookupMarcas();
  }
}
