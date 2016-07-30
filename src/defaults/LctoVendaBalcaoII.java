package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class LctoVendaBalcaoII {
  public LctoVendaBalcaoII() throws Exception {
    new SwingEngine(this).render("defaults/LctoVendaBalcaoII.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new LctoVendaBalcaoII();
  }
}
