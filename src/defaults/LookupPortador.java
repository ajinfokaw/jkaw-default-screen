package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class LookupPortador {
  public LookupPortador() throws Exception {
    new SwingEngine(this).render("swix/LookupPortador.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new LookupPortador();
  }
}
