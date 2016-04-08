package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class LookupTransportador {
  public LookupTransportador() throws Exception {
    new SwingEngine(this).render("swix/LookupTransportador.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new LookupTransportador();
  }
}
