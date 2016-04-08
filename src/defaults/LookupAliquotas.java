package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class LookupAliquotas {
  public LookupAliquotas() throws Exception {
    new SwingEngine(this).render("swix/LookupAliquotas.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new LookupAliquotas();
  }
}
