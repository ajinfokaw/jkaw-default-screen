package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class VendaBalcao {
  public VendaBalcao() throws Exception {
    new SwingEngine(this).render("swix/VendaBalcao.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new VendaBalcao();
  }
}
