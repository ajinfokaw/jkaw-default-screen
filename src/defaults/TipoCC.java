package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class TipoCC {
  public TipoCC() throws Exception {
    new SwingEngine(this).render("swix/TipoCC.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new TipoCC();
  }
}
