package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class LctoTeleVendas {
  public LctoTeleVendas() throws Exception {
    new SwingEngine(this).render("defaults/LctoTeleVendas.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new LctoTeleVendas();
  }
}
