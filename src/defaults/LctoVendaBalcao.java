package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class LctoVendaBalcao {
  public LctoVendaBalcao() throws Exception {
    new SwingEngine(this).render("defaults/LctoVendaBalcao.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new LctoVendaBalcao();
  }
}
