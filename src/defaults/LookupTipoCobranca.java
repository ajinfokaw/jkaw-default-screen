package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class LookupTipoCobranca {
  public LookupTipoCobranca() throws Exception {
    new SwingEngine(this).render("swix/LookupTipoCobranca.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new LookupTipoCobranca();
  }
}
