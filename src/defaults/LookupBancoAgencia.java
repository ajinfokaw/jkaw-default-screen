package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class LookupBancoAgencia {
  public LookupBancoAgencia() throws Exception {
    new SwingEngine(this).render("defaults/LookupBancoAgencia.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new LookupBancoAgencia();
  }
}
