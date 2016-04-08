package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class LookupEstado {
  public LookupEstado() throws Exception {
    new SwingEngine(this).render("swix/LookupEstado.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new LookupEstado();
  }
}
