package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class TipoCobranca {
  public TipoCobranca() throws Exception {
    new SwingEngine(this).render("swix/TipoCobranca.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new TipoCobranca();
  }
}
