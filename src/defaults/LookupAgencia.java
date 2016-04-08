package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class LookupAgencia {
  public LookupAgencia() throws Exception {
    new SwingEngine(this).render("swix/LookupAgencia.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new LookupAgencia();
  }
}
