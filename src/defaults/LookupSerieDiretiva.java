package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class LookupSerieDiretiva {
  public LookupSerieDiretiva() throws Exception {
    new SwingEngine(this).render("swix/LookupSerieDiretiva.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new LookupSerieDiretiva();
  }
}
