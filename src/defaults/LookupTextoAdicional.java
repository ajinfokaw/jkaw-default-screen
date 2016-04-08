package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class LookupTextoAdicional {
  public LookupTextoAdicional() throws Exception {
    new SwingEngine(this).render("swix/LookupTextoAdicional.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new LookupTextoAdicional();
  }
}
