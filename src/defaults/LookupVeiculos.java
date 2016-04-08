package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class LookupVeiculos {
  public LookupVeiculos() throws Exception {
    new SwingEngine(this).render("swix/LookupVeiculos.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new LookupVeiculos();
  }
}
