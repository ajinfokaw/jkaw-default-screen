package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class LctoVendaRapida {
  public LctoVendaRapida() throws Exception {
    new SwingEngine(this).render("defaults/LctoVendaRapida.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new LctoVendaRapida();
  }
}
