package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class LookupTipoCC {
  public LookupTipoCC() throws Exception {
    new SwingEngine(this).render("defaults/LookupTipoCC.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new LookupTipoCC();
  }
}
