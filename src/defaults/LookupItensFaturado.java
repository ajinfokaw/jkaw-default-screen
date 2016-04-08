package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class LookupItensFaturado {
  public LookupItensFaturado() throws Exception {
    new SwingEngine(this).render("defaults/LookupItensFaturado.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new LookupItensFaturado();
  }
}
