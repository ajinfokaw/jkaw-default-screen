package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class LookupDiretiva {
  public LookupDiretiva() throws Exception {
    new SwingEngine(this).render("swix/LookupDiretiva.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new LookupDiretiva();
  }
}
