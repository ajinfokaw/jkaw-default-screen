package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class LctoVendaCarrinho {
  public LctoVendaCarrinho() throws Exception {
    new SwingEngine(this).render("defaults/LctoVendaCarrinho.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new LctoVendaCarrinho();
  }
}
