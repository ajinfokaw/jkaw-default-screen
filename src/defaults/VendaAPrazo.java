package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class VendaAPrazo {
  public VendaAPrazo() throws Exception {
    new SwingEngine(this).render("swix/VendaAPrazo.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new VendaAPrazo();
  }
}
