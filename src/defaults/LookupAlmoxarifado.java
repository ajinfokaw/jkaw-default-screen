package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class LookupAlmoxarifado {
  public LookupAlmoxarifado() throws Exception {
    new SwingEngine(this).render("swix/LookupAlmoxarifado.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new LookupAlmoxarifado();
  }
}
