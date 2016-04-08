package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class LookupEncargoPadrao {
  public LookupEncargoPadrao() throws Exception {
    new SwingEngine(this).render("swix/LookupEncargoPadrao.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new LookupEncargoPadrao();
  }
}
