package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class LookupHistoricoPrecos {
  public LookupHistoricoPrecos() throws Exception {
    new SwingEngine(this).render("defaults/LookupHistoricoPrecos.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new LookupHistoricoPrecos();
  }
}
