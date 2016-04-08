package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class LookupPedidos {
  public LookupPedidos() throws Exception {
    new SwingEngine(this).render("swix/LookupPedidos.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new LookupPedidos();
  }
}
